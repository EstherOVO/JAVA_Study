package jdbc;

import java.sql.*;

public class JDBC05 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM no_table");) {


        } catch (SQLException e) {
//          예외에 관한 상세 메시지 반환
            String message = e.getMessage();
            System.out.println("예외 메시지 : " + message);

//          표준 오류 코드 문자열
            System.out.println("오류 종류 " + e.getSQLState());

//          특정 DBMS의 에러 코드
            System.out.println("MySQL 에러 코드 : " + e.getErrorCode());

            System.out.println("여러 종류 에러가 있을 때 다음 에러 : " + e.getNextException());
        }
    }
}
