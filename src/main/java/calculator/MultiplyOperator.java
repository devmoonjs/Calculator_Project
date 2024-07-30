package calculator;

public class MultiplyOperator<T extends Number> implements Operator<T> {
    private T left;
    private T right;

    public MultiplyOperator(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T operate() {
        return (T) Double.valueOf(left.doubleValue() * right.doubleValue());
    }
}