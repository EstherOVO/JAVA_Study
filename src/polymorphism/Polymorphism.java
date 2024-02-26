package polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        SuperClass superClass1 = new SuperClass();
        SuperClass superClass2 = new SubClass();

        method(superClass1);
        method(superClass2);
    }

    static void method(SuperClass superClass) {
//      기존 기능 사용
        superClass.superMethod();

//      확장 기능 사용 : 다운 캐스팅
        if (superClass instanceof SubClass) {
            SubClass subClass = (SubClass) superClass;
            subClass.subMethod();
        }
    }
}
