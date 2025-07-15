import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Employee Id : ");
        int id = sc.nextInt();

        System.out.println("Enter Employee Salary : ");
        int salary = sc.nextInt();

        Employee devansh = new Employee(name,id,salary);

        System.out.println("Employee Details");

        devansh.displayDetails();
    }
}

class Employee{
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("salary : "+salary);
    }
}