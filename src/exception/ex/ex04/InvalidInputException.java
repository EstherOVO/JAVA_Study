package exception.ex.ex04;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(int answer) {
        super("잘못된 입력입니다. 숫자로만 답해주세요.");
    }
}
