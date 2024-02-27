package solid.ocp.after;

public class NavarPayment implements Payment {

    @Override
    public void processPayment() {
        System.out.println("네이바페이 결제를 진행합니다.");
    }
}
