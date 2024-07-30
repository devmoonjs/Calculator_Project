package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    /*
        list 생성자로 초기화
        부모클래스에서 관리하는게
        어차피 다른 list 가 아니니까

        (list 인터페이스 한번 확인해보기)

        방어적으로 구현
     */
    private List<Double> list;

    Calculator() {
        this.list = new ArrayList<>();
    }

    public abstract void calculate();

    public void inquiryResults() {
        for (Double result : list) {
            System.out.println(result);
        }
    }

    public void removeResult() {
        list.remove(0);
    }

    public void addList(double result) {
        list.add(result);
    }

}
