package Class_.Ex;

import java.text.DecimalFormat;

public class ProductOrder_Ex03 {
    public static void main(String[] args) {

        ProductOrder product1 = new ProductOrder();
        product1.name = "빵부장 소금";
        product1.price = 1700;
        product1.quantity = 100;

        ProductOrder product2 = new ProductOrder();
        product2.name = "빵부장 초코";
        product2.price = 1700;
        product2.quantity = 200;

        ProductOrder[] products = {product1, product2};

        DecimalFormat formatter = new DecimalFormat("###,###");

        System.out.println("=======================");
        for (int i = 0; i < products.length; i++) {
            System.out.println("· 제품명 : " + products[i].name + "\n· 가격 : " + products[i].price + "원" + "\n· 주문수량 : " + products[i].quantity + "개");
            System.out.println("=======================");
            if (i == products.length -1) {
                int sum = 0;
                for (int k = 0; k < products.length; k++) {
                    sum += products[k].price * products[k].quantity;
                }
                System.out.println("▣ 총 결제 금액 : " + formatter.format(sum) + "원");
            }
        }
    }
}

