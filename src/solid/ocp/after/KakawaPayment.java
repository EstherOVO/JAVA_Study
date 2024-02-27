package solid.ocp.after;

public class KakawaPayment implements Payment {

    @Override
    public void processPayment() {
        System.out.println("카카와페이 결제를 진행합니다.");
    }
}
