package calculator;

public class ModOperator implements Operator{

    private double left;
    private double right;

    public ModOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() {
        return left % right;
    }
}
