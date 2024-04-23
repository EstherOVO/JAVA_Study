package jdbc.object;

// users 테이블에 대응하는 클래스
// VO(Value Object) : 데이터를 전달하는 데 사용되는 객체
// 데이터 전달 역할만 하고, 별도의 로직은 가지고 있지 않다.
// 1. 불변성 : 설정 이후에는 값이 변하지 않는다.
// 2. 동등성 : 내용이 같으면 같은 인스턴스다.
// 3. 재사용성 : 같은 구조를 계속 공통적으로 사용

import java.util.Objects;

public class User {
//  필드는 테이블의 속성(컬럼)
    private String userId;
    private String name;
    private String password;
    private int age;
    private String email;

//  VO 객체를 생성하는 생성자
    public User(String userId, String name, String password, int age, String email) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
    }

//  Getter 메서드 구현
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

//  동등성을 위해 hashCode와 equals 구현
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
