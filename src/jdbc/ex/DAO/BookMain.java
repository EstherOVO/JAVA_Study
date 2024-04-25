package jdbc.ex.DAO;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMain {

    private static Scanner scanner = new Scanner(System.in);
    private static BookDAO bookDAO;

    public static void main(String[] args) {

        bookDAO = new BookDAOImpl(DatabaseUtil.getConnection());

        System.out.println("""
                ---------------
                1. 도서 추가
                2. 도서 조회
                3. 도서 정보 수정
                4. 도서 삭제
                5. 종료
                ---------------
                """);

        while (true) {

            System.out.println();
            System.out.print("◑ 메뉴 선택 : ");
            String number = scanner.nextLine();
            System.out.println();

            switch (number) {
                case "1" -> insert();
                case "2" -> select();
                case "3" -> update();
                case "4" -> delete();
                case "5" -> {
                    System.out.println("◐ 프로그램을 종료합니다. ◑");
                    DatabaseUtil.close(); return;
                }
                default -> System.out.println("※ 번호를 다시 확인해 주시기 바랍니다.");
            }
        }
    }

    public static void insert() {

        System.out.println("[§ 도서 추가 §]");
        System.out.print("○ ISBN : ");
        String isbn = scanner.nextLine();

        System.out.print("○ 제목 : ");
        String title = scanner.nextLine();

        System.out.print("○ 저자 : ");
        String author = scanner.nextLine();

        System.out.print("○ 출판연도 : ");
        int publish_year = scanner.nextInt();

        scanner.nextLine();

        System.out.print("○ 장르 : ");
        String genre = scanner.nextLine();

        BookDTO book = new BookDTO(isbn, title, author, publish_year, genre);

        bookDAO.insert(book);

        System.out.println("● 도서 추가가 완료되었습니다. ●");
    }

    public static void select() {

        System.out.println("[§ 도서 조회 §]");
        System.out.print("1. ISBN으로 검색 | 2. 저자로 검색 | 3. 제목으로 검색 | 4. 모든 도서 목록 조회 > 번호 : ");
        int number = scanner.nextInt();

        scanner.nextLine();
        if (number == 4) {
            selectAllBooks();
        } else {
            System.out.print("▶ 검색 키워드 : ");
            String word = scanner.nextLine();

            BookDTO book = bookDAO.select(number, word);

            if (book != null) {
                System.out.println("○ ISBN : " + book.getIsbn());
                System.out.println("○ 제목 : " + book.getTitle());
                System.out.println("○ 저자 : " + book.getAuthor());
                System.out.println("○ 출판연도 : " + book.getPublish_year());
                System.out.println("○ 장르 : " + book.getGenre());
            } else {
                System.out.println("● 도서를 찾을 수 없습니다. ●");
            }
        }
    }

    public static void update() {

        System.out.println("[§ 도서 조회 §]");
        System.out.print("○ ISBN : ");
        String isbn = scanner.nextLine();

        BookDTO book = bookDAO.select(1, isbn);

        System.out.println("○ ISBN : " + book.getIsbn());
        System.out.println("○ 제목 : " + book.getTitle());
        System.out.println("○ 저자 : " + book.getAuthor());
        System.out.println("○ 출판연도 : " + book.getPublish_year());
        System.out.println("○ 장르 : " + book.getGenre());

        if (book != null) {
            System.out.println("\n[§ 도서 정보 수정 §]");
            System.out.println("- 수정 내용을 아래에 입력하세요.(변경 사항이 없을 경우 Enter) -");
            System.out.print("○ 제목 : ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) book.setTitle(title);

            System.out.print("○ 저자 : ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) book.setAuthor(author);

            System.out.print("○ 출판연도 : ");
            String publish_year = scanner.nextLine();
            if (!publish_year.isEmpty()) book.setPublish_year(Integer.parseInt(publish_year));

            System.out.print("○ 장르 : ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) book.setGenre(genre);

            bookDAO.update(book);

            System.out.println("● 도서 정보 수정이 완료되었습니다. ●");
        } else {
            System.out.println("● 도서를 찾을 수 없습니다. ●");
        }
    }

    public static void delete() {

        System.out.println("[§ 도서 조회 §]");
        System.out.print("○ ISBN : ");
        String isbn = scanner.nextLine();

        BookDTO book = bookDAO.select(1, isbn);

        System.out.println("○ ISBN : " + book.getIsbn());
        System.out.println("○ 제목 : " + book.getTitle());
        System.out.println("○ 저자 : " + book.getAuthor());
        System.out.println("○ 출판연도 : " + book.getPublish_year());
        System.out.println("○ 장르 : " + book.getGenre());

        if (book != null) {

            System.out.println("\n[§ 도서 삭제 §]");
            bookDAO.delete(isbn);

            System.out.println("● 도서 삭제가 완료되었습니다. ●");

        } else {
            System.out.println("● 도서를 찾을 수 없습니다. ●");
        }
    }

    public static void selectAllBooks() {

        List<BookDTO> bookList = bookDAO.selectAllBooks();

        Iterator<BookDTO> iter = bookList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
