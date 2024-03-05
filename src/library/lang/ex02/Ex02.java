package library.lang.ex02;

public class Ex02 {
    public static void main(String[] args) {

/*
        Click 클래스는 x좌표, y좌표, 시간(timestamp : int 타입)을 저장하는 클래스
        실제 Click 인스턴스가 x좌표, y좌표가 같으면 동등하다고 인정되게끔
        equal 메서드를 오버라이딩해서 메인 메서드로 확인해 보세요.
*/

        Click click1 = new Click(123, 123, 2024030512);
        Click click2 = new Click(123, 123, 2024030512);
        Click click3 = new Click(123, 123, 2020010112);
        Click click4 = new Click(123, 676, 2024030512);
        Click click5 = new Click(456, 123, 2024030512);
        Click click6 = new Click(456, 972, 2020010112);
        Click click7 = null;
        Object click8 = new Object();

        System.out.println(click1.equals(click2));      // true
        System.out.println(click1.equals(click3));      // true
        System.out.println(click1.equals(click4));      // false
        System.out.println(click1.equals(click5));      // false
        System.out.println(click1.equals(click6));      // false
        System.out.println(click1.equals(click7));      // false
        System.out.println(click1.equals(click8));      // false
    }
}
