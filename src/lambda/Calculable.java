package lambda;

@FunctionalInterface
public interface Calculable {

//  입력 값이 2개, 리턴 값이 없는 추상 메서드 1개
    void calculate(int x, int y);

//  추상 메서드를 두 개 이상 선언하면 컴파일 에러
//  void plus(int x, int y);
}
