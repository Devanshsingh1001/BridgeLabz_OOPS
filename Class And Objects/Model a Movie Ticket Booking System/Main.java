import java.util.*;
public class Main{
    static final int TOTAL_SEATS = 100;
    static boolean[] reservedSeats = new boolean[TOTAL_SEATS + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Movies[] = {"Dil Bechara","Mera Bhai","Sikandar","Stree 2"};
        double prices[] = {300.0,275.0,250.0,200.0};

        System.out.println("Available Movies (With Prices) : ");
        for(int i=0;i<Movies.length;i++){
            System.out.println((i+1)+"."+Movies[i]+" - Rs"+prices[i]);
        }

        System.out.println("Select movie by number(1-4) : ");
        int choiceMovie = sc.nextInt();

        if(choiceMovie < 1 || choiceMovie > Movies.length){
            System.out.println("Invalid Movie Selection ");
            return;
        }

        String SelectedMovie = Movies[choiceMovie - 1];
        double price = prices[choiceMovie - 1];

        System.out.println("You selected a movie : "+SelectedMovie);
        System.out.println("Ticket Price : "+price);

        System.out.println("Enter number of people Booking tickets : ");
        int people = sc.nextInt();

        movieTickets[] tickets = new movieTickets[people];

        for(int i=0;i<people;i++){
            int seatNumber;

            while(true){
                System.out.println("Enter Seat number for person "+(i+1)+":");
                seatNumber = sc.nextInt();

                if(seatNumber < 1 || seatNumber > TOTAL_SEATS){
                    System.out.println("Invalid seat number. Please enter a number between 1 and " + TOTAL_SEATS);
                }
                else if(reservedSeats[seatNumber]){
                    System.out.println("Seat " + seatNumber + " is already reserved. Please choose another seat.");
                }
                else {
                    reservedSeats[seatNumber] = true;
                    break;
                }
            }
            tickets[i] = new movieTickets(SelectedMovie, seatNumber, price);
        }
        double total = people * price;
        System.out.println("------Booking Summary------");
        for(movieTickets t : tickets){
            t.movieDetails();
            System.out.println("--------------------");
        }
        System.out.println("Total price for "+people+" tickets : Rs"+total);

        int reservedCount = 0;
        for(int i=1;i<=TOTAL_SEATS;i++){
            if(reservedSeats[i])    reservedCount++;
        }
        System.out.println("Total Seats : "+TOTAL_SEATS);
        System.out.println("Reserved Seats : "+reservedCount);
        System.out.println("Available Seats : "+(TOTAL_SEATS - reservedCount));
    }
}

class movieTickets{
    String movieName;
    int seatNumber;
    double price;

    movieTickets(String movie,int seatNumber,double price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void movieDetails(){
        System.out.println("Movie Name : "+movieName);
        System.out.println("Seat Number : "+seatNumber);
        System.out.println("Price : "+price);
    }
}