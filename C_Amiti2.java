public class C_Amiti2 {

    // Test cases
    // ("abcabc")); // Output: "aa"
    // ("bcab")); // Output: "b"
    // ("cccc")); // Output: "cccc"
    public static String stringReduction(String stz) {
        // Continue reducing the string until no further reduction is possible
        while (true) {
            boolean foundReduction = false;
            StringBuilder reducedString = new StringBuilder();

            for (int i = 0; i < stz.length(); i++) {
                if (i < stz.length() - 1 && stz.charAt(i) != stz.charAt(i + 1)) {
                    // Find adjacent different characters and reduce them
                    reducedString.append(getThirdCharacter(stz.charAt(i), stz.charAt(i + 1)));
                    i++; // Skip the next character as it's already reduced
                    foundReduction = true;
                } else {
                    // Add the current character if no reduction is possible
                    reducedString.append(stz.charAt(i));
                }
            }

            // If no reduction was found, break the loop
            if (!foundReduction) {
                break;
            }

            // Update the string for the next iteration
            stz = reducedString.toString();
        }

        // Return the reduced string
        return stz;
    }

    // Helper function to get the third character
    private static char getThirdCharacter(char a, char b) {
        if ((a == 'a' && b == 'b') || (a == 'b' && b == 'a')) {
            return 'c';
        } else if ((a == 'b' && b == 'c') || (a == 'c' && b == 'b')) {
            return 'a';
        } else { // (a == 'c' && b == 'a') || (a == 'a' && b == 'c')
            return 'b';
        }
    }

    public static int stringReduction1(String str) {
        // If all characters are same, return the length of the string
        if (str.chars().distinct().count() == 1) {
            return str.length();
        }

        // Count occurrences of 'a', 'b', and 'c'
        int countA = 0, countB = 0, countC = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a')
                countA++;
            else if (ch == 'b')
                countB++;
            else if (ch == 'c')
                countC++;
        }

        // If all counts are even or odd, the final length will be 2
        if ((countA % 2 == countB % 2) && (countB % 2 == countC % 2)) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stringReduction("abcabc")); // Output: "aa"
        System.out.println(stringReduction("bcab")); // Output: "b"
        System.out.println(stringReduction("cccc")); // Output: "cccc"

        // Test cases 2
        System.out.println(stringReduction1("abcabc")); // Output: "aa"
        System.out.println(stringReduction1("bcab")); // Output: "b"
        System.out.println(stringReduction1("cccc")); // Output: "cccc"
    }
}
