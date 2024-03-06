package library.lang;

public class StringMethod02 {
    public static void main(String[] args) {

        String str = "오늘은 3월 6일이고, 곧 점심시간이네요!";

//      5. charAt() : (인덱스)번 째 '문자(char)'를 반환한다.
        char c1 = str.charAt(0);
        System.out.println("c1 = " + c1);
        char c10 = str.charAt(10);
        System.out.println("c10 = " + c10);
        char cLast = str.charAt(str.length() - 1);
        System.out.println("cLast = " + cLast);

        String sentence = "대한사람 대한으로 길이 보전하세~ 대한독립 만세!";

//      6. indexOf() : 문자열에서 index 위치를 int로 반환한다.
        int i1 = sentence.indexOf("대한");    // 문자열의 시작 위치부터 찾는다.
        System.out.println("i1 = " + i1);
        int i2 = sentence.indexOf("대한", 3);     // 두 번째 인자 인덱스 위치부터 찾아서 처음 발견하는 위치 반환한다.
        System.out.println("i2 = " + i2);

        sentence.indexOf("대한", 3, 10);
        int i3 = sentence.lastIndexOf("대한");     // 끝에서부터 찾아서 발견한 인덱스 반환

        System.out.println("i3 = " + i3);
    }
}
