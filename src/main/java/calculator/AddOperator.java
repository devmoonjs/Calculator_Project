package calculator;

public class AddOperator<T extends Number> implements Operator<T> {

    private T left;
    private T right;


    public AddOperator(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public T operate() {
        return (T) Double.valueOf((left.doubleValue() + right.doubleValue()));
    }
}
