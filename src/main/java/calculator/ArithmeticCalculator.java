package calculator;
import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {

    List<Double> arithlist;
    private double left;
    private double right;
    private char signal;
    private static double result = 0;

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

    // signal 기호에 따른 Operator 구현
    public Operator getOperatorBySignal() {
        OperatorType operatorType = OperatorType.find(signal);

        switch(operatorType) {
            case PLUS :
                return new AddOperator(left, right);

            case SUB :
                return new SubtractOperator(left, right);

            case MUL :
                return new MultiplyOperator(left, right);

            case DIV :
                return new DivideOperator(left, right);
        }
        throw new IllegalAccessError("error");
    }

    @Override
    public void calculate() throws DivideException {

        Operator operator = getOperatorBySignal(); // signal 값에 따른 생성자 생성하여 가져오기
        result = operator.operate(); // 결과 연산

        // list에 결과 저장
        System.out.println("결과 : " + result);

    }

    // 결과 arithList에 저장
    public void addList() {
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
