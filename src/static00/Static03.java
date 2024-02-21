package static00;

public class Static03 {
    public static void main(String[] args) {


//      1. 객체 생성
//      StringDecoUtil util = new StringDecoUtil();

//      2. 객체를 통해 메소드에 접근해서 사용 → 인스턴스 메소드
//      System.out.println(util.decorate("안녕하세요"));

//      객체 생성없이 static 메소드 사용 → 클래스 메소드
        System.out.println(StringDecoUtil.decorate("안녕하세요"));
    }
}
