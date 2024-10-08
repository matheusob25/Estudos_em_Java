package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;

import model.enums.Color;



public class Main {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.RED, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("---------------------------------------");
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());

    }
}