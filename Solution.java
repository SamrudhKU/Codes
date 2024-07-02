import java.util.Scanner;

public class Solution {

    // Method to check if a number is Automorphic
    public static boolean isAutomorphic(int num) {
        // Calculate the square of the number
        int square = num * num;
        
        // Variables to compare digits
        int tempNum = num;
        int tempSquare = square;

        // Loop through each digit of the original number
        while (tempNum > 0) {
            // Get the last digits of both the number and its square
            int numDigit = tempNum % 10;
            int squareDigit = tempSquare % 10;
            
            // If the digits do not match, it's not an Automorphic number
            if (numDigit != squareDigit) {
                return false;
            }
            
            // Remove the last digit from both the number and its square
            tempNum /= 10;
            tempSquare /= 10;
        }
        
        // If all digits matched, it's an Automorphic number
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the entered number is Automorphic
        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic number.");
        } else {
            System.out.println(number + " is not an Automorphic number.");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
