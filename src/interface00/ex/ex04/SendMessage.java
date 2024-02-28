package interface00.ex.ex04;

public class SendMessage {

    private String message;

    public void send(Sender[] senders, String message) {
        for (Sender sender : senders) {
            sender.sendMessage(message);
        }
    }
}
