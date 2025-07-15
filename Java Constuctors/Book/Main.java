
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Default Constructor
        Book order1 = new Book();
        System.out.println("Order 1 : ");
        order1.displayBookDetails();

        //Parameterized Constructor
        Book order2 = new Book("I am Big", "Devansh Singh", 10000);
        System.out.println("Order 2 : ");
        order2.displayBookDetails();

        //copy constructor
        Book order3 = new Book(order2);
        System.out.println("Order 3 (copy of order 2) : ");
        order3.displayBookDetails();
    }
}

class Book{
    String title;
    String author;
    int price;

    //Default Constructor
    Book(){
        title = "Devansh Ka itihaas";
        author = "Devansh Singh";
        price =  4500;
    }

    //Parameterized Constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Copy Constructor
    Book(Book PreviouBook){
        this.title = PreviouBook.title;
        this.author = PreviouBook.author;
        this.price = PreviouBook.price;
    }

    void displayBookDetails(){
        System.out.println("Title of the Book : "+title);
        System.out.println("Author of the Book : "+author);
        System.out.println("Price of the Book : Rs "+price);
    }
}