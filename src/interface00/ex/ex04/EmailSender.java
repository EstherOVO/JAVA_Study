package interface00.ex.ex04;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("E-MAIL 발송 결과 : " + message);
    }
}
