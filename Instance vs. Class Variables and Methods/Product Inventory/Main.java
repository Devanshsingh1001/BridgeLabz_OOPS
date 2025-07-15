public class Main {
    public static void main(String[] args) {
        Product dev = new Product("sugar", 50);
        dev.displayProductDetails();
        dev.displayTotalProducts();

        System.out.println("----------Second Product-----------");
        Product deva = new Product("salt",60);
        deva.displayProductDetails();
        deva.displayTotalProducts();
    }
}

class Product{
    //Instance Variable
    String productName;
    double price;

    // class/static variable shared by all instances
    static int totalProducts = 0;

    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails(){
        System.out.println("Product Name : "+productName);
        System.out.println("price of the product : "+price);
    }

    void displayTotalProducts(){
        System.out.println("total products created : "+totalProducts);
    }
}