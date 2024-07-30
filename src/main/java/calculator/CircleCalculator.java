package calculator;

public class CircleCalculator extends Calculator{

    public static final double PI = 3.14; // 파이 상수
    private int r;

    public void setR(int r) {
        this.r = r;
    }

    // 계산
    public void calculate() {
        double circleResult = r * r * PI;
        System.out.println("원의 너비 : " + circleResult);
        addList(circleResult);
    }
}
