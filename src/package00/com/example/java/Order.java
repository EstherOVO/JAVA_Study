package package00.com.example.java;

import package00.com.example.java.item.Item;
import package00.com.example.java.member.Member;

public class Order {
    Member member;
    Item item;

    public Order(Member member, Item item) {
        this.member = member;
        this.item = item;
    }
}
