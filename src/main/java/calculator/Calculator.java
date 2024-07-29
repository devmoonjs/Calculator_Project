package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    public abstract void calculate();

    public void inquiryResults(List<Double> list) {
        for (Double result : list) {
            System.out.println(result);
        }
    }

    public void removeResult(List<Double> list) {
        list.remove(0);
    }
}
