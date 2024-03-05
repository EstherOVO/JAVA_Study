package library.lang;

public class Object01 {
    public static void main(String[] args) {

        Object object = new Object();

        String string = object.toString();
        boolean b = object.equals(object);
        int hashCode = object.hashCode();

//      객체가 속한 클래스의 메타 정보를 반환하는 메서드
//      Reflection의 기본 → 클래스 정보를 런타임 중에 조회
        Class<?> aClass = object.getClass();

        System.out.println("클래스의 이름 : " + aClass.getName());    // java.lang.Object
        System.out.println("단순 이름 : " + aClass.getSimpleName());        // Object
        System.out.println("정식 이름 : " + aClass.getCanonicalName());     // java.lang.Object
        System.out.println("패키지 이름 : " + aClass.getPackageName());     // java.lang

        System.out.println("배열 여부 : " + aClass.isArray());  // false
        System.out.println("인터페이스 여부 : " + aClass.isInterface());   // false
        System.out.println("기본타입 여부 : " + aClass.isPrimitive());     // false

        System.out.println("부모클래스 : " + aClass.getSuperclass());    // null

//      타입 정보를 조회 : 객체의 정확한 타입을 확인 가능
//      런타임 도중에 다른 클래스의 메서드나 필드, 생성자 등에 접근해서 객체를 생성,
//      메서드 호출하거나 필드를 변경할 수 있다. → Reflection
    }
}
