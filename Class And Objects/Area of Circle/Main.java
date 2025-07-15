import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anter Radius : ");
        int radius = sc.nextInt();

        Circle c = new Circle(radius);
        c.area();
        c.circumference();
    }
}

class Circle{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    void area(){
        double area = Math.PI * radius * radius;
        System.out.println("area of circle is : " +area);
    }

    void circumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("circumference of a circle is : "+circumference);
    }
}