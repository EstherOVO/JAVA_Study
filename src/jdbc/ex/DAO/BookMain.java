package jdbc.ex.DAO;

import java.util.Scanner;

public class BookMain {

    private static Scanner scanner = new Scanner(System.in);
    private static BookDAO bookDAO;

    public static void main(String[] args) {

        bookDAO = new BookDAOImpl(DatabaseUtil.getConnection());

        System.out.println("""
                1. 도서 추가
                2. 도서 조회
                3. 도서 정보 수정
                4. 도서 삭제
                5. 종료
                """);

        while (true) {

            System.out.print("▶ 메뉴 선택 : ");
            String number = scanner.nextLine();

            switch (number) {
                case "1" -> insert();
                case "2" -> select();
                case "3" -> update();
                case "4" -> delete();
                case "5" -> {DatabaseUtil.close(); return;}
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
        System.out.println("1. ISBN으로 검색 | 2. 저자로 검색 | 3. 제목으로 검색 | 4. 모든 도서 목록 조회");
        System.out.print("▶ 메뉴 선택 : ");
        int number = scanner.nextInt();

        scanner.nextLine();

        System.out.print("▶ 검색 키워드 : ");
        String word = scanner.nextLine();

        if (number == 4) selectAllBooks();

        BookDTO book = bookDAO.select(number, word);

        if (bb)
    }

    public static void update() {

        System.out.println("[§ 도서 정보 수정 §]");
        System.out.print("○ ISBN : ");
        String isbn = scanner.nextLine();

        BookDTO book = bookDAO.select(1, isbn);

        System.out.print("○ ISBN : " + book.getIsbn());
        System.out.print("○ 제목 : " + book.getTitle());
        System.out.print("○ 저자 : " + book.getAuthor());
        System.out.print("○ 출판연도 : " + book.getPublish_year());
        System.out.print("○ 장르 : " + book.getGenre());

        if (book != null) {
            System.out.print("○ 제목 : ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) book.setTitle(title);

            System.out.print("○ 저자 : ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) book.setAuthor(author);

            System.out.print("○ 출판연도 : ");
            int publish_year = scanner.nextInt();
            if (!String.valueOf(publish_year).isEmpty()) book.setPublish_year(publish_year);

            System.out.print("○ 장르 : ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) book.setGenre(genre);

            System.out.println("● 도서 정보 수정이 완료되었습니다. ●");
        } else {
            System.out.println("● 도서를 찾을 수 없습니다. ●");
        }
    }

    public static void delete() {

    }

    public static void selectAllBooks() {

    }
}
