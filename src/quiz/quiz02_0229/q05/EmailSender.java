package quiz.quiz02_0229.q05;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("▨ 이메일 발송 : " + message);
    }
}
