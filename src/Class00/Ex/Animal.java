package Class00.Ex;

import java.util.Scanner;

public class Animal {
    String specie;
    String name;
    int age;

    Animal(String s, String n, int a) {
        specie = s;
        name = n;
        age = a;
    }

    void output() {
        System.out.println("=== 확인란 ===");
        System.out.println("§ 종 : " + specie + "\n§ 이름 : " + name + "\n§ 나이 : " + age);
    }
}
