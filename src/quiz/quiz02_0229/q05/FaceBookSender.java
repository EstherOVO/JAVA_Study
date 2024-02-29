package quiz.quiz02_0229.q05;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("▨ 페이스북 발송 : " + message);
    }
}
