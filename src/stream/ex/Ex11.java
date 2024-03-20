package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {

/*
        문제 10. 제품 리뷰 분석

        온라인 상점에서 판매되는 여러 제품에 대한 리뷰 점수가 있습니다.
        각 리뷰에는 제품 ID와 리뷰 점수(1~5)가 포함되어 있습니다.

        - 전체 제품에 대한 평균 리뷰 점수를 계산하세요.
        - 리뷰 점수가 5점인 리뷰의 수를 계산하세요.

        record ProductReview(String productName, int score) {}

        List<ProductReview> reviews = Arrays.asList(
            new ProductReview("product1", 5),
            new ProductReview("product2", 4),
            new ProductReview("product3", 5),
            new ProductReview("product4", 3),
            new ProductReview("product1", 4)
        );

        출력예시
        ===
        평균 리뷰 점수 : 4.2
*/

        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );

        System.out.println("= 전체 제품 목록 =");
        List<ProductReview> list1 = reviews.stream()
                .sorted(Comparator.comparing(ProductReview::score).reversed().thenComparing(ProductReview::productName))
                .toList();

        list1.forEach(System.out::println);

        double average = reviews.stream()
                .mapToInt(ProductReview::score)
                .average()
                .orElse(0);

        System.out.println("= 평균 리뷰 점수 : %.1f점 =".formatted(average));

        long count = reviews.stream()
                .filter(product -> product.score() >= 5)
                .count();

        System.out.println("= 리뷰 점수 5점 이상인 물품의 개수 : " + count + "개 =");

        List<ProductReview> list2 = reviews.stream()
                .filter(product -> product.score() >= 5)
                .sorted(Comparator.comparing(ProductReview::productName))
                .toList();

        list2.forEach(System.out::println);
    }

    record ProductReview(String productName, int score) {

        @Override
        public String toString() {
            return "[제품명 : " + productName + " | 점수 : " + score + "점]";
        }
    }
}
