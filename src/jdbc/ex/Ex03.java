package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

/*
        연습 문제 3. 사용자 정보 업데이트

        요구사항 :
        사용자로부터 userId, name, password, age, email을 입력받아
        해당 userId를 가진 사용자의 정보를 업데이트하세요.

        사용자로부터 다음 정보를 입력받습니다.

        userId : 업데이트 할 사용자 ID
        name : 새 사용자 이름
        password : 새 비밀번호
        age : 새 나이
        email : 새 이메일 주소

        - 입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
*/

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String updateSql = "UPDATE users SET name = ?, password = ?, age = ?, email = ? WHERE userID = ?";

        Scanner scanner = new Scanner(System.in);

        System.out.print("- 사용자의 ID를 입력하세요 : " );
        String id = scanner.nextLine();

        System.out.print("- 사용자의 이름을 입력하세요 : " );
        String name = scanner.nextLine();

        System.out.print("- 사용자의 비밀번호를 입력하세요 : " );
        String pw = scanner.nextLine();

        System.out.print("- 사용자의 나이를 입력하세요 : " );
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("- 사용자의 이메일 주소를 입력하세요 : " );
        String email = scanner.nextLine();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(updateSql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, pw);
            pstmt.setInt(3, age);
            pstmt.setString(4, email);
            pstmt.setString(5, id);

            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                System.out.println(rows + "개가 업데이트 되었습니다.");
            }
        } catch (SQLException e) {
            System.out.println("다시 시도해 주시기를 바랍니다.");
        }
    }
}
