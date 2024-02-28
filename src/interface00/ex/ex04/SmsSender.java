package interface00.ex.ex04;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 발송 결과 : " + message);
    }
}
