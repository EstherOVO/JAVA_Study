package Class00.Ex;

import java.util.Scanner;

public class Animal_Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력하실 동물 수를 말씀해 주세요 : ");
        int number = scanner.nextInt();

        Animal[] animals = new Animal[number];

        for (int i = 0; i < number; i++) {
            System.out.print("- 종 : ");
            String specie = scanner.next();

            System.out.print("- 이름 : ");
            String name = scanner.next();

            System.out.print("- 나이 : ");
            int age = scanner.nextInt();

            animals[i] = new Animal(specie, name, age);
        }

        for (int j = 0; j < animals.length; j++) {
            animals[j].output();
        }
    }
}
