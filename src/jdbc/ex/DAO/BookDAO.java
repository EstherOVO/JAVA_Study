package jdbc.ex.DAO;

import java.util.List;

public interface BookDAO {

    void insert(BookDTO bookDTO);

    List<BookDTO> select(int number, String str);

    void update(BookDTO bookDTO);

    void delete(String isbn);

    List<BookDTO> selectAllBooks();
}
