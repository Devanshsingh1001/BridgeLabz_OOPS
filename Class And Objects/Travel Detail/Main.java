public class Main {
   public static void main(String[] args) {
        Travel dev = new Travel("Devansh","Mathura","Varanasi",1200);
        dev.displayDetails();
   } 
}

class Travel{
    String name;
    String fromCity , toCity;
    double distance;

    Travel(String name,String fromCity, String toCity, double distance){
        this.name = name;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
        }
        void displayDetails(){
            System.out.println("name : "+name+", Travelling from " +fromCity+ " to " +toCity+" covers " +distance+ " km .");
    }
}