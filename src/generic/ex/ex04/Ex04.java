package generic.ex.ex04;

public class Ex04 {
    public static void main(String[] args) {

        MediaLibrary<Book> bookLibrary = new MediaLibrary<>();
        bookLibrary.addMedia(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        MediaLibrary<Movie> movieLibrary = new MediaLibrary<>();
        movieLibrary.addMedia(new Movie("Inception", "Christopher Nolan"));

        System.out.print("Books : ");
        bookLibrary.printMediaTitles();

        System.out.print("Movies : ");
        movieLibrary.printMediaTitles();

    }
}
