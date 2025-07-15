import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person dev = new Person();
        System.out.println("--------Person 1 ---------------");
        dev.displayPersonDetails();

        Person deva = new Person("Devansh Singh", "Banaras", "BHU",25 );
        System.out.println("--------Person 2 ---------------");
        deva.displayPersonDetails();

        Person devan = new Person(deva);
        System.out.println("--------Person 3 ---------------");
        devan.displayPersonDetails();
    }
}

class Person{
    String name;
    String place;
    String college;
    int age;

    Person(){
        name = "Devansh Singh";
        place = "Mathura";
        college = "IIT DELHI";
        age = 22;
    }

    Person(String name,String place,String college,int age){
        this.name = name;
        this.place = place;
        this.college=college;
        this.age = age;
    }

    Person(Person me){
        this.name = me.name;
        this.place = me.place;
        this.college = me.college;
        this.age = me.age;
    }
    void displayPersonDetails(){
        System.out.println("Name of the person : "+name);
        System.out.println("Place from that person : "+place);
        System.out.println("College that person studing : "+college);
        System.out.println("Age of that Person : "+age);
    }
}