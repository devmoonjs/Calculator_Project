package calculator;

public class MultiplyOperator {
    private double left;
    private double right;

    public MultiplyOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double mul() {
        return left * right;
    }
}