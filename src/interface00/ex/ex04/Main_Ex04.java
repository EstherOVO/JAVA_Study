package interface00.ex.ex04;

public class Main_Ex04 {
    public static void main(String[] args) {

/*
        문제4. 다중 메시지 발송 시스템

        목표 : 한 번에 여러 수단을 통해 메시지를 발송하는 프로그램을 개발합니다.

        다형성을 활용하여 구현합니다.
        Sender 인터페이스를 정의하고, 이 인터페이스를 사용하여 메시지 발송 기능을 구현합니다.
        Sender 인터페이스에는 sendMessage(String message) 메소드가 포함되어야 합니다.
        다음 세 가지 메시지 발송 방식을 구현하는 클래스를 작성합니다:
        EmailSender: 이메일을 통한 메시지 발송을 담당합니다.
        SmsSender: SMS를 통한 메시지 발송을 담당합니다.
        FaceBookSender: 페이스북을 통한 메시지 발송을 담당합니다.
        각 발송 방식에 맞게 sendMessage 메소드를 구현하여, 적절한 메시지 발송 방식을 출력합니다.

        메인 메서드 :
        public class SendMain {
            public static void main(String[] args) {
                Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
                for (Sender sender : senders) {
                    sender.sendMessage("다중 메시지 전송 테스트입니다.");
                }
            }
        }

        출력 결과 :
        메일 발송 성공 : 다중 메시지 전송 테스트입니다.
        SMS 발송 성공 : 다중 메시지 전송 테스트입니다.
        페이스북 발송 성공 : 다중 메시지 전송 테스트입니다.
*/

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        SendMessage sendMessage = new SendMessage();
        sendMessage.send(senders, "다중 메시지 전송 테스트입니다.");
    }
}
