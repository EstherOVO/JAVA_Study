package nested;

public class Franchise {

    private String name;

    public Franchise(String name) {
        this.name = name;
    }

//  정적 내부 클래스 : 가맹 TF 팀
    public static class TaskForce {
        private String title;
        private String leader;

        public TaskForce(String title, String leader) {
            this.title = title;
            this.leader = leader;
            System.out.println("리더 " + leader + "님을 주축으로 " + title + " TF 팀 출범!");
        }

        public Franchise launch() {
            System.out.println(title + " 런칭하였습니다.");
            return new Franchise(title);
        }
    }

//  내부 클래스 : 매장 쿠폰(인스턴스에 의존하는 내부 클래스)
    class Coupon {
        private int amount;
        private String message;

        public Coupon(int amount, String to) {
            this.amount = amount;
            this.message = "%d원 쿠폰 %s에서 %s님에게 발급되었습니다.".formatted(amount, name, to);
            System.out.println(message);
        }
    }

    public Coupon getCoupon(int amount, String to) {
        return new Coupon(amount, to);
    }
}
