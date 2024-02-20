package access_modifier.first;

public class A {

//  내부에서 접근
    A publicA = new A(100);         // public 내부 접근 가능
    A defaultA = new A();              // default 내부 접근 가능
    A privateA = new A("private");  // private 내부 접근 가능

//  생성자가 접근 제한자에 따라 세 가지
//  public
    public A(int a) {
        System.out.println("public A 생성자");
    }
//  default
    A() {
        System.out.println("default A 생성자");
    }

//  private
    private A(String a) {
        System.out.println("private A 생성자");
    }
}
