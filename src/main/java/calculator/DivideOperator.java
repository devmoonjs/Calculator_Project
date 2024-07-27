package calculator;

public class DivideOperator implements Operator{
    private double left;
    private double right;

    public DivideOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double operate() {
        return left / right;
    }
}

