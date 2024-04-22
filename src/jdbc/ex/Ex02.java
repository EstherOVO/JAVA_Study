package jdbc.ex;


import java.sql.*;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

/*
        연습 문제 2.

        요구사항 :
        사용자로부터 userId, name, password, age, email을 입력받아,
        JDBC를 사용하여 데이터베이스의 users 테이블에 새로운 사용자 정보를 삽입하는 Java 애플리케이션을 작성하세요.

        Java 애플리케이션은 사용자로부터 다음 정보를 입력받아야 합니다.

        userId : spring
        name : 봄봄
        password : 23456
        age : 25
        email : spring@def.com

        - 입력받은 정보를 데이터베이스의 users 테이블에 삽입합니다.
        - 데이터 삽입이 성공적으로 완료되면, 삽입된 행의 수를 출력합니다.
        - 오류 발생 시 적절한 오류 메시지를 출력하고 프로그램을 종료합니다
*/

        Scanner scanner = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String sql = """
                INSERT INTO users (userId, name, password, age, email) VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password);) {

            PreparedStatement pstmt = conn.prepareStatement(sql);

            System.out.print("- 사용자의 ID를 입력하세요 : " );
            String id = scanner.nextLine();
            pstmt.setString(1, id);

            System.out.print("- 사용자의 이름을 입력하세요 : " );
            String name = scanner.nextLine();
            pstmt.setString(2, name);

            System.out.print("- 사용자의 비밀번호를 입력하세요 : " );
            String pw = scanner.nextLine();
            pstmt.setString(3, pw);

            System.out.print("- 사용자의 나이를 입력하세요 : " );
            int age = scanner.nextInt();
            pstmt.setInt(4, age);

            scanner.nextLine();

            System.out.print("- 사용자의 이메일 주소를 입력하세요 : " );
            String email = scanner.nextLine();
            pstmt.setString(5, email);

            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                ResultSet rs = pstmt.executeQuery("SELECT * FROM users WHERE userID = " + id);
                if (rs.next()) {
                    String nm = rs.getString("name");
                    System.out.println(String.format("[%d] %s님 정보 입력 완료되었습니다.", rows, nm));
                }
                rs.close();
            }
            pstmt.close();

        } catch (SQLException e) {
            System.out.println("다시 시도해 주시기를 바랍니다.");
        }
    }
}
