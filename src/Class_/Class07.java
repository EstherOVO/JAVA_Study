package Class_;

public class Class07 {
    public static void main(String[] args) {

//      라디오와 연관된 데이터를 라디오 객체로 묶음
        Radio radio = new Radio();  // 라디오 객체 생성

//      재사용이 가능한 기능들을 메소드로 추출하기
        turnOn(radio);              // 라디오 전원 켜기
        volumeUp(radio);            // 음량 높이기
        volumeDown(radio);          // 음량 줄이기
        showRadioStatus(radio);     // 라디오 상태 확인
        turnOff(radio);             // 라디오 전원 끄기

//      모듈화
//      - 코드 중복이 제거
//      - 같은 로직이 필요하면 메소드를 호출하면 됨
//      - 기능이 수정될 때, 메소드 내부만 변경하면 된다.
    }

//  라디오 전원 켜기 메소드
    static void turnOn(Radio radio) {
        radio.isOn = true;
        System.out.println("라디오 전원을 켰습니다.");
    }

//  음량 높이기 메소드
    static void volumeUp(Radio radio) {
        radio.volume++;
        System.out.println("라디오 음량 : " + radio.volume);
    }

//  음량 줄이기 메소드
    static void volumeDown(Radio radio) {
        radio.volume--;
        System.out.println("라디오 음량 : " + radio.volume);
    }

//  라디오 상태 확인 메소드
    static void showRadioStatus(Radio radio) {
        System.out.println("라디오 상태 확인");
        if (radio.isOn = true) {
            System.out.println("라디오 전원 켜짐(음량 : " + radio.volume + ")");
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }

//  라디오 전원 끄기 메소드
    static void turnOff(Radio radio) {
        radio.isOn = false;
        System.out.println("라디오를 종료합니다.");
    }
}
