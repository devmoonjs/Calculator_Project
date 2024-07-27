package calculator;

public class AddOperator implements Operator {

    private double left;
    private double right;

    public AddOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() {
        return left + right;
    }
}
