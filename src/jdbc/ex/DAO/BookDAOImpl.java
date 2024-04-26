package jdbc.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    Connection conn;

    public BookDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(BookDTO bookDTO) {

        String insertSql = "INSERT books (isbn, title, author, publish_year, genre) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {

            pstmt.setString(1, bookDTO.getIsbn());
            pstmt.setString(2, bookDTO.getTitle());
            pstmt.setString(3, bookDTO.getAuthor());
            pstmt.setInt(4, bookDTO.getPublish_year());
            pstmt.setString(5, bookDTO.getGenre());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BookDTO getBookByIsbn(String isbn) {

        String selectSql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE isbn = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                return new BookDTO(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    };

    public List<BookDTO> getBookByTitle(String title) {

        List<BookDTO> bookList = new ArrayList<>();
        String selectSql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE title = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            pstmt.setString(1, title);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                BookDTO book = new BookDTO(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );

                bookList.add(book);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    };

    public List<BookDTO> getBookByAuthor(String author) {

        List<BookDTO> bookList = new ArrayList<>();
        String selectSql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE author = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            pstmt.setString(1, author);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                BookDTO book = new BookDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)
                );

                bookList.add(book);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    };

    public List<BookDTO> selectAllBooks() {

        List<BookDTO> bookList = new ArrayList<>();
        String selectSql = "SELECT * FROM books ORDER BY genre";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                BookDTO book = new BookDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)
                );

                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    };

    @Override
    public void update(BookDTO bookDTO) {

        String updateSql = "UPDATE books SET title = ?, author = ?, publish_year = ?, genre = ? WHERE isbn = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {

            pstmt.setString(1, bookDTO.getTitle());
            pstmt.setString(2, bookDTO.getAuthor());
            pstmt.setInt(3, bookDTO.getPublish_year());
            pstmt.setString(4, bookDTO.getGenre());
            pstmt.setString(5, bookDTO.getIsbn());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String isbn) {

        String deleteSql = "DELETE FROM books WHERE isbn = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(deleteSql)) {

            pstmt.setString(1, isbn);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
