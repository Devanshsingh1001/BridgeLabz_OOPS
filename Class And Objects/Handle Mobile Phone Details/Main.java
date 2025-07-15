import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Brand Name of the phone : ");
        String BrandName = sc.nextLine();
        
        System.out.println("Enter Model Name of the phone : ");
        String ModelName = sc.nextLine();

        System.out.println("Enter Price of the phone : ");
        int price = sc.nextInt();

        MobilePhone IQOO = new MobilePhone(BrandName, ModelName, price);
        IQOO.displayDetails();
    }
}

class MobilePhone{
    String brand;
    String model;
    int price;

    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("----------Details of the Phone------------");
        System.out.println("Brand Name of the phone : "+brand);
        System.out.println("Model Name of the phone : "+model);
        System.out.println("Price of the phone : "+price);
    }
}