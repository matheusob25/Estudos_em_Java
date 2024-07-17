package product;

public class Product {
   private String name;
   private double price;
   private int quantity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double TotalValueInStock(){
        return this.getQuantity() * this.getPrice();
    }
    public void AddProductsInStock(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProductsInStock(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                ", price: " + String.format("%.2f", price)+
                ", quantity: " + quantity +
                ", total value:  " + String.format("%.2f", TotalValueInStock());
    }
}
