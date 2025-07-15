public class Main {
    public static void main(String[] args) {
        String[] foodItems1 = {"Pizza","Pasta","Burger"};
        String[] foodItems2 = {"Sushi","Ramen","Tempura"};

        Restaurant rest1= new Restaurant("Punjabi Dhaba", "Mathura", foodItems1);
        Restaurant rest2 = new Restaurant("Devansh Dhaba", "Noida", foodItems2);

        System.out.println("====Welcome to punjabi dhaba====");
        rest1.displayDetails();
        System.out.println("\n====Welcome to Devansh Dhaba====");
        rest2.displayDetails();

        //Check food availability
        System.out.println("\nChecking Food Availability : ");
                        System.out.println("Is Pasta available in Punjabi Dhaba? "+rest1.isFood("Pasta"));
                        System.out.println("Is Sushi available in Devansh Dhaba? "+rest2.isFood("Sushi"));
    }
}

class Restaurant{
    private String name;
    private String location;
    private String[] foodItems;

    Restaurant(String name,String location,String[] foodItems){
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    void displayDetails(){
        System.out.println("Restaurant Name : "+name+", Location : "+location+", Food Items : "+foodItems);
        for(String items : foodItems){
            System.out.println("-"+items);
        }
    }

    //Method to check if a food items is available
    public boolean isFood(String food){
        for(String items : foodItems){
            if(items.equalsIgnoreCase(food)){
                return true;
            }
        }
        return false;
    }
}