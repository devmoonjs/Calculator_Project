package calculator;
import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> extends Calculator<T> {

    private T left;
    private T right;
    private char signal;
    private T result;

    public void setLeft(T left) {
        this.left = left;
    }

    public void setRight(T right) {
        this.right = right;
    }

    public void setSignal(char signal) {
        this.signal = signal;
    }

    // signal 기호에 따른 Operator 구현
    public Operator<T> getOperatorBySignal() {
        OperatorType operatorType = OperatorType.find(signal);

        switch(operatorType) {
            case PLUS :
                return new AddOperator<>(left, right);

            case SUB :
                return new SubtractOperator<>(left, right);

            case MUL :
                return new MultiplyOperator<>(left, right);

            case DIV :
                return new DivideOperator<>(left, right);

            case MOD :
                return new ModOperator<>(left, right);

            default:
                return null;
        }
    }
    @Override
    public void calculate() throws DivideException {

        Operator operator = getOperatorBySignal(); // signal 값에 따른 생성자 생성하여 가져오기
        result = (T) operator.operate(); // 결과 연산

        // list에 결과 출력
        System.out.println("결과 : " + result);

        // 결과 저장
        addList(result);
    }
}
