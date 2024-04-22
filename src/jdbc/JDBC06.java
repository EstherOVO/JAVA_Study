package jdbc;

import java.sql.*;

public class JDBC06 {
    public static void main(String[] args) {

//      PreparedStatement
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";
        String sql = "SELECT * FROM emp WHERE DEPTNO = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

//          동적 쿼리를 생성하고 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 10);    // 첫 번째 '?'에 10 값을 설정
            ResultSet rs = pstmt.executeQuery();    // 실행

            while (rs.next()) {

                System.out.println(rs.getInt("DEPTNO") + " " + rs.getString("ename"));
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
