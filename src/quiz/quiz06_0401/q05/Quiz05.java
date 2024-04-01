package quiz.quiz06_0401.q05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz05 {
    public static void main(String[] args) {

        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4));

        System.out.println("* ~ 전체 품목 ~ *");
        reviews.stream()
                .sorted(Comparator.comparing(ProductReview::getName))
                .forEach(System.out::println);

        double avg = reviews.stream()
                .mapToInt(ProductReview::getScore)
                .average()
                .orElse(Double.NaN);
        System.out.println("▣ 평균 리뷰 점수 : " + avg + "점");

        long has5Score = reviews.stream()
                .filter(productReview -> productReview.score >= 5)
                .sorted(Comparator.comparing(ProductReview::getScore))
                .peek(System.out::println)
                .count();
        System.out.println("▣ 5점 리뷰 수 : " + has5Score + "개");

    }

    public static class ProductReview {

        String name;
        int score;

        public ProductReview(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return String.format("[제품명 : %s] %d점", name, score);
        }
    }
}
