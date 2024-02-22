package static00;

public class Final04 {
    public static void main(String[] args) {

        Member member = new Member("H", "홍길동");
        member.printMember();
//      ...
        member.modifyMember("HH", "홍지원");
//      만약 id를 기준으로 다른 프로그램에서 참조하고 있는 로직이 있다면...

        member.printMember();
//      혹시나 id 값이 잘못 들어오더라도 final 키워드를 사용하면 원천 차단이 가능하다.(final 값이 막아준다.)
    }
}
