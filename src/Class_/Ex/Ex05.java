package Class_.Ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

//      4번 연습문제에서 주문을 입력받아 등록하고
//      총 결제금액을 만들 수 있도록 수정해 주세요.

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개를 주문하시겠습니까? ");
        int orderNumber = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[orderNumber];

        System.out.println("주문 상세 기록을 작성해 주세요.");

        for (int s = 0; s < orders.length; s++) {
            System.out.println(s + 1 + "번째 주문을 입력해 주세요.");

            System.out.print("상품명 : ");
            String eneterdName = scanner.next();
            System.out.print("가격 : ");
            int enteredPrice = scanner.nextInt();
            System.out.print("수량 : ");
            int enteredQuantity = scanner.nextInt();
            scanner.nextLine(); // 입력받는 버퍼 라인을 비움

            orders[s] = createOrder(eneterdName, enteredPrice, enteredQuantity);
        }

        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("=======================");
        for (int i = 0; i < orders.length; i++) {
            printOrder(orders[i]);
            if (i == orders.length - 1) {
                int sum = 0;
                for (int k = 0; k < orders.length; k++) {
                    sum += orders[k].price * orders[k].quantity;
                }
                System.out.println("▣ 총 결제 금액 : " + formatter.format(sum) + "원");
            }
        }
    }

    private static void printOrder(ProductOrder products) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("· 제품명 : " + products.name + "\n· 가격 : " + formatter.format(products.price) + "원" + "\n· 주문수량 : " + formatter.format(products.quantity) + "개");
        System.out.println("=======================");
    }

    public static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder createOrder = new ProductOrder();
        createOrder.name = name;
        createOrder.price = price;
        createOrder.quantity = quantity;
        return createOrder;
    }
}