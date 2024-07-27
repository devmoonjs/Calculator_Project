package calculator;

public class SubtractOperator {
    private double left;
    private double right;

    public SubtractOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double sub() {
        return left - right;
    }
}