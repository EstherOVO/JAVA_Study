package library.lang;

public class MathClass {
    public static void main(String[] args) {

//      Math 클래스 : 수학 계산
//      모든 메서드가 static 메서드이다.
        double num1 = -10.5;
        double num2 = 4.5;

        System.out.println("절대값 : " + Math.abs(num1));
        System.out.println("올림 : " + Math.ceil(num1));
        System.out.println("내림 : " + Math.floor(num1));
        System.out.println("최댓값 : " + Math.max(num1, num2));
        System.out.println("최솟값 : " + Math.min(num1, num2));
        System.out.println("제곱 : " + Math.pow(4, 2));   // 첫 번째 인자의 두 번째 인자 승
        System.out.println("제곱근 : " + Math.sqrt(16));
        System.out.println("랜덤값 : " + Math.random());   // 0 ~ 1까지 랜덤 수 반환
        System.out.println("반올림 : " + Math.round(num2));
        System.out.println("사인 : " + Math.sin(Math.PI / 2));
        System.out.println("사인 : " + Math.cos(Math.PI / 2));
        System.out.println("사인 : " + Math.tan(Math.PI / 2));
        System.out.println("자연로그 : " + Math.log(Math.E));
    }
}
