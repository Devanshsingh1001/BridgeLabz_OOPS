// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//     }
// }

// class CartItem{
//     String itemName;
//     double price;
//     int quantity;

//     CartItem(String itemName,double price,int quantity){
//         this.itemName = itemName;
//         this.price = price;
//         this.quantity = quantity;
//     }
//     void displayCartItem(){
//         System.out.println("Item Name : "+itemName);
//         System.out.println("Items Price : "+price);\
//         System.out.println("Quantity : "+quantity);
//     }
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;

        do {
            System.out.println("\n---- Shopping Cart Menu ----");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. View Cart Items");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(new CartItem(name, price, quantity));
                    break;

                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String itemToRemove = sc.nextLine();
                    cart.removeItem(itemToRemove);
                    break;

                case 3:
                    cart.displayItems();
                    break;

                case 4:
                    System.out.println("Total Cost: Rs " + cart.calculateTotal());
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayCartItem() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: Rs " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: Rs " + (price * quantity));
        System.out.println("-----------------------------");
    }
}

class ShoppingCart {
    ArrayList<CartItem> items;

    ShoppingCart() {
        items = new ArrayList<>();
    }

    void addItem(CartItem item) {
        items.add(item);
        System.out.println("Item added to cart.");
    }

    void removeItem(String itemName) {
        boolean found = false;
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                found = true;
                System.out.println("Item removed from cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart.");
        }
    }

    void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("---- Cart Items ----");
            for (CartItem item : items) {
                item.displayCartItem();
            }
        }
    }

    double calculateTotal() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.price * item.quantity;
        }
        return total;
    }
}
