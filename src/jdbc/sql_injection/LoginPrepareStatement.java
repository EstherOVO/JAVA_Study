package jdbc.sql_injection;

import java.sql.*;
import java.util.Scanner;

public class LoginPrepareStatement {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String dbPassword = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("- 아이디를 입력하세요 : ");
        String id = scanner.nextLine();

        System.out.print("- 비밀번호를 입력하세요 : ");
        String pw = scanner.nextLine();

        String sql = "SELECT * FROM users WHERE userID = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, user, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            pstmt.setString(2, pw);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("성공적으로 로그인 되었습니다.");
            } else {
                System.out.println("로그인에 실패하였습니다.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
