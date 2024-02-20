package access_modifier.ex.ex;

import access_modifier.ex.Item;
import access_modifier.ex.ShoppingCart;

public class ShoppingCart_Ex05 {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("당근", 1500, 3);
        Item item2 = new Item("양파", 2000, 5);
        Item item3 = new Item("양파", 2000, 5);
        Item item4 = new Item("양파", 2000, 5);
        Item item5 = new Item("양파", 2000, 5);
        Item item6 = new Item("양파", 2000, 5);
        Item item7 = new Item("양파", 2000, 5);
        Item item8 = new Item("양파", 2000, 5);
        Item item9 = new Item("양파", 2000, 5);
        Item item10 = new Item("양파", 2000, 5);
        Item item11 = new Item("양파", 2000, 5);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);
        cart.addItem(item7);
        cart.addItem(item8);
        cart.addItem(item9);
        cart.addItem(item10);
        cart.addItem(item11);
        cart.displayItems();
    }
}
