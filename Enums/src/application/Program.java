package application;

import com.sun.tools.javac.Main;
import entitites.Order;
import entitites.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order o1 = new Order(324, new Date(), OrderStatus.PENDING_PAYMENT);


        System.out.println(o1);
    }
}

