package nested.anonymous_interface;

public class RemoteMain {
    public static void main(String[] args) {

        RemoteControl audioRemote = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
            }
        };
    }
}
