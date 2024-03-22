package quiz.quiz05_0322.q02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz02 {
    public static void main(String[] args) {

        Set<Integer> lottoNumber = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            lottoNumber.add(new Random().nextInt(45) + 1);
        }

        System.out.println("♣ 로또 번호 ♣ ");
        lottoNumber.forEach(System.out::println);
    }
}
