package inheritance.ex;

public class MusicTrakc_Ex02 {
    public static void main(String[] args) {

/*
        음악 플레이어 시스템 구현
        음악 플레이어 시스템을 위한 자바 프로그램을 작성합니다.
        이 시스템은 모든 음악 트랙(MusicTrack)을 관리하며,
        특별한 유형의 트랙으로 ClassicalMusicTrack과 PopMusicTrack을 다룹니다.
        이 세 유형의 트랙은 음악의 기본 정보를 공유하지만, 각각의 특성에 맞는 추가 정보도 관리해야 합니다.

        MusicTrack 클래스:
        공통 필드: title (트랙 제목), artist (아티스트), duration (재생 시간, 초 단위)
        메소드: play() - 트랙 재생을 나타내는 메시지를 출력(예: "Playing [title] by [artist]")

        ClassicalMusicTrack 클래스:
        MusicTrack 클래스로부터 상속받습니다.
        추가 필드: composer (작곡가)
        play() 메소드를 오버라이딩하여, 작곡가 정보도 함께 출력합니다.

        PopMusicTrack 클래스:
        MusicTrack 클래스로부터 상속받습니다.
        추가 필드: album (앨범 이름)
        play() 메소드를 오버라이딩하여, 앨범 정보도 함께 출력합니다.

        MusicPlayer 클래스:
        main 메소드에서 다음을 수행합니다:
        각 유형의 트랙 객체를 생성합니다.
        생성된 모든 트랙을 재생합니다.

        출력 예시
        ===
        Playing Symphony No. 9 by Beethoven, Composer: Beethoven
        Playing Shape of You by Ed Sheeran, Album: Divide
*/

        ClassicMusicTrack classicMusicTrack = new ClassicMusicTrack("Symphony No. 9", "Beethoven", 120, "Beethoven");
        PopMusicTrack popMusicTrack = new PopMusicTrack("Shape of You", "Ed Sheeran", 150, "Divide");

        classicMusicTrack.play();
        popMusicTrack.play();
    }
}
