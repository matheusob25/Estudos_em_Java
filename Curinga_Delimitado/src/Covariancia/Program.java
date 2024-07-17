package Covariancia;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(324);
        intList.add(12);
        List<? extends Number> list = intList;
        Number x = list.get(0);
//        list.add(23);  error

    }
}
