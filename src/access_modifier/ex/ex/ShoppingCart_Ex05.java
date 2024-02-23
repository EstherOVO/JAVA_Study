package access_modifier.ex.ex;

import access_modifier.ex.Item;
import access_modifier.ex.ShoppingCart;

public class ShoppingCart_Ex05 {
    public static void main(String[] args) {

/*
        장바구니

        Item 클래스와 ShoppingCart 클래스를 설계하세요.

        요구사항
        ===
        Item 클래스와 ShoppingCart 클래스는 다른 패키지에서도 사용 가능해야 합니다.
        ShoppingCart에는 상품(Item 객체)을 최대 10개까지만 담을 수 있습니다.
        10개 초과하여 상품을 추가하려고 하면, "장바구니가 가득 찼습니다."를 출력합니다.

        메인 메소드로 실행할 경우 다음과 같은 결과를 출력합니다.
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            Item item1 = new Item("당근", 1500, 3);
            Item item2 = new Item("양파", 2000, 5);
            cart.addItem(item1);
            cart.addItem(item2);
            cart.displayItems();
        }

        실행 결과
        ===
        장바구니 상품 출력
        상품명 : 당근, 합계 : 4500
        상품명 : 양파, 합계 : 10000
        전체 가격 합 : 14500

        Hint
        ===
        Item 클래스의 필드 String name, int price, int quantity
        ShoppingCart 클래스의 필드 Item[] items, int itemCount
*/

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("당근", 10000, 1);
        Item item2 = new Item("양파", 10000, 1);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        Item item3 = new Item("사과", 10000, 1);
        Item item4 = new Item("오렌지", 10000, 1);
        Item item5 = new Item("애호박", 10000, 1);
        Item item6 = new Item("대파", 10000, 1);
        Item item7 = new Item("미역", 10000, 1);
        Item item8 = new Item("시금치", 10000, 1);
        Item item9 = new Item("멸치", 10000, 1);
        Item item10 = new Item("어묵", 10000, 1);
        Item item11 = new Item("마라", 10000, 1);
        shoppingCart.addItem(item3);
        shoppingCart.addItem(item4);
        shoppingCart.addItem(item5);
        shoppingCart.addItem(item6);
        shoppingCart.addItem(item7);
        shoppingCart.addItem(item8);
        shoppingCart.addItem(item9);
        shoppingCart.addItem(item10);
        shoppingCart.addItem(item11);

        shoppingCart.displayItems();
    }
}
