package static00;

public class Static04 {
    public static void main(String[] args) {

//      객체 생성없이 정적 호출
        StaticTest.staticInnerCall();

//      객체 생성 없이는 인스턴스 메소드 호출 불가

//      객체 생성하여 인스턴스 메소드 호출
        StaticTest test = new StaticTest();
        test.innerCall();           // 인스턴스 메소드 호출
        test.staticInnerCall();     // 정적 메소드 호출(컴파일 에러는 없음)
//      → static 메소드 호출을 인스턴스에서 하는 방식을 권장하지 않음(경고가 뜸)


    }
}
