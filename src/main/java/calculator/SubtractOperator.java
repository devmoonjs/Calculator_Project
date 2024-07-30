package calculator;

public class SubtractOperator<T extends Number> implements Operator<T> {
    private T left;
    private T right;

    public SubtractOperator(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T operate() {
        return (T) (Double.valueOf(left.doubleValue() - right.doubleValue()));
    }
}