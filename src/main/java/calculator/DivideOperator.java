package calculator;

public class DivideOperator {
    private double left;
    private double right;

    public DivideOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double div() {
        return left / right;
    }
}

