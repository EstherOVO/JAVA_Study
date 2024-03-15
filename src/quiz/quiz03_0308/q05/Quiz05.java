package quiz.quiz03_0308.q05;

public class Quiz05 {
    public static void main(String[] args) {

        Product product1 = new Product("귤", 1000, 15);
        Product product2 = new Product("귤", 1000, 15);

        System.out.println("· equals 메서드 호출 결과 : " + product1.equals(product2));
        System.out.println("· hashCode 메서드 호출 결과(product1) : " + product1.hashCode());
        System.out.println("· hashCode 메서드 호출 결과(product2) : " + product2.hashCode());
        System.out.println("· toString 메서드 호출 결과(product1) : " + product1.toString());
        System.out.println("· toString 메서드 호출 결과(product2) : " + product2.toString());
    }
}
