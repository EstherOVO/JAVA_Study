package quiz.quiz05_0322.q02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz02 {
    public static void main(String[] args) {

        Set<Integer> lottoNumber = new HashSet<>();

        while (true) {

            if (lottoNumber.size() != 6) {
                lottoNumber.add(new Random().nextInt(45) + 1);
            } else {
                System.out.println("♣ 로또 번호 ♣");
                lottoNumber.forEach(System.out::println);
                return;
            }
        }
    }
}
