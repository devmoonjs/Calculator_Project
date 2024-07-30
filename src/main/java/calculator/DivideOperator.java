package calculator;

public class DivideOperator<T extends Number> implements Operator<T> {
    private T left;
    private T right;

    public DivideOperator(T left, T right) {
        this.left = left;
        this.right = right;

        if (right.doubleValue() == 0) {
            throw new DivideException("0으로 나눌 수 없습니다.");
        }
    }

    public T operate() {
        return (T) (Double.valueOf(left.doubleValue() / right.doubleValue()));
    }
}

