import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Item Code : ");
        int itemCode = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Item Name : ");
        String itemName = sc.nextLine();

        System.out.println("Enter price : ");
        double price = sc.nextDouble();

        items i = new items(itemCode, itemName, price);
        i.itemDetails();
    }
}

class items{
    int itemCode;
    String itemName;
    double price;

    items(int itemcode,String itemName,double price){
        this.itemCode = itemcode;
        this.itemName = itemName;
        this.price = price;
    }
    void itemDetails(){
        System.out.println("----------Details of our Items-----------");
        System.out.println("itemCode : "+itemCode);
        System.out.println("itemName : "+itemName);
        System.out.println("price : "+price);
    }
}