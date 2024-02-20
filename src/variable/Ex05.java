package variable;

public class Ex05 {
    public static void main(String[] args) {

/*
       이름 : 홍길동
       나이 : 25
       전화 : 010-1234-5678
*/

         String name = "홍길동";
         int age = 25;
         String tel1 = "010", tel2 = "1234", tel3 = "5678";

        System.out.println("이름 : " + name);
        System.out.print("나이 : " + age);
        System.out.printf("\n전화 : %s-%s-%s", tel1, tel2, tel3);
//      (내가 적은 답 : System.out.printf("\n전화 : %s", tel1 + "-" + tel2 + "-" + tel3);

    }
}
