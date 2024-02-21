package static00;

public class Static02 {
    public static void main(String[] args) {

/*
        일반적인 방법으로 필드에 개수 정보가 생성될 때마다 공유되지 않는다.
        Object object1 = new Object("object1");     // 1
        System.out.println(object1.count);
        Object object2 = new Object("object2");     // 2 (X) → 1 (O)
        System.out.println(object2.count);
        Object object3 = new Object("object3");     // 3 (X) → 1 (O)
        System.out.println(object3.count);
 */

/*
        Counter counter = new Counter();
        Object object1 = new Object("object1", counter);     // 1
        System.out.println(counter.count);
        Object object2 = new Object("object2", counter);     // 2
        System.out.println(counter.count);
        Object object3 = new Object("object3", counter);     // 3
        System.out.println(counter.count);
 */

//      static 키워드를 적용하게 될 경우
        Object object1 = new Object("object1");     // 1
        System.out.println(object1.count);
        Object object2 = new Object("object2");     // 2
        System.out.println(object2.count);
        Object object3 = new Object("object3");     // 3
        System.out.println(object3.count);

//      static 변수(=클래스 변수)는 클래스를 통해 접근 가능하다.
        System.out.println("객체의 개수 : " + Object.count);
    }
}
