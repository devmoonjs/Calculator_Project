package calculator;
import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {

    List<Double> arithlist;
    private double left;
    private double right;
    private char signal;

    public ArithmeticCalculator() {
        this.arithlist = new ArrayList<>();
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public void setSignal(char signal) {
        this.signal = signal;
    }

    @Override
    public void calculate() throws DivideException {

        double result = 0; // 사칙연산 결과 값 저장 변수
        switch (signal) {
            case '+':
                AddOperator addOperator = new AddOperator(left, right);
                result = addOperator.operate();
                break;

            case '-':
                SubtractOperator subtractOperator = new SubtractOperator(left, right);
                result = subtractOperator.operate();
                break;

            case '*':
                MultiplyOperator multiplyOperator = new MultiplyOperator(left, right);
                result = multiplyOperator.operate();
                break;

            case '/':
                if (right == 0) {
                    throw new DivideException("0으로 나눌 수 없습니다. ");
                }
                else {
                    DivideOperator divideOperator = new DivideOperator(left, right);
                    result = divideOperator.operate();
                }
                break;

            case '%' :
                ModOperator modOperator = new ModOperator(left, right);
                result = modOperator.operate();
        }
        // list에 결과 저장
        System.out.println("결과 : " + result);
        arithlist.add(result);
    }

    // 가장 먼저 저장된 데이터 삭제
    public void removeResult() {
        arithlist.remove(0);
    }

    // 결과 전체 리스트 출력
    public void inquiryResults() {
        for (Double d : arithlist) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
