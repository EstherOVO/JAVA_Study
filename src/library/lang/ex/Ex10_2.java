package library.lang.ex;

public class Ex10_2 {
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

        String people = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        String[] splitSemiColon = people.split(";");
        StringBuilder sb = new StringBuilder();
        int maxAge = 0;
        String oldestUser = "";
        int kimCount = 0;

        System.out.println("§ 전체 사용자 수 : " + splitSemiColon.length + "명");
        System.out.println("§ 사용자 정보 : ");
        for (int i = 0; i < splitSemiColon.length; i++) {

            String[] splitComma = splitSemiColon[i].split(",");
            String name = splitComma[0];
            String age = splitComma[1];
            String email = splitComma[2];

//          2.
            System.out.println("(" + (i + 1) + ")" + " 이름 : " + name + " | 나이 : " + age + "세 | 이메일 : " + email);

//          3.
            if (email.endsWith("gmail.com")) {
                sb.append("\n- " + name);
            }

//          4.
            int ageInt = Integer.parseInt(age);
            if (maxAge < ageInt) {
                maxAge = ageInt;
                oldestUser = name;
            }

//          5.
            if (name.startsWith("김")) {
                kimCount++;
            }
        }

        System.out.println("§ 지메일 사용자 : " + sb.toString());
        System.out.println("§ 가장 나이가 많은 사용자 : [이름 : " + oldestUser + " | 나이 : " + maxAge + "세]");
        System.out.println("§ 김가네 : " + kimCount + "명");
    }
}