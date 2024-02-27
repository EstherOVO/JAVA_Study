package solid.ocp.before;

// OCP(개방 폐쇄 원칙)
// 다양한 결제 방법을 갖는 결제 프로세서
// 새로운 결제 방법이 추가될 때 확장에는 열리고, 수정에는 닫힐 수 있게 클래스를 설계
public class PaymentProcessor {

//  결제 방법이 추가될 때마다 해당 메소드를 수정해야 한다.
    public void processPayment(String paymentType) {
        if (paymentType.equals("creditCard")) {
            System.out.println("신용카드 결제를 진행합니다.");
        } else if (paymentType.equals("kakawaPay")) {
            System.out.println("카카와페이 결제를 진행합니다.");
        }
//        새로운 결제 방법이 추가됐을 때...
          else if (paymentType.equals("navarPay")) {
            System.out.println("네이바페이 결제를 진행합니다.");
        } else {
            System.out.println("기본 결제를 진행합니다.");
        }
    }
}
