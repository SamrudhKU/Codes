import java.util.Scanner;

public class Validation {
    // Program is to validate the phone Number and email.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = sc.nextLine();
        System.out.println("Enter your phone number");
        String num = sc.nextLine();

        // String email = "samrudh@gmail.com";
        // String num = "9110650079";
        
        if (email.matches("[a-z]+@[a-z]+.[a-z]+") && num.matches("[6-9][0-9]{9}")) {
            System.out.println("Succesful validation");
        } else{
            System.out.println("Unsuccessful validation");
        }
        
        sc.close();
        
    }
}
