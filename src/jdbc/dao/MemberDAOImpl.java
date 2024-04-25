package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {

    Connection conn;

//  DAO 생성과 동시에 접근 객체 생성
    public MemberDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(MemberDTO member) {

        String sql = "INSERT INTO members (id, name, email) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MemberDTO getMemberById(String id) {

        String sql = "SELECT id, name, email FROM members WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, id);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                return new MemberDTO(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("email"));
            }

            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(MemberDTO member) {

        String sql = "UPDATE members SET id = ?, name = ?, email = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, member.getId());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String id) {

        String sql = "DELETE FROM members WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<MemberDTO> getAllMembers() {

        List<MemberDTO> members = new ArrayList<>();

        String sql = "SELECT * FROM members";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();

//          여러 개의 SQL문 결과 셋 반복(커서 이동)
            while (rs.next()) {

//              DTO 객체를 생성하여 빈 컬렉션에 추가
                MemberDTO member = new MemberDTO(rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("email"));

                members.add(member);
            }
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//      결과 셋을 담은 컬렉션을 반환
        return members;
    }
}
