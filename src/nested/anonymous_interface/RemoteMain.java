package nested.anonymous_interface;

public class RemoteMain {
    public static void main(String[] args) {

        RemoteControl audioRemote = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
                volumeUp(); // 익명 객체 내부에서 호출 가능
            }

            public void volumeUp() {
                System.out.println("볼륨을 올립니다.");
            }
        };

        Anonymous anonymous = new Anonymous();

//      1. 필드를 통한 익명 구현 객체 접근
        anonymous.airControl.turnOn();

//      2. 로컬 변수를 통한 접근
        anonymous.method();
        audioRemote.turnOn();
//      audioRemote.volumeUp(); → 익명 객체 외부에서는 내부에서 지정한 메소드 호출 불가

//      3. 매개 변수를 통한 접근
        anonymous.methodParam(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("컴퓨터를 켭니다.");
            }
        });
    }
}
