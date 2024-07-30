package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator<T extends Number> {
    private List<T> list;

    Calculator() {
        this.list = new ArrayList<>();
    }

    public abstract void calculate();

    public void inquiryResults() {
        for (T result : list) {
            System.out.println(result);
        }
    }

    public void removeResult() {
        list.remove(0);
    }

    public void addList(T result) {
        list.add(result);
    }

}
