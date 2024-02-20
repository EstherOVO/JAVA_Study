package condition;

public class Condition06 {
    public static void main(String[] args) {

//      아이템 가격이 10,000원 이상일 때 1,000원 할인
//      나이가 10살 이하일 때 1,000원 할인

        int price = 5000;
        int age = 8;
        int dc = 0;

        if (price >= 10000) {
            dc += 1000;
            System.out.println("만 원 이상 결제로 천 원 할인되었습니다.");
        }

//      else if문을 사용하게 될 경우 각각의 할인을 적용하지 못한다.
//      else if문은 통틀어서 하나만, if문은 각각의 할인을 적용할 수 있다.

        if (age <= 10) {
            dc += 1000;
            System.out.println("10살 이하 고객으로 천 원 할인되었습니다.");
        }

        System.out.println("모두 "+ dc +"원 할인되었습니다.");

//      각각의 조건이 독립 조건일 때는 if문을 개별적으로 사용한다.
//      모두 연관되는 조건일 때는 else-if문을 사용한다.

    }
}
