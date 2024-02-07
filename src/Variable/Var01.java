package Variable;

public class Var01 {
    public static void main(String [] args) {

        int age;             // 정수를 저장할 수 있는 age 이름의 변수 선언
        double value;        // 실수를 저장할 수 있는 value 이름의 변수 선언

        int x, y, z;         // 같은 종류의 변수는 한번에 선언 가능

        int score;           // 변수 선언 : 타입 변수 이름
        score = 90;          // 변수 초기화(설정되지 않은 변수를 설정) : 변수 이름
        System.out.println("Score : " + score);
        score = 100;
        System.out.println("Score : " + score);

//      int score = 80;      // 변수 선언은 한 번만 가능
//      score = 80.5         // 타입 변수와 값이 일치하지 않음(타입 > 정수 / 점수 > 실수)

        int number = 100;    // 선언과 초기와 동시에 가능
        int result = score + number;    // 다른 변수의 값을 불러들여 저장 또는 연산 가능
        System.out.println("Result : " + result);

    }
}
