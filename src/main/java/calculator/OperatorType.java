package calculator;

public enum OperatorType {
    PLUS('+'),
    SUB('-'),
    MUL('*'),
    DIV('/'),
    MOD('%');

    public final char signal;

    OperatorType(char signal) {
        this.signal = signal;
    }

    // 들어온 signal 값에 해당하는 enum 타입 return
    public static OperatorType find(char signal) {
        for (OperatorType type : values()) {
            if (type.signal == signal) {
                return type;
            }
        }
        throw new IllegalArgumentException("잘못된 기호");
    }
}
