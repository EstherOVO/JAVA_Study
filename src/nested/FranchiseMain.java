package nested;

public class FranchiseMain {

    public static void main(String[] args) {

//      정적 내부 클래스 : 외부 클래스의 인스턴스 없이 생성 가능
        Franchise.TaskForce taskForce1 = new Franchise.TaskForce("남천점", "홍길동");
        Franchise namchunStore = taskForce1.launch();

        Franchise.TaskForce taskForce2 = new Franchise.TaskForce("금련산", "임꺽정");
        Franchise kumryunStore = taskForce2.launch();

//      2. (인스턴스) 내부 클래스 : 인스턴스가 있어야 생성 가능
        namchunStore.getCoupon(50000, "신사임당");
        kumryunStore.getCoupon(10000, "세종대왕");

        Franchise.Coupon coupon1 = namchunStore.getCoupon(1000, "율곡이이");
        Franchise.Coupon coupon2 = namchunStore.getCoupon(5000, "퇴계이황");

/*
        중첩 클래스의 장점
        1. 캡슐화가 더욱 강화된다.
        2. 관계가 긴밀한 클래스까지 만들어 외부 클래스의 멤버를 내부로 숨길 수 있게 된다. → 코드의 재사용성 및 간결성 강화

        중첩 클래스의 단점
        1. 과하게 사용되면 가독성과 유지 보구사 오히려 저하되고 클래스가 비대해진다.
 */

    }
}
