package jdbc;

import java.sql.*;

public class JDBC03 {
    public static void main(String[] args) {

//      SQL문 사용하기
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";           // 사용자 이름
        String password = "1234";       // 비밀번호

//      1. 객체
//      연결 객체
        Connection conn = null;
//      실행문 객체
        Statement stmt = null;
//      결과문 객체
        ResultSet rs = null;

        try {

            conn = DriverManager.getConnection(url, user, password);

//          2. SQL 쿼리 실행문
            stmt = conn.createStatement();

            String sql = "SELECT * FROM emp";

//          3. 실행문을 실행 → 결과 셋이 반환
            rs = stmt.executeQuery(sql);

//          4. rs.next() : 읽어 올 행의 정보가 있으면 true(커서를 한 행 이동), 없으면 false
            while (rs.next()) {
//              결과 셋에서 ename 컬럼의 데이터를 가져옴(단, 데이터 타입이 일치해야 한다.)
                String ename = rs.getString("ename");
                System.out.println(ename);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
//              5. 자원 정리
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
