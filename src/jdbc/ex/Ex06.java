package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

public class Ex06 {

    private Scanner scanner = new Scanner(System.in);
    private Connection conn;
    private String[] arr = new String[5];

    public Ex06() {

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

        System.out.println("[List Of Users]");

        String selectSql = "SELECT userID FROM users";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("- " + rs.getString("userID"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        mainMenu();
    }

    public void mainMenu() {

        System.out.println("---------------------------------");
        System.out.println("[Main]");
        System.out.println("1. Create | 2. Read | 3. Clear | 4. Join | 5. Login | 6. Exit");
        System.out.println("---------------------------------");
        System.out.print("Number : ");
        int number = scanner.nextInt();

        scanner.nextLine();

        switch (number) {
            case 1 -> create();
            case 2 -> read();
            case 3 -> clear();
            case 4 -> join();
            case 5 -> login();
            case 6 -> exit();
        }
    }

    public void mainMenuForLogOut() {

        System.out.println("---------------------------------");
        System.out.println("[Main]");
        System.out.println("1. Create | 2. Read | 3. Clear | 4. Logout | 5. Exit");
        System.out.println("---------------------------------");
        System.out.print("Number : ");
        int number = scanner.nextInt();

        scanner.nextLine();

        switch (number) {
            case 1 -> create();
            case 2 -> read();
            case 3 -> clear();
            case 4 -> logout();
            case 5 -> exit();
        }
    }

    public void create() {

        System.out.print("ID : ");
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

        User user = new User(id, name, password, age, email);

        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.print("Number : ");
        String number = scanner.nextLine();

        if (number.equals("1")) {

            String createSql = """
                INSERT INTO users (userID, name, password, age, email)
                VALUES (?, ?, ?, ?, ?)
                """;

            try (PreparedStatement pstmt = conn.prepareStatement(createSql)) {

                pstmt.setString(1, user.getUserID());
                pstmt.setString(2, user.getName());
                pstmt.setString(3, user.getPassword());
                pstmt.setInt(4, user.getAge());
                pstmt.setString(5, user.getEmail());

                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

        list();
    }

    public void read() {

        System.out.print("ID : ");
        String id = scanner.next();

        String readSql = "SELECT userID, name, age, email FROM users WHERE userID = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(readSql)) {

            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                User user = new User(rs.getString("userID"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"));

                System.out.println("---------------------------------");
                System.out.println("ID : " + user.getUserID());
                System.out.println("Name : " + user.getName());
                System.out.println("Age : " + user.getAge());
                System.out.println("Email : " + user.getEmail());
                System.out.println("---------------------------------");
            }

            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        list();
    }

    public void clear() {

        System.out.print("※ 모든 게시글을 삭제하시겠습니까 (Y / N) : ");
        String answer = scanner.nextLine();

        if (answer.toUpperCase().equals("Y")) {

            String truncateSql = "TRUNCATE TABLE users";

            try (PreparedStatement pstmt = conn.prepareStatement(truncateSql)) {

                int rows = pstmt.executeUpdate();
                System.out.println("＃ 총 " + rows + "개의 게시글이 삭제되었습니다. #");

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

        list();
    }

    public void join() {

        System.out.print("ID : ");
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

        for (int i = 0; i < arr.length; i++) {
            arr[0] = id;
            arr[1] = name;
            arr[2] = password;
            arr[3] = String.valueOf(age);
            arr[4] = email;
        }

        System.out.println("[New User]");
        System.out.println("ID : " + arr[0]);
        System.out.println("Name : " + arr[1]);
        System.out.println("Password : " + arr[2]);
        System.out.println("Age : " + arr[3]);
        System.out.println("Email : " + arr[4]);

        arr = new String[arr.length];

        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.print("Number : ");
        String number = scanner.nextLine();

        if (number.equals("1")) {

            User user = new User(id, name, password, age, email);

            String createSql = """
                INSERT INTO users (userID, name, password, age, email)
                VALUES (?, ?, ?, ?, ?)
                """;

            try (PreparedStatement pstmt = conn.prepareStatement(createSql)) {

                pstmt.setString(1, user.getUserID());
                pstmt.setString(2, user.getName());
                pstmt.setString(3, user.getPassword());
                pstmt.setInt(4, user.getAge());
                pstmt.setString(5, user.getEmail());

                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

        list();
    }

    public void login() {

        System.out.println("[Log-In]");
        System.out.print("ID : ");
        String id = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();

        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.print("Number : ");
        String number = scanner.nextLine();

        if (number.equals("1")) {

            String logSql = "SELECT * FROM users WHERE userID = ? AND password = ?";

            try (PreparedStatement pstmt1 = conn.prepareStatement(logSql)) {

                User user = new User(id, password);

                pstmt1.setString(1, user.getUserID());
                pstmt1.setString(2, user.getPassword());

                ResultSet rs1 = pstmt1.executeQuery();

                if (rs1.next()) {
                    String checkSql = "SELECT boardNo, title, date, writer FROM boards WHERE writer = ?";
                    PreparedStatement pstmt2 = conn.prepareStatement(checkSql);

                    pstmt2.setString(1, id);

                    ResultSet rs2 = pstmt2.executeQuery();

                    if (rs2.next()) {

                        System.out.println("[게시물 목록] User : " + user.getUserID());
                        System.out.println("---------------------------------");
                        System.out.println(String.format("%-6s%-12s%-16s%-40s", "No.", "Writer", "Date", "Title"));
                        System.out.println("---------------------------------");

                        String boardNo = rs2.getString("boardNo");
                        String writer = rs2.getString("writer");
                        Date date = rs2.getDate("date");
                        String title = rs2.getString("title");

                        System.out.println(String.format("%-6s%-12s%-16s%-40s", boardNo, writer, date, title));
                    }
                } else {
                    System.out.println("로그인에 실패하였습니다.");
                    login();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

        mainMenuForLogOut();
    }

    public void logout() {

        mainMenu();
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

        Ex06 ex = new Ex06();
        ex.list();
    }
}
