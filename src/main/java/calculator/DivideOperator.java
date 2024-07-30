package calculator;

public class DivideOperator implements Operator{
    private double left;
    private double right;

    public DivideOperator(double left, double right) {
        this.left = left;
        this.right = right;

        if (right == 0) {
            throw new DivideException("0으로 나눌 수 없습니다.");
        }
    }

    public double operate() {
        return left / right;
    }
}

