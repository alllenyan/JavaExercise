package exer15;

import java.util.Objects;

public class Order {
    private int orderID;
    private String orderName;

    public Order(int orderID, String orderName) {
        this.orderID = orderID;
        this.orderName = orderName;
    }

    public Order() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID && Objects.equals(orderName, order.orderName);
    }
}
