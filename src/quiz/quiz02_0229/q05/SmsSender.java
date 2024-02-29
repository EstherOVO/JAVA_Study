package quiz.quiz02_0229.q05;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("▨ SMS 발송 : " + message);
    }
}
