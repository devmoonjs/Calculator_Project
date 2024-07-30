package calculator;

public class CircleCalculator<T extends Number> extends Calculator<T>{

    public static final double PI = 3.14; // 파이 상수
    private T r;

    public void setR(T r) {
        this.r = r;
    }

    // 계산
    public void calculate() {
        T circleResult = (T)Double.valueOf(r.doubleValue() * r.doubleValue() * PI);
        System.out.println("원의 너비 : " + circleResult);
        addList(circleResult);
    }
}
