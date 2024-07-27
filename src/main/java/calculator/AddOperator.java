package calculator;

public class AddOperator {

    private double left;
    private double right;

    public AddOperator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double add() {
        return left + right;
    }
}
