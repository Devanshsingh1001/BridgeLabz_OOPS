import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book dev = new Book("Devansh ki kahani", "Devansh Singh", 15000, true);

        //Display book info before borrowing
        System.out.println("-----Book Info Before Borrowing ------");
        dev.displayBookDetails();

        //try to borrow the book
        System.out.println("Trying to borrow the book...");
        dev.borrowed();

        //try to borrow again
        System.out.println("Tryping to borrow the book again");
        dev.borrowed();

        //display book info. after borrowing
        System.out.println("Book Info after borrowing");
        dev.displayBookDetails();
    }
}

class Book{
    String title;
    String author;
    int price;
    boolean isAvailable;

    Book(String title , String author, int price , boolean isAvailable){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    void borrowed(){
        if(isAvailable){
            System.out.println("You have successfully borrowed "+title);
            isAvailable = false;
        }
        else{
            System.out.println("Sorry" + title + "currently not avilable.");
        }
    }

    void displayBookDetails(){
        System.out.println("Title of the book : "+title);
        System.out.println("Author of the book : "+author);
        System.out.println("price of the book : "+price);
        System.out.println("Availability : "+(isAvailable ? "Available":"Not Available"));
    }
}