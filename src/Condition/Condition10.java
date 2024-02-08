package Condition;

public class Condition10 {
    public static void main(String[] args) {

        int diceNumber = (int) (Math.random() * 6) + 1;

//      향상된 switch문 : 자바 14버전 이후부터 사용 가능
        switch (diceNumber) {
            case 1 -> System.out.println("1번입니다.");
            case 2 -> System.out.println("2번입니다.");
            case 3 -> System.out.println("3번입니다.");
            case 4 -> System.out.println("4번입니다.");
            case 5 -> System.out.println("5번입니다.");
            default -> System.out.println("6번입니다.");
        }

    }
}
