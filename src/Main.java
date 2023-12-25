import models.Order;
import models.Items;


public class Main {
    public static void main(String[] args) {
        Items item1 = new Items(1,"Skirt",500);
        Items item2 = new Items(2, "Jumper",1000);
        Items item3 = new Items(3, "Cap", 200);

        Order order1 = new Order(1,item2.getPrice(),item2.getName());
        Order order2 = new Order(2,item3.getPrice(),item3.getName());
        Order order3 = new Order(3,item1.getPrice(),item1.getName());

        System.out.println("La mia");
        System.out.println("Baluwatar,Kathmandu");
        System.out.println("Order and Price");
        System.out.println("1. "+ order1.getItems() +" "+ order1.getPrice() );
        System.out.println("2. "+ order2.getItems() +" "+ order2.getPrice());
        System.out.println("3. "+ order3.getItems() + " "+ order3.getPrice());
        System.out.println("Total: " + (order1.getPrice()+order2.getPrice()+order3.getPrice()));

    }


}