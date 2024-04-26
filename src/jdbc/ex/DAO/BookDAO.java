package jdbc.ex.DAO;

import java.util.List;

public interface BookDAO {

    void insert(BookDTO bookDTO);

    BookDTO getBookByIsbn(String isbn);

    List<BookDTO> getBookByTitle(String title);

    List<BookDTO> getBookByAuthor(String author);

    List<BookDTO> selectAllBooks();

    void update(BookDTO bookDTO);

    void delete(String isbn);
}
