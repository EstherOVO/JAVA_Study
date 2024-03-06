package library.lang;

public class StringMethod04 {
    public static void main(String[] args) {

//      13. toUpperCase() & toLowerCase() : 대소문자 변환
        String hello = "Hello, Java!";
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());

//      대소문자를 엄격하게 구분하기 때문에 포함 여부를 일반적으로는 확인하기 어렵다.
        String sentence = "Hello, How are you?";
        boolean res1 = sentence.contains("how");
        System.out.println("res1 = " + res1);   // false

//      따라서 영문 텍스트 검색에서 대소문자 입력 무관하게 포함 여부 확인 시 활용
        if (sentence.toLowerCase().contains("HoW".toLowerCase()))
            System.out.println("how 단어를 포함합니다.");
        else {
            System.out.println("how 단어를 포함하지 않습니다.");
        }
    }
}
