package calculator;

public class SubtractOperator implements Operator {
    private double left;
    private double right;

    public SubtractOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double operate() {
        return left - right;
    }
}