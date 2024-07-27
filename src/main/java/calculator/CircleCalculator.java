package calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator{

    public static final double PI = 3.14; // 파이 상수
    private List<Double> circleList;
    private int r;

    public CircleCalculator() {
        this.circleList = new ArrayList<>();
    }

    public void setR(int r) {
        this.r = r;
    }

    // 계산
    public void calculate() {
        double circleResult = r * r * PI;
        System.out.println("원의 너비 : " + circleResult);
        circleList.add(circleResult);
    }

    // 결과 전체 출력
    public void inquiryResults() {
        for (Double v : circleList) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    // 가장 오래된 결과 삭제
    public void removeResult() {
        circleList.remove(0);
    }


}
