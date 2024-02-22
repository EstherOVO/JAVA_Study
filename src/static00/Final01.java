package static00;

public class Final01 {
    public static void main(String[] args) {

        Person person = new Person("123456-7891011", "Gildong, Hong");

        System.out.println(person.nation);      // final 필드 초기값 할당
        System.out.println(person.name);        // 생성자 시점 초기값 할당
        System.out.println(person.ssn);

//      개명 신청
        person.name = "Jiwon, Hong";   // 일반 필드 변경 가능
//      주민번호(final) 변경 불가
//      person.ssn = "123456-7891012"; // final 필드 변경 불가능
//      국적(final) 변경 불가
//      person.nation = "America";     // final 필드 변경 불가능

        System.out.println(person.name);
    }
}
