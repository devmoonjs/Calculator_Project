package calculator;
import java.util.ArrayList;
import java.util.List;

import static calculator.OperatorType.PLUS;

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

        OperatorType operatorType = OperatorType.find(signal);

        double result = 0; // 사칙연산 결과 값 저장 변수
        switch (operatorType) {
            case PLUS:
                AddOperator addOperator = new AddOperator(left, right);
                result = addOperator.operate();
                break;

            case SUB:
                SubtractOperator subtractOperator = new SubtractOperator(left, right);
                result = subtractOperator.operate();
                break;

            case MUL:
                MultiplyOperator multiplyOperator = new MultiplyOperator(left, right);
                result = multiplyOperator.operate();
                break;

            case DIV:
                if (right == 0) {
                    throw new DivideException("0으로 나눌 수 없습니다. ");
                }
                else {
                    DivideOperator divideOperator = new DivideOperator(left, right);
                    result = divideOperator.operate();
                }
                break;

            case MOD:
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
