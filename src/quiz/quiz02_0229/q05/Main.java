package quiz.quiz02_0229.q05;

public class Main {
    public static void main(String[] args) {

        SendMessageSystem sendMessageSystem = new SendMessageSystem();

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        sendMessageSystem.setMessage("다중 메시지 전송 테스트입니다.");
        sendMessageSystem.send(senders);

    }
}
