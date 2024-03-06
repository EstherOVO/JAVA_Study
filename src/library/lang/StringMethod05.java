package library.lang;

public class StringMethod05 {
    public static void main(String[] args) {

//      14. concat() : 문자열을 연결해 준다.
        String la1 = "라랄";
        String la2 = "랄라";
        String la3 = "라랄라";

        String lalala1 = la1 + la2 + la3;
        System.out.println(lalala1);

        String lala1 = la1.concat(la2);
        System.out.println(lala1);

        String lalalala = la1.concat(la2).concat(la3).concat(lalala1);
        System.out.println(lalalala);

//      단점 : concat() 메서드가 사용될 때마다 문자열이 새로 생성된다.
//      예를 들어 "라랄랄라" 1개, "라랄랄라라랄라" 1개, "라랄랄라라랄라라랄랄라라랄라" 1개 총 세 개의 문자열이 생성된다.

//      15. StringBuffer & StringBuilder : 변경이 가능한 문자열을 활용할 수 있다.
        StringBuffer stringBuffer;      // 다중 스레드 환경일 때 사용
        StringBuilder stringBuilder;    // 단일 스레드 환경일 때 사용 → 성능이 더 좋음

        StringBuilder sb = new StringBuilder();

//      메서드 체이닝 기법 : append() 메서드는 문자열 뒤에 내용을 추가하고
//      StringBuilder 타입을 return한다. 최종 문자열을 반환하고 싶을 때는 toString()을 사용한다.
        String result = sb.append(la1)
                .append(la2)
                .append(" ")
                .append(la3)
                .toString();
        System.out.println(result);

//      concat과 StringBuilder의 차이점 :
        String concat = "가".concat("나")
                .concat("다")
                .concat("라");
//              .concat(1)      문자열 이외의 다른 타입을 넣을 수 없다.
//              .concat(10.0);
//      게다가 "가", "나", "다", "라", "가나", "가나다", "가나다라"
//      메모리 상 총 7개의 문자열이 생성되어 공간을 차지한다.

        String builder = new StringBuilder("가")
                .append("나")
                .append("다")
                .append("라").toString();
//              .append(1)      문자열 이외의 다른 타입을 넣을 수 있다.
//              .append(10.0);
//      "가", "나", "다", "라", "가나다라"
//      메모리 상 총 5개의 문자열이 생성되어 공간을 덜 차지한다.

        StringBuilder sb2 = new StringBuilder("Hello");

//      append() : 문자열 끝에 다양한 타입 추가
        sb2.append(" Java");
        System.out.println(sb2.toString());     // Hello Java

//      insert() : 특정 위치에 문자열 삽입
        sb2.insert(5, " World");
        System.out.println(sb2.toString());     // Hello World Java

//      delete() : 특정 위치의 문자열 삭제
        sb2.delete(5, 11);
        System.out.println(sb2.toString());     // Hello Java

//      reverse() : 문자열 뒤집기
        sb2.reverse();
        System.out.println(sb2.toString());     // avaJ olleH

//      생성 후에도 문자열 변경 가능하며, 새로운 객체가 생성되지 않는다.
    }
}
