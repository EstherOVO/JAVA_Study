package inheritance.ex;

public class ReferenceBook extends Book {

    private String field;

    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    public void displayInfo() {
        System.out.println("Title : " + title + " | Author : " + author + " | Year : " + year + " | Field : " + field);
    }
}
