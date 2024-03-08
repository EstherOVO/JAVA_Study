package quiz.quiz03_0308.q5;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "□ 상품 : %s | □ 가격 : %,d원 | □ 수량 : %,d개".formatted(name, price, quantity);
    }
}
