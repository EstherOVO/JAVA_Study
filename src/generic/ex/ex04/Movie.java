package generic.ex.ex04;

public class Movie implements Media<Movie> {

    public String title;
    public String director;

    @Override
    public String getTitle() {
        return title;
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
}
