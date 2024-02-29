package nested.anonymous_interface;

public class Anonymous {

//  1. 필드의 초기값으로 익명 객체 구현
    RemoteControl airControl = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("에어컨을 켭니다.");
        }
    };

//  2. 로컬 변수 값으로 익명 구현 객체 대입
    void method() {
        RemoteControl radioRemote = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("라디오를 켭니다.");
            }
        };
        radioRemote.turnOn();
    }

//  3. 매개 변수 입력으로 인터페이스 구현 객체를 받을 수 있다.
    void methodParam(RemoteControl remoteControl) {
        remoteControl.turnOn();
    }
}
