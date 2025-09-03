import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class S17_firstNonRepeatingCharacter {

    public static int findNonRepeating(String str) {
        // checking if there is character is present are not
        if (str == null) {
            return -1;
        }
        str = str.toLowerCase();
        boolean status[] = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            // If the character is alread checked then skiping that
            if (status[str.charAt(i)] == true) {
                continue;
            }
            for (int j = i; j < str.length(); j++) {
                // Find the number of count of that element
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    status[str.charAt(j)] = true;
                }
            }
            // If it is first non repeating charater, then returning that
            if (count <= 1) {
                System.out.println("First Non-Repeating Character: " + str.charAt(i));
                return 0;
            }
        }
        return -1;
    }

    public static char findNonRepeating1(String str) {
        // LinkedHashMap preserves insertion order
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count character frequency
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find first character with count = 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.next();

        if (findNonRepeating(str) == -1) {
            System.out.println("First Non-Repeating Character: " + -1);
        }

        char ch = findNonRepeating1(str);
        if (ch == '\0') {
            System.out.println("There is no non-repeating Character");
        } else {
            System.out.println("First Non-Repeating Character: " + ch);
        }

        s.close();
    }
}