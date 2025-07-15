public class Main {
    public static void main(String[] args) {
        Vehicle dev = new Vehicle("Devansh Singh", "Two wheeler");
        dev.displayVehicleDetails();

        dev.updateRegistrationFee(15000);
        System.out.println("-------updated registration fees-------");
        dev.displayVehicleDetails();
    }
}

class Vehicle{
    String ownerName;
    String VehicleType;

    static int registrationFee = 10000;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.VehicleType = vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("owner Name : "+ownerName);
        System.out.println("Vehicle Type :"+VehicleType);
        System.out.println("Registration fee for the vehicle : "+registrationFee);
    }
    static void updateRegistrationFee(int newRegistrationFee){
        registrationFee = newRegistrationFee;
        //System.out.println("Updated registration fees for all vehicles : "+registrationFee);
    }
}