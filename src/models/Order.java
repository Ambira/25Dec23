package models;

public class Order {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    int id;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;
    String items;

    public Order(int id, int price, String items) {
        this.id = id;
        this.price = price;
        this.items = items;
    }

}