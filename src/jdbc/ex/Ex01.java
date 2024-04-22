package jdbc.ex;

import java.sql.*;

public class Ex01 {
    public static void main(String[] args) {

//      연습 문제 1. scott DB에서 10번 부서에 일하는 직원의 이름과 직무, 연봉을 조회하여 출력하세요.

        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE DEPTNO = 10");) {

            while (rs.next()) {

                int deptno = rs.getInt("DEPTNO");
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString("JOB");
                int sal = rs.getInt("SAL");

                System.out.println(String.format("[%d] 직원 번호 : %d | 사원명 : %-7s | 직무 : %-10s | 연봉 : %d", deptno, empno, ename, job, sal));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
