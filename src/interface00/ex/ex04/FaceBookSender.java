package interface00.ex.ex04;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 발송 결과 : " + message);
    }
}
