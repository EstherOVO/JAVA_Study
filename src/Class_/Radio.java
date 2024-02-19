package Class_;

public class Radio {

//  필드 : 라디오와 관련된 속성 데이터의 모음
    int volume;
    boolean isOn;

//  메소드 : 라디오와 관련된 기능 및 행동의 모음

//  라디오 전원 켜기
    void turnOn() {
        isOn = true;
        System.out.println("라디오 전원을 켰습니다.");
    }

    //  음량 높이기 메소드
    void volumeUp() {
        volume++;
        System.out.println("라디오 음량 : " + volume);
    }

    //  음량 줄이기 메소드
    void volumeDown() {
        volume--;
        System.out.println("라디오 음량 : " + volume);
    }

    //  라디오 상태 확인 메소드
    void showRadioStatus() {
        System.out.println("라디오 상태 확인");
        if (isOn = true) {
            System.out.println("라디오 전원 켜짐(음량 : " + volume + ")");
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }

    //  라디오 전원 끄기 메소드
    void turnOff() {
        isOn = false;
        System.out.println("라디오를 종료합니다.");
    }
}
