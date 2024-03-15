package quiz.quiz04_0315.q02;

public class Quiz02 {
    public static void main(String[] args) {

        String people = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        String[] person = people.split(";");
        StringBuilder sb = new StringBuilder();
        int ageMax = 0;
        String oldestUser = "";
        int kimUsers = 0;

//      1. 전체 사용자 수
        System.out.println("◐ 전체 사용자 수 : " + person.length + "명");

        System.out.println("◑ 사용자 정보 : ");
        for (int i = 0; i < person.length; i++) {
            String[] personalInfo = person[i].split(",");

            String name = personalInfo[0];
            String age = personalInfo[1];
            String email = personalInfo[2];

//          2. 사용자 정보
            System.out.println(String.format("· 이름 : %s | · 나이 : %s세 | · 이메일 : %s", name, age, email));

//          3. 지메일 사용자
            if (email.endsWith("gmail.com")) {
                sb.append("\n· " + name);
            }

//          4. 가장 나이가 많은 사용자
            if (ageMax < Integer.parseInt(age)) {
                ageMax = Integer.parseInt(age);
                oldestUser = name;
            }

//          5. 이름에 "김"이 포함된 사용자 수
            if (name.startsWith("김")) {
                kimUsers++;
            }
        }

        System.out.println("◐ \"gmail.com\" 사용자 : " + sb);

        System.out.println(String.format("◑ 가장 나이가 많은 사용자 : %s(%d세)", oldestUser, ageMax));

        System.out.println("◐ \"김\"씨 성을 가진 유저 : " + kimUsers + "명");
    }
}
