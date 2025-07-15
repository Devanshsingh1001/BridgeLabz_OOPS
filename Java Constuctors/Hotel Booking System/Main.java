import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Family 1 ----------");
        HotelBooking dev = new HotelBooking();
        dev.displayHotelDetails();

        System.out.println("---------Family 2 ----------");
        HotelBooking deva = new HotelBooking("devansh singh", "AC with one bed", 1, 1000);
        deva.displayHotelDetails();

        System.out.println("---------Family 3 ----------");
        HotelBooking devan = new HotelBooking(deva);
        devan.displayHotelDetails();
    }
}

class HotelBooking{
    String guestName;
    String roomType;
    int NumberOfPerson;
    int price;

    HotelBooking(){
        guestName = "Devansh Singh";
        roomType = "AC with 2 Beds";
        NumberOfPerson = 4;
        price = NumberOfPerson * 1000;
    }
    HotelBooking(String guestName,String roomType, int NumberOfPerson, int price){
        this.guestName = guestName;
        this.roomType = roomType;
        this.NumberOfPerson = NumberOfPerson;
        this.price = price;
    }
    HotelBooking(HotelBooking me){
        this.guestName = me.guestName;
        this.roomType = me.roomType;
        this.NumberOfPerson = me.NumberOfPerson;
        this.price = me.price;
    }
    void displayHotelDetails(){
        System.out.println("Name of the Guest : "+guestName);
        System.out.println("Room Type for the Guest :"+roomType);
        System.out.println("Number of Person in hotel : "+NumberOfPerson);
        System.out.println("Price in the hotel : "+price);

    }
}