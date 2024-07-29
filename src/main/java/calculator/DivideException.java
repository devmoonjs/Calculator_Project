package calculator;

public class DivideException extends RuntimeException {
    // 0으로 나눌 때 예외 처리
    DivideException(String message) {
        super(message);
    }
}