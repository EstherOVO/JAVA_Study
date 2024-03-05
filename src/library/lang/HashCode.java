package library.lang;

public class HashCode {
    public static void main(String[] args) {

//      Object 클래스의 hashcode
//      기본적으로 메모리 주소를 기반으로 한 정수 값을 가진다.
        Object object = new Object();
        System.out.println(object.hashCode());  // 189568618 ← 메모리 주소를 기반으로 한 정수 값
        System.out.println(object);             // @b4c966a
    }

    class Member {

    }
}
