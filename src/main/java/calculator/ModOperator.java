package calculator;

public class ModOperator<T extends Number> implements Operator<T> {

    private T left;
    private T right;

    public ModOperator(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public T operate() {
        return (T) Double.valueOf(left.doubleValue() % right.doubleValue());
    }
}
