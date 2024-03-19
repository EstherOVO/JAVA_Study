package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, 250),
                new Product("Smartphone", 499.99, 300),
                new Product("Tablet", 199.99, 300),
                new Product("Smartwatch", 199.99, 150)
        );

        List<Product> list = products.stream()
                .sorted(Comparator.comparing(Product::getReviews).reversed().thenComparing(Product::getPrice))
                .toList();

        list.forEach(System.out::println);
    }

    public static class Product {

        String name;
        double price;
        int reviews;

        public Product(String name, double price, int reviews) {
            this.name = name;
            this.price = price;
            this.reviews = reviews;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getReviews() {
            return reviews;
        }

        public String toString() {
            return String.format("%s - $%.2f | Reviews : %d", name, price, reviews);
        }
    }
}
