import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account Holder name : ");
        String accountHolder = sc.nextLine();

        System.out.println("Enter account Number : ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        BankAccount BA = new BankAccount();
        BA.setDetails(accountHolder, accountNumber, balance);

        System.out.println("------------Bank Account Details-----------");
        BA.displayDetails();

        while (true) {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    BA.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double WithdrawAmount = sc.nextDouble();
                    BA.Withdraw(WithdrawAmount);
                    break;
                case 3:
                    BA.displayDetails();
                    break;
                case 4:
                    System.out.println("Thank you! Visit again.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }
    }
}

class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    void setDetails(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount > 0){
            balance = amount + balance;
            System.out.println("Deposited : "+amount);
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
    }

    void Withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("WithDrawn : "+amount);
        }
        else if(amount > balance){
            System.out.println("Insufficient finds for withdrawal");
        }
        else{
            System.out.println("Withdrawal amount must be positive");
        }
    }

    void displayDetails(){
        System.out.println("Account Holder Name : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
    }
}

