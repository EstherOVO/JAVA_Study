package inheritance.ex;

public class ClassicMusicTrack extends MusicTrack {

    private String composer;

    public ClassicMusicTrack(String title, String artist, int duration, String composer) {
        super(title, artist, duration);
        this.composer = composer;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist + " | Composer : " + composer + " ...now : " + duration + " seconds ♪");
    }
}
