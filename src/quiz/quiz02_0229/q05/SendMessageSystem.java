package quiz.quiz02_0229.q05;

public class SendMessageSystem {

    String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void send(Sender[] senders) {
        for (Sender sender : senders) {
            sender.sendMessage(message);
        }
    }
}
