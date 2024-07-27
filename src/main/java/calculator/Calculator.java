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
    private List<Integer> list; // 사칙 연산 저장 List
    private List<Double> circleList; // 원 너비 저장 List
    public static final double PI = 3.14; // 파이 상수

    public Calculator() {
        this.list = new ArrayList<>();
        this.circleList = new ArrayList<>();
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList() {
    }

    public List<Double> getCircleList() {
        return circleList;
    }

    public void setCircleList() {
    }

    // 가장 먼저 저장된 데이터 삭제
    public void removeResult() {
        list.remove(0);
    }

    // 사첵연산 결과 전체 리스트 출력
    public void inquiryResults() {
        for (Integer temp : list) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    // 원 너비 계산 & 출력 & 저장
    public void calculateCircleArea(int r) {
        double circleResult = r * r * PI;
        System.out.print("원의 너비 : " + circleResult);
        circleList.add(circleResult);
    }

    // 원의 너비 결과 전체 리스트 출력
    public void inquiryCircleResults() {
        for (Double v : circleList) {
            System.out.println(v + " ");
        }
        System.out.println();
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
    }
}
