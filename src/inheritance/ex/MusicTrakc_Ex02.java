package inheritance.ex;

public class MusicTrakc_Ex02 {
    public static void main(String[] args) {

        ClassicMusicTrack classicMusicTrack = new ClassicMusicTrack("Symphony No. 9", "Beethoven", 120, "Beethoven");
        PopMusicTrack popMusicTrack = new PopMusicTrack("Shape of You", "Ed Sheeran", 120, "Divide");

        classicMusicTrack.play();
        popMusicTrack.play();
    }
}
