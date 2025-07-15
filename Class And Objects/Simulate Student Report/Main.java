import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter roll Number : ");
        int rollNumber = sc.nextInt();

        System.out.println("Enter marks : ");
        int marks = sc.nextInt();

        Student dev = new Student(name, rollNumber, marks);
        dev.displayDetails();

    }
}

class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String name,int rollNumber,int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayDetails(){
        System.out.println("---------Details of the Student--------");
        System.out.println("Student Name : "+name);

        System.out.println("Student roll Number : "+rollNumber);

        System.out.println("Student marks : "+marks);

        if(marks >= 90){
            System.out.println("Grade : O");
        }
        else if(marks >= 80){
            System.out.println("Grade : A+");
        }
        else if(marks >= 70){
            System.out.println("Grade : A");
        }
        else if(marks >= 60){
            System.out.println("Grade : B");
        }
        else if(marks >= 50){
            System.out.println("Grade : C");
        }
        else if(marks >= 40){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }
    }
}