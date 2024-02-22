package inheritance.ex;

public class MusicTrack {

    protected String title;
    protected String artist;
    protected int duration;

    public MusicTrack(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist + " ...now : " + duration + " seconds ♪");
    }
}
