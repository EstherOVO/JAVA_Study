package solid.ocp.after;

public class NavarPayment implements Payment {

//  새로운 결제 방법 확장에는 열려있다.
    @Override
    public void processPayment() {
        System.out.println("네이바페이 결제를 진행합니다.");
    }
}
