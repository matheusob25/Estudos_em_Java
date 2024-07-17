package Problema1.application;

import Problema1.entities.Circle;
import Problema1.entities.Rectangle;
import Problema1.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle(3.0, 2.0));
        list.add(new Circle(2.0));
        System.out.println("Areas:  ");
        double sum = 0.0;
        for (Shape s : list) {
            System.out.println(s.area());
        }
        System.out.println("Area total: " + totalArea(list));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}