package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DivideException extends Exception {
    // 0으로 나눌 때 예외 처리
    DivideException(String message) {
        super(message);
    }
}

public class Calculator {

    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }
    public void setList() {

    }

    public void calculate(int firstNum, int secondNum, char signal) throws DivideException {
        int result = 0; // 사칙연산 결과 값 저장 변수
        switch (signal) {
            case '+' :
                result = firstNum + secondNum;
                break;

            case '-' :
                result = firstNum - secondNum;
                break;

            case '*' :
                result = firstNum * secondNum;
                break;

            case '/' :
                if (secondNum == 0) {
                    throw new DivideException("0으로 나눌 수 없습니다. ");
                }
                break;
        }

        // list에 결과 저장
        System.out.println("결과 : " + result);
        list.add(result);

        Scanner sc = new Scanner(System.in);

        // 가장 먼저 연산된 결과 삭제
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력)");
        if (sc.next().equals("remove")) list.remove(0);
    }
}
