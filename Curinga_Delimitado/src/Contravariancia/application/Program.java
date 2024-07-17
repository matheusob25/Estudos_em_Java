package Contravariancia.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Maria");
        List<? super Number> myNums = myObjs;
        myNums.add(12);
        myNums.add(1234.12);

//        Number x = myNums.get(0);

        for(Object s: myNums){
            System.out.println();
        }

    }
}
