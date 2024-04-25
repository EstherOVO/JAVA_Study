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
    public List<BookDTO> select(int number, String str) {

        String selectSqlByIsbn = "SELECT isbn, title, author, publish_year, genre FROM books WHERE isbn = ?";
        String selectSqlByAuthor = "SELECT isbn, title, author, publish_year, genre FROM books WHERE author = ?";
        String selectSqlByTitle = "SELECT isbn, title, author, publish_year, genre FROM books WHERE title = ?";

        switch (number) {

            case 1:
                List<BookDTO> bookListByIsbn = new ArrayList<>();

                try (PreparedStatement pstmt1 = conn.prepareStatement(selectSqlByIsbn);) {

                    pstmt1.setString(1, str);

                    ResultSet rs1 = pstmt1.executeQuery();

                    if (rs1.next()) {
                        BookDTO book = new BookDTO(
                                rs1.getString("isbn"),
                                rs1.getString("title"),
                                rs1.getString("author"),
                                rs1.getInt("publish_year"),
                                rs1.getString("genre"));

                        bookListByIsbn.add(book);
                    }
                    rs1.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return bookListByIsbn;

            case 2:
                List<BookDTO> bookListByAuthor = new ArrayList<>();

                try (PreparedStatement pstmt2 = conn.prepareStatement(selectSqlByAuthor);) {

                    pstmt2.setString(1, str);

                    ResultSet rs2 = pstmt2.executeQuery();

                    while (rs2.next()) {
                        BookDTO book = new BookDTO(
                                rs2.getString("isbn"),
                                rs2.getString("title"),
                                rs2.getString("author"),
                                rs2.getInt("publish_year"),
                                rs2.getString("genre"));

                        bookListByAuthor.add(book);
                    }
                    rs2.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return bookListByAuthor;

            case 3:
                List<BookDTO> bookListByWriter = new ArrayList<>();

                try (PreparedStatement pstmt3 = conn.prepareStatement(selectSqlByTitle);) {

                    pstmt3.setString(1, str);

                    ResultSet rs3 = pstmt3.executeQuery();

                    while (rs3.next()) {
                        BookDTO book = new BookDTO(
                                rs3.getString("isbn"),
                                rs3.getString("title"),
                                rs3.getString("author"),
                                rs3.getInt("publish_year"),
                                rs3.getString("genre"));

                        bookListByWriter.add(book);
                    }
                    rs3.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return bookListByWriter;
        }
        return null;
    }

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
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<BookDTO> selectAllBooks() {

        List<BookDTO> bookList = new ArrayList<>();
        String selectSql = "SELECT * FROM books ORDER BY genre, isbn";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                BookDTO book = new BookDTO(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre"));

                bookList.add(book);
            }
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }
}
