package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Exception01 {
    public static void main(String[] args) {

//      ctrl + b → 클래스 상세 확인 가능
//      ctrl + h Hierarchy → 상속 관계 확인 가능

//      모든 발생할 수 있는 문제 클래스의 조상
        Throwable throwable;

//      두 가지 종류의 문제 클래스가 있다.
//      1. 에러
        Error error;
//      2. 예외
        Exception exception;

//      예외는 두 가지 종류로 나뉜다.
//      1. Checked Exception
//      - 예측 가능한 상황에 발생하고 외부 영향에 의해 발생한다.
        IOException ioException;    // 입출력 작업 시 발생할 수 있는 예외
        FileNotFoundException fileNotFoundException;    // 파일을 못 찾았을 때 발생할 수 있는 예외
        SQLException sqlException;  // 데이터 베이스 접근 문제가 있을 시 발생할 수 있는 예외
        ClassNotFoundException classNotFoundException;  // 경로에서 클래스를 찾을 수 없을 때 발생하는 예외

//      2. Unchecked Exception
//      - 실행 중에 발생하는 오류로 컴파일 단계에서 오류가 발생하지 않기 때문에 개발자에 경험해 의거해 발생을 예방해야 한다.
        RuntimeException runtimeException;  // 실행 시 발생하는 예외들의 총괄
        NullPointerException nullPointerException;  // Null의 참조 접근 시 발생할 수 있는 예외
        IndexOutOfBoundsException indexOutOfBoundsException;    // 유효하지 않은 인덱스에 접근하려고 할 때 발생할 수 있는 예외
        ArithmeticException arithmeticException;    // 수학적 계산이 불가능할 때 발생할 수 있는 예외
        IllegalArgumentException illegalArgumentException;      // 부적합한 인자를 전달했을 때 발생할 수 있는 예외
        ClassCastException classCastException;      // 잘못된 타입 캐스팅할 때 발생할 수 있는 예외
    }
}
