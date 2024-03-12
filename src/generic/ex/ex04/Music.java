package generic.ex.ex04;

public class Music implements Media {

    String title;
    String artist;

    @Override
    public String getTitle() {
        return title;
    }

    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}
