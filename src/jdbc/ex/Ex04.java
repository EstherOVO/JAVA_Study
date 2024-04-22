package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

/*
        연습 문제 4. 사용자 삭제

        요구사항 :
        사용자로부터 userId를 입력받아 해당 userId를 가진 사용자의 데이터를 데이터베이스에서 삭제하세요.

        - 사용자로부터 userId를 입력받습니다.
        - 해당 userId를 가진 사용자의 데이터를 users 테이블에서 삭제합니다.


 */

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String deleteSql = "DELETE FROM users WHERE userId = ?";

        Scanner scanner = new Scanner(System.in);

        System.out.print("- 삭제할 유저의 아이디를 입력해 주세요 : ");
        String id = scanner.next();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(deleteSql);) {

            pstmt.setString(1, id);

            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                System.out.println(rows + "개가 삭제 되었습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
