package entities;

public class Product implements Comparable<Product>{
    private String name;
    private Double value;

    public Product(){

    }
    public Product(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public int compareTo(Product o) {
        return value.compareTo(o.getValue());
    }

}
