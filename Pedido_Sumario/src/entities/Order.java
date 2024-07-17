package entities;

import entities.enums.OrderStatus;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static DateTimeFormatter formatadorCliente = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(){

    }

    public Order(OrderStatus status, Client client) {
        moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public Double total(){
        Double res = 0.0;
        for(OrderItem x : items){
            res += x.subTotal();
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment: " + moment.format(formatador) + "\n");
        sb.append("Order status: " + status+ "\n");
        sb.append("Client: "+ client.getName() + " (" + client.getBirthDate().format(formatadorCliente) + ") - ");
        sb.append(client.getEmail() + "\n");
        sb.append("Order items:\n");
        for(OrderItem x : items){
            sb.append(x.getProduct().getName() + ", $" + String.format("%.2f", x.getPrice()) + ", Quantity: " + x.getQuantity() + ", Subtotal: $" + String.format("%.2f", x.subTotal()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }


}
