package inheritance;

public class DmbCellPhone extends CellPhone {

//  필드 → super 클래스의 필드는 모두 가지고
    int channel;        // 새로운 필드를 추가한다.

//  메소드 → super 클래스의 필드를 가지고
    void turnOnDmb() {  // 새로운 기능 추가
        System.out.println(channel + "번 DMB 방송을 수신합니다.");
    }
}
