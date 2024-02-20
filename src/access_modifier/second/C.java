package access_modifier.second;

// import access_modifier.first.A;

import access_modifier.first.A;

public class C {

//  A a = new A(); → 다른 패키지에서는 default 접근 제한자에 접근 불가

    A publicA = new A(100);         // public 외부 접근 가능
//  A defaultA = new A();              // default 외부 접근 불가능
//  A privateA = new A("private");     // private 외부 접근 불가능
}
