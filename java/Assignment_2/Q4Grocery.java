import java.util.*;

class Item {

    String name;
    int quantity;
    double price;
    double itemtotal;

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.itemtotal = quantity * price;

    }
}

public class Q4Grocery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Item : ");
        int n = sc.nextInt();
        sc.nextLine();
        Item[] cart = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Item " + (i + 1) + " ");


            System.out.print("Enter the name of Item : ");
            String name = sc.nextLine();

            System.out.print("Enter the quantity of Item : ");
            int quantity = sc.nextInt();

            System.out.print("Enter the price of Item : ");
            double price = sc.nextDouble();
            sc.nextLine();
            
            double itemtotal = quantity * price;

            cart[i] = new Item(name, quantity, price);

        }
        double subtotal = 0;
        for (Item item : cart) {
            subtotal = subtotal + item.itemtotal;
        }
        double discount = 0;
        if (subtotal > 3000) {
            discount = subtotal * 0.10;

        }
        double finalbill = subtotal - discount;
        System.out.println("\n====================Receipt===================");
        System.out.printf("%-15s | %-5s | %-10s | %-10s \n" ,"Item Name","Qty","Price","Total");
        System.out.println("------------------------------------------------");

        for (Item item : cart) {
            System.out.printf("%-15s | %-5d | %-10.2f | %-10.2f \n", item.name, item.quantity, item.price,
                    item.itemtotal);

        }
        System.out.println("------------------------------------------------");
        System.out.println("Subtotal          Rs: "+subtotal);
        if (discount>0) {
        System.out.println("Discount          Rs: "+discount);
        }else 
        System.out.println("Discount          Rs: 0.0");
        System.out.println("Final Bill        Rs: "+finalbill);
        System.out.println("------------------------------------------------");

    }

}