package entities;

import javax.swing.*;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(){

    }
    public Product(String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public Double total(){
        return  price * quantity;
    }
}
