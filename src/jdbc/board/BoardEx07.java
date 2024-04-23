package jdbc.board;

import java.sql.*;
import java.util.Scanner;

// Step 7. Read - Delete 기능 추가
public class BoardEx07 {

//  필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

//  생성자


    public BoardEx07() {
//      인스턴스 생성되면서 객체 연결하고 예외가 생기면 메시지 출력 후 종료
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        try {

            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
    }

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------");
        System.out.println(String.format("%-6s%-12s%-16s%-40s", "No.", "Writer", "Date", "Title"));
        System.out.println("-------------------------------------------------");

//      DB 게시판 테이블에서 역순 정렬하여 출력하기
        String sql = "SELECT boardNo, title, content, writer, date FROM boards ORDER BY boardNo DESC";

//      SQL 명령문 및 결과 셋 자원 생성 및 정리
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery();) {

            while (rs.next()) {

//              결과 셋에서 행마다 게시글 객체 생성
                Board board = new Board(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5));

//              행마다 출력
                System.out.println(String.format("%-6s%-12s%-16s%-40s", board.getBoardNo(), board.getWriter(), board.getDate(), board.getTitle()));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        mainMenu(); // 메인메뉴 출력
    }

    public void mainMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메인 선택 : ");
        String menuNo = scanner.nextLine();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }
    public void create() {

        System.out.println("[새 게시글 생성]");
        System.out.print("Title : ");
        String title = scanner.nextLine();

        System.out.print("Content : ");
        String content = scanner.nextLine();

        System.out.print("Writer : ");
        String writer = scanner.nextLine();

        Board board = new Board(title, content, writer);

//      보조 메뉴 출력
        System.out.println("-------------------------------------------------");
        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.print("보조 선택 : ");
        String menu = scanner.nextLine();

//      글쓰기 Ok한 경우
        if (menu.equals("1")) {
            String sql = """
                    INSERT INTO boards (title, content, writer)
                    VALUES (?, ?, ?)
                    """;

//          객체에서 필드를 가져와 동적 SQL 완성
            try (PreparedStatement pstmt = conn.prepareStatement(sql);) {

                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

//      게시글 목록 출력
        list();
    }

    public void read() {

        System.out.println("[게시물 읽기]");
        System.out.print("게시글 번호 : ");
        int boardNo = Integer.parseInt(scanner.nextLine());

        String sql = "SELECT boardNo, title, content, writer, date FROM boards WHERE boardNo = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

//          SQL문 실행
            pstmt.setInt(1, boardNo);
            ResultSet rs = pstmt.executeQuery();

//          결과 처리
            if (rs.next()) {
//              게시글 객체 생성
                Board board = new Board(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5));

//              게시글 내용 출력
                System.out.println("-------------------------------------------------");
                System.out.println("No. : " + board.getBoardNo());
                System.out.println("Title : " + board.getTitle());
                System.out.println("Content : " + board.getContent());
                System.out.println("Writer : " + board.getWriter());
                System.out.println("Date : " + board.getDate());
                System.out.println("-------------------------------------------------");

                // 보조메뉴 출력
                System.out.println("보조 메뉴 : 1. Update | 2. Delete | 3. List");
                System.out.print("보조 선택 : ");
                String menu = scanner.nextLine();

                // 상세 게시글에서 수정, 삭제 기능 (게시글 객체 전달)
                if (menu.equals("1")) {
                    update(board);
                } else if (menu.equals("2")) {
                    delete(board);
                }
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        list();
    }

    public void update(Board board) {

//      수정 내용 입력받기
        System.out.println("[수정할 내용 입력]");
        System.out.print("Title : ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) board.setTitle(title);

        System.out.print("Content : ");
        String content = scanner.nextLine();
        if (!content.isEmpty()) board.setContent(content);

        System.out.print("Writer : ");
        String writer = scanner.nextLine();
        if (!writer.isEmpty()) board.setWriter(writer);

//      보조 메뉴 출력
        System.out.println("-------------------------------------------------");
        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.print("보조 선택 : ");
        String menu = scanner.nextLine();

//      게시글 수정
        if (menu.equals("1")) {

            String sql = "UPDATE boards SET title = ?, content = ?, writer = ? WHERE boardNo = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.setInt(4, board.getBoardNo());

                int rows = pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
    }

    public void delete(Board board) {

        System.out.println("정말 삭제하시겠습니까 (Y / N)");
        String answer = scanner.nextLine();

        if (answer.toUpperCase().equals("Y")) {
            String sql = "DELETE FROM boards WHERE boardNo = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, board.getBoardNo());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
    }

    public void clear() {
        System.out.println("BoardEx02.clear");
        list();
    }


    public void exit() {
        try {

            if (conn != null) conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.exit(0); // 종료
        }
    }

    public static void main(String[] args) {

        BoardEx07 boardEx = new BoardEx07();
        boardEx.list();
    }
}
