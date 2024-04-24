package jdbc.ex.Web;

import java.sql.*;
import java.util.Scanner;

public class Ex07 {

    private Scanner scanner = new Scanner(System.in);
    private Connection conn;
    private String loginId = null;

    public Ex07() {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void list() {

        System.out.println("\n[List]");
        System.out.println("-------------------------------------------------");
        System.out.println(String.format("%-6s%-12s%-16s%-40s", "No.", "Writer", "Date", "Title"));
        System.out.println("-------------------------------------------------");

        String sql = "SELECT boardNo, title, content, writer, date FROM boards ORDER BY boardNo DESC";

        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {

                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5));

                System.out.println(String.format("%-6s%-12s%-16s%-40s", board.getBoardNo(), board.getWriter(), board.getDate(), board.getTitle()));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
        mainMenu();
    }

    public void mainMenu() {

        if (loginId == null) {

            System.out.println("[Main]");
            System.out.println("1. Create | 2. Read | 3. Clear | 4. Join | 5. Login | 6. Exit");
            System.out.println("-------------------------------------------------");
            System.out.print("Number : ");
            String number =  scanner.nextLine();

            switch (number) {
                case "1" -> create();
                case "2" -> read();
                case "3" -> clear();
                case "4" -> join();
                case "5" -> login();
                case "6" -> exit();
            }
            list();

        } else {

            System.out.println("[Main]");
            System.out.println("1. Create | 2. Read | 3. Clear | 4. Logout | 5. Exit)");
            System.out.println("-------------------------------------------------");
            System.out.print("Number : ");
            String number =  scanner.nextLine();

            switch (number) {
                case "1" -> create();
                case "2" -> read();
                case "3" -> clear();
                case "4" -> {loginId = null; list();}
                case "5" -> exit();
            }
            list();
        }
    }

    public void create() {

        System.out.println("[Create]");
        System.out.print("Title : ");
        String title = scanner.nextLine();

        System.out.print("Content : ");
        String content = scanner.nextLine();

        System.out.print("Writer : ");
        String writer = scanner.nextLine();

        System.out.println("-------------------------------------------------");
        System.out.println("Sub Menu : 1. Ok | 2. Cancel");
        System.out.print("Choice : ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {

            String createSql = "INSERT INTO boards (title, content, writer) VALUES (?, ?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(createSql)) {

                Board board = new Board(title, content, writer);

                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());

                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    ///////////////////////////////////////////////////////

    public void read() {

        System.out.println("[Read]");
        System.out.print("Board No. : ");
        int boardNo = scanner.nextInt();
        scanner.nextLine();

        String readSql = "SELECT boardNo, title, content, writer, date FROM boards WHERE boardNo = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(readSql)) {

            pstmt.setInt(1, boardNo);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                Board board = new Board(
                        rs.getInt("boardNo"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("writer"),
                        rs.getDate("date"));

                System.out.println("-------------------------------------------------");
                System.out.println("Board No. " + board.getBoardNo());
                System.out.println("Title : " + board.getTitle());
                System.out.println("Content : " + board.getContent());
                System.out.println("Writer : " + board.getWriter());
                System.out.println("Date : " + board.getDate());
                System.out.println("-------------------------------------------------");

                System.out.println("Sub Menu : 1. Update | 2. Delete | 3. List");
                System.out.print("Choice : ");
                String choice = scanner.nextLine();

                if (choice.equals("1")) {
                    update(board);
                } else if (choice.equals("2")) {
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

        System.out.println("[Update]");
        System.out.print("Title : ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) board.setTitle(title);

        System.out.print("Content : ");
        String content = scanner.nextLine();
        if (!content.isEmpty()) board.setContent(content);

        System.out.print("Writer : ");
        String writer = scanner.nextLine();
        if (!writer.isEmpty()) board.setWriter(writer);

        System.out.println("-------------------------------------------------");
        System.out.println("Sub Menu : 1. Ok | 2. Cancel");
        System.out.print("Choice : ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {

            String updateSql = "UPDATE boards SET title = ?, content = ?, writer = ? WHERE boardNo = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {

                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.setInt(4, board.getBoardNo());

                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        } else {
            list();
        }
    }

    public void delete(Board board) {

        System.out.println("[Delete]");
        System.out.println("Are you sure you want to delete?");
        System.out.println("Sub Menu : 1. Ok | 2. Cancel");
        System.out.print("Choice : ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {

            String deleteSql = "DELETE FROM boards WHERE boardNo = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(deleteSql)) {

                pstmt.setInt(1, board.getBoardNo());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        } else {
            list();
        }
    }

    ///////////////////////////////////////////////////////

    public void clear() {

        System.out.println("[Clear]");
        System.out.println("Are you sure you want to delete everything?");
        System.out.println("Sub Menu : 1. Ok | 2. Cancel");
        System.out.print("Choice : ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {

            String clearSql = "TRUNCATE TABLE boards";

            try (PreparedStatement pstmt = conn.prepareStatement(clearSql)) {

                int rows = pstmt.executeUpdate();
                System.out.println("※ 모두 " + rows + "개의 게시물이 삭제되었습니다.");

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    ///////////////////////////////////////////////////////

    public void join() {

        System.out.println("[Join]");
        System.out.print("userID : ");
        String id = scanner.nextLine();

        System.out.print("Name : ");
        String name = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();

        System.out.print("Age : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();

        System.out.println("Sub Menu : 1. Ok | 2. Cancel");
        System.out.print("Choice : ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {

            User user = new User(id, name, password, age, email);
            String joinSql = "INSERT INTO users (userID, name, password, age, email) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(joinSql)) {

                pstmt.setString(1, user.getUserID());
                pstmt.setString(2, user.getName());
                pstmt.setString(3, user.getPassword());
                pstmt.setInt(4, user.getAge());
                pstmt.setString(5, user.getEmail());

                int rows = pstmt.executeUpdate();

                if (rows == 1) {
                    System.out.println("＊ Join Completed *");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    ///////////////////////////////////////////////////////

    public void login() {

        System.out.println("[Login]");
        System.out.print("ID : ");
        String id = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();

        System.out.println("Sub Menu : 1. Ok | 2. Cancel");
        System.out.print("Choice : ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            User user = new User(id, password);

            String sql = "SELECT userID, password FROM users WHERE userID = ? AND password = ?";

            try (PreparedStatement pstmt1 = conn.prepareStatement(sql)) {

                pstmt1.setString(1, user.getUserID());
                pstmt1.setString(2, user.getPassword());
                ResultSet rs1 = pstmt1.executeQuery();

                if (rs1.next()) {

                    loginId = user.getUserID();

                    System.out.println("▶ 정상적으로 로그인 되었습니다. ◀");

                    String loginSql = "SELECT boardNo, title, content, writer, date FROM boards WHERE writer = ? ORDER BY boardNo DESC";

                    PreparedStatement pstmt2 = conn.prepareStatement(loginSql);

                    pstmt2.setString(1, user.getUserID());
                    ResultSet rs2 = pstmt2.executeQuery();

                    System.out.println("▣ User : " + user.getUserID());
                    System.out.println("-------------------------------------------------");
                    System.out.println(String.format("%-6s%-12s%-16s%-40s", "No.", "Writer", "Date", "Title"));
                    System.out.println("-------------------------------------------------");

                    while (rs2.next()) {

                        System.out.println(String.format("%-6s%-12s%-16s%-40s", rs2.getInt("boardNo"),
                                rs2.getString("writer"),
                                rs2.getDate("date"),
                                rs2.getString("title")));

                    }
                    rs2.close();

                } else {

                    System.out.println("▶ 로그인에 실패하였습니다. ◀");
                    loginId = null;
                    login();
                }
                rs1.close();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        } else {
            list();
        }
    }

    ///////////////////////////////////////////////////////

    public void exit() {

        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.exit(0);
        }
    }

    ///////////////////////////////////////////////////////

    public static void main(String[] args) {

        Ex07 ex = new Ex07();
        ex.list();

    }
}
