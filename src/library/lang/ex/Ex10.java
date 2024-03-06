package library.lang.ex;

public class Ex10 {
    public static void main(String[] args) {

/*
        요구사항 :
        사용자 정보가 담긴 문자열 데이터가 있습니다.
        각 사용자 정보는 세미콜론(;)으로 구분되어 있으며,
        각 사용자의 정보 내에서는 이름, 나이, 이메일이 콤마(,)로 구분되어 있습니다.
        이 데이터를 파싱하여 다음 정보를 출력하는 프로그램을 작성하세요.

        - 전체 사용자 수
        - 각 사용자의 이름, 나이, 이메일 정보 출력
        - 입력된 사용자 중 이메일 도메인이 "gmail.com"인 사용자의 이름을 출력
        - 가장 나이가 많은 사용자의 이름과 나이 출력
        - 이름에 "김"이 포함된 사용자 수
*/

        String str = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        int memberNumber = str.split(";").length;
        System.out.println("1. 전체 사용자 수 : " + memberNumber + "명");


        System.out.println("2. 사용자 정보 : ");
        String[] a = str.split(";");
        for (int i = 0; i < a.length; i++) {
            String[] b = a[i].split(",");
            System.out.println("이름 : " + b[0] + " | 나이 : " + b[1] + " | 이메일 : " + b[2]);
        }

        System.out.println("3. \"gmail.com\" 도메인 사용자");
        String[] aa = str.split(";");
        for (int i = 0; i < aa.length; i++) {
            if (aa[i].contains("gmail.com")) {
                System.out.println(aa[i].substring(0, 3));
            }
        }

        String[] aaa = str.split(";");
        int[] i1 = new int[4];
        for (int i = 0; i < a.length; i++) {
            String[] b = a[i].split(",");
            i1[i] = Integer.parseInt(b[1]);
        }
        int max = 0;
        for (int i = 0; i < i1.length; i++) {
            if (max < i1[i]) {
                max = i1[i];
            }
        }
        System.out.println(max);
        String AA = String.valueOf(max);
        for (int i = 0; i < aaa.length; i++) {
            if (aaa[i].contains(AA)) {
                System.out.println(aaa[i].substring(0, 3));
            }
        }


        int aCount = str.length() - str.replace("김", "").length();
        System.out.println("김 개수 : " + aCount);
    }
}
