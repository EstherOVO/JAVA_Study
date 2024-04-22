package jdbc;

import java.sql.*;

public class JDBC04 {
    public static void main(String[] args) {

//      try-with-resource 구문으로 자원 정리하기
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";       // 사용자 이름
        String password = "1234";   // 비밀번호

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM emp");) {

            while (rs.next()) {

                int eno = rs.getInt(1); // 첫 번째 컬럼을 정수 타입으로 반환
                String ename = rs.getString(2); // 두 번째 컬럼을 문자열 타입으로 반환
                Date hireDate = rs.getDate("hireDate");

                System.out.println(String.format("사원 번호 : %d | 사원명 : %-7s ",eno, ename) + "| 채용일 : " + hireDate);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   // (close 메서드를 사용하지 않아도) try 구문이 끝나면 객체를 안전하게 종료한다.
    }
}
