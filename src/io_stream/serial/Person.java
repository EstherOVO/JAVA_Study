package io_stream.serial;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private double height;
    private boolean married;
    private double weight;
    private Career career;  // 직렬화에 내부 객체 타입이 있으면 해당 객체도 Serializable 을 구현해야 한다.

    public Person(String name, int age, double height, boolean married, double weight, Career career) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
        this.weight = weight;
        this.career = career;
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", age = " + age +
                ", height = " + height +
                ", married = " + married +
                ", weight = " + weight +
                ", career = " + career;
    }
}
