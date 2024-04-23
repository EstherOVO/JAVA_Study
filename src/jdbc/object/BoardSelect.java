package jdbc.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

public class BoardSelect {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String dbPassword = "1234";

        String sql = "SELECT boardNo, title, content, writer, date, filename, filedata FROM boards WHERE writer = ?";

        try (Connection conn = DriverManager.getConnection(url, user, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "winter");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Board board = new Board(rs.getInt("boardNo"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("writer"),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getBlob(7));

                System.out.println(board);

                Blob filedata = board.getFiledata();
                InputStream inputStream = filedata.getBinaryStream();
                FileOutputStream outputStream = new FileOutputStream("src/jdbc/object/" + board.getFilename());
                inputStream.transferTo(outputStream);
                outputStream.flush();
                outputStream.close();
                inputStream.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
