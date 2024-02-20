package quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {

        /*
        클래스 :
        상품 주문 클래스 만들기

        ProductOrder 클래스를 생성하고,
        상품명, 가격, 주문수량 필드를 만든다.
        productName, price, quantity

        상품, 가격, 수량을 3개 담아서
        총 결제금액을 계산하는 프로그램을 만들어보세요.

        출력예시
        =====
        상품명: 노트북, 가격 :1000000, 수량 : 2
        상품명: 마우스, 가격 :15000, 수량 : 3
        상품명: 키보드, 가격 :50000, 수량 : 1
        총 결제금액 : 2095000원
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("주문할 상품의 개수를 말씀해 주세요 : ");
        int productNumber = scanner.nextInt();

        ProductOrder[] productOrders = new ProductOrder[productNumber];

        for (int i = 0; i < productOrders.length; i++) {
            System.out.print("상품명 : ");
            String productName = scanner.next();
            System.out.print("가격 : ");
            int productPrice = scanner.nextInt();
            System.out.print("주문수량 : ");
            int productQuantity = scanner.nextInt();

            productOrders[i] = createProduct(productName, productPrice, productQuantity);
        }

        DecimalFormat formatter = new DecimalFormat("###,###");

        System.out.println("=====확인해 주세요======");
        int sum = 0;
        for (int j = 0; j < productOrders.length; j++) {
            printProductInfo(productOrders[j]);
            sum += productOrders[j].price * productOrders[j].quantity;
        }
        calcaulateTotalSum(sum);
    }

    private static void calcaulateTotalSum(int sum) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("▶ 총 결제 금액 : " + formatter.format(sum) + "원 ◀");
    }

    private static void printProductInfo(ProductOrder productOrder) {
        System.out.println("§ 상품명 : " + productOrder.name + "\n§ 가격 : " + productOrder.price + "원" + "\n§ 주문수량 : " + productOrder.quantity + "개");
        System.out.println("=====================");
    }

    public static ProductOrder createProduct(String productName, int productPrice, int productQuantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.name = productName;
        productOrder.price = productPrice;
        productOrder.quantity = productQuantity;
        return productOrder;
    }
}
