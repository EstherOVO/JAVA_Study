package Variable;

import java.util.Scanner;

public class Ex06 {
        public static void main(String[] args) {

//          빈 칸을 채우고 타입이 어떻게 왜 변하는지 설명하라.

//          프로모션 문제
            int num1 = 10;
            long num2 = 20L;
            long result = num1+num2;    // long 대신에 float도 가능함

            // 캐스팅 문제
            double num3 = 10.5;
            int result2 = (int) num3;

            // 프로모션과 캐스팅
            int num4 = 10;
            double num5 = 5.5;
            int result3 = num4 + (int) num5;
            System.out.println(result3);

        }
    }
