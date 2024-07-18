import java.util.Scanner;

public class RemoveVowels {

    // Method to remove vowels recursively
    public static String removeVowels(String str) {
        // Base case: if the string is empty, return the empty string
        if (str.isEmpty()) {
            return str;
        }

        // Check if the first character is a vowel
        char firstChar = str.charAt(0);
        if (isVowel(firstChar)) {
            // If it is a vowel, skip it and recurse on the remaining string
            return removeVowels(str.substring(1));
        } else {
            // If it is not a vowel, include it and recurse on the remaining string
            return firstChar + removeVowels(str.substring(1));
        }
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Remove vowels and print the result
        String result = removeVowels(inputString);
        System.out.println("String after removing vowels: " + result);

        scanner.close();
    }
}
