package access_modifier.ex;

public class ShoppingCart {

    Item[] items;
    int itemCount;

    public ShoppingCart() {
        items = new Item[10];
    }

    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니는 최대 10개만 담을 수 있습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        System.out.println("= 장바구니 상품 출력 =");
        for (int i = 0; i < itemCount; i++) {
                System.out.println("상품명 : " + items[i].getName() + " / 합계 : " + items[i].getSum());
        }

        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].getSum();
        }
        System.out.println(sum);
    }
}
