import java.util.Arrays;

public class S15_anagram{

    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to character array and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // String s1 = "dsaf".toLowerCase();
        // String s2 = "asdf".toLowerCase();

        String s1 = "listen";
        String s2 = "silent";

        boolean status = false;
        if (s1.length()==s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j) && s2.charAt(i) == s1.charAt(j)) {
                        status = true;
                        break;
                    } else{
                        status = false;
                    }
                }
                if (!status) {
                    break;
                }
            }
        } else {
            System.out.println("Not Anagram");
        }

        if (!status) {
            System.out.println("Not Anagram");
        } else {
            System.out.println("Anagram");
        }


        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are Anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams.");
        }
    }
}