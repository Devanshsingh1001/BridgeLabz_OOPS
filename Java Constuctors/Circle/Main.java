import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle C = new Circle();
        System.out.println("Radius of circle : "+C.getRadius());
        System.out.println("Area of Circle : "+C.getArea());
        System.out.println("Circumference of Circle : "+C.getCircumference());

        System.out.println("---------Second Circle---------");

        Circle c = new Circle(5.5);
        System.out.println("Radius of circle : "+c.getRadius());
        System.out.println("Area of Circle : "+c.getArea());
        System.out.println("Circumference of Circle : "+c.getCircumference());
    }
}

class Circle{
    private double radius;

    //Default Constructor(sets radius to default value)
    public Circle(){
        this(1.0);//Default constructor: If no value is passed while creating an object, this constructor runs.
                  //this(1.0) is constructor chaining – it calls the parameterized constructor with a default value 1.0.
    }
    //Parameterized Constructor
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

}