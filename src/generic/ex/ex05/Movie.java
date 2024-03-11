package generic.ex.ex05;

public class Movie implements Media {

    String title;
    String director;

    @Override
    public String getInfo() {
        return "Title : " + title + "\nDirector : " + director;
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
}
