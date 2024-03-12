package generic.ex.ex04;

public class Book implements Media {

    String title;
    String author;

    @Override
    public String getTitle() {
        return title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
