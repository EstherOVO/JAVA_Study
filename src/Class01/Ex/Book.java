package Class01.Ex;

public class Book {

    String title;
    String author;
    String isbn;
    boolean isAvailable;

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    boolean borrowBook() {
        if (isAvailable) {
            System.out.println("\"" + title + "\"은(는) 대여가 가능합니다.\n");
            return true;
        } else if (!isAvailable) {
            System.out.println("\"" + title + "\"은(는) 대여가 불가능합니다.\n");
            return false;
        }
        return borrowBook();
    }

    boolean returnBook() {
        isAvailable = true;
        return isAvailable;
    }

    void printInfo() {
        System.out.println("§ 현재 검색하신 도서 정보 §" + "\n- 책 제목 : " + title + "\n- 저자 : " + author);
        if (isAvailable) {
            System.out.println("- 대출가능여부 : 대출 가능\n");
        } else if (!isAvailable) {
            System.out.println("- 대출가능여부 : 대출 불가\n");
        }
    }
}
