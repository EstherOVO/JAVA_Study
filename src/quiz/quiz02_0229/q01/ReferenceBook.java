package quiz.quiz02_0229.q01;

public class ReferenceBook extends Book {

    private String field;

    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title : " + title + " | Author : " + author + " | Year : " + year + " | Field : " + field);
    }
}
