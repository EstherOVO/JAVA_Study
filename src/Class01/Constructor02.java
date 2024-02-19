package Class01;

public class Constructor02 {
    public static void main(String[] args) {

        Member member = new Member("홍길동", 80, 30);
        Member member1 = new Member("이순신", 100, 35);
//      Member member2 = new Member(); → 생성자가 존재할 때 입력값이 없는 생성자를 호출하면 컴파일 오류가 발생
        Member member2 = new Member("임꺽정", 40);

        Member[] members = {member, member1, member2};
        for (Member m : members) {
            System.out.println("이름 : " + m.name + " / 점수 : " + m.score + " / 나이 : " + m.age);
        }
    }
}
