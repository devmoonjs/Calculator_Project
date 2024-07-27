package calculator;

public class MultiplyOperator implements Operator {
    private double left;
    private double right;

    public MultiplyOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double operate() {
        return left * right;
    }
}