public class IBM2 {
    public static String newPassword(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int lenA = a.length(), lenB = b.length();

        // Interleave characters from both strings
        while (i < lenA && j < lenB) {
            result.append(a.charAt(i++));
            result.append(b.charAt(j++));
        }

        // Append remaining characters from a (if any)
        while (i < lenA) {
            result.append(a.charAt(i++));
        }

        // Append remaining characters from b (if any)
        while (j < lenB) {
            result.append(b.charAt(j++));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(newPassword("abc", "def")); // Output: "adbecf"
        System.out.println(newPassword("cat", "rabbit")); // Output: "craatbbit"
    }
}