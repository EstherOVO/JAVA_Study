package Class_.Ex;

import java.text.DecimalFormat;

public class Ex04 {
    public static void main(String[] args) {
/*
        3번 연습문제를 리팩토링하세요.
        createOrder 메소드를 통해 상품 주문 객체를 생성해 주세요.
        printOrder 메소드를 통해 상품 정보를 출력해 주세요.
        getTotalPayment 메소드를 통해 총 결제 금액을 구해주세요.
 */

        ProductOrder product1 = createOrder("빵부장 소금", 1700, 100);
        ProductOrder product2 = createOrder("빵부장 초코", 1700, 200);

        
        ProductOrder[] products = {product1, product2};

        DecimalFormat formatter = new DecimalFormat("###,###");

        System.out.println("=======================");
        for (int i = 0; i < products.length; i++) {
            printOrder(products[i]);
            if (i == products.length -1) {
                int sum = 0;
                for (int k = 0; k < products.length; k++) {
                    sum += products[k].price * products[k].quantity;
                }
                System.out.println("▣ 총 결제 금액 : " + formatter.format(sum) + "원");
            }
        }
    }

    private static void printOrder(ProductOrder products) {
        System.out.println("· 제품명 : " + products.name + "\n· 가격 : " + products.price + "원" + "\n· 주문수량 : " + products.quantity + "개");
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