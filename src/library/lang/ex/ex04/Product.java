package library.lang.ex.ex04;

import java.util.Objects;

public class Product {

    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;
        return Objects.equals(name, ((Product) obj).name) && price == product.price && quantity == product.quantity;
    }

    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "상품 : [%s] | 가격 : [%,d원] | 수량 : [%,d개]".formatted(name, price, quantity);
    }
}
