package interface00.ex.ex01;

public class MP3Player implements Plyable {
    @Override
    public void play() {
        System.out.println("MP3 플레이어에서 노래를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("MP3 플레이어에서 노래를 일시 정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 노래를 멈춥니다.");
    }
}
