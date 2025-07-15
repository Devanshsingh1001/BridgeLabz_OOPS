import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeChecker p = new PalindromeChecker();
        
        System.out.println("Enter a string to check if it is a palindrome : ");
        String input = sc.nextLine();

        p.setString(input);

        if(p.isPalindrome()){
            System.out.println("\""+input+ "\"is a palindrome.");
        }
        else{
            System.out.println("\""+input+ "\"is a not palindrome.");
        }
    }
}

class PalindromeChecker{
    String str;

    void setString(String str){
    this.str = str;
    }

    boolean isPalindrome(){
        String original = str.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}