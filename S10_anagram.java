// Anagram means two string contains same length and same characters but it can be shuffled

import java.util.Arrays;

public class S10_anagram {

    public static void m1(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.println("It's anagram");
            } else {
                System.out.println("Not anagram");
            }
        }
    }

    public static void m2(String str1, String str2){
        if (str1.length()!= str2.length()) {
            System.out.println("Not anagram");
        } else {
            boolean status = false;
            int count[] = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i]==0) {
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }

            System.out.println(status==true?"Anagram":"not anagram");
        }
    }

    public static void main(String[] args) {
        String str1 = "p r ep".replaceAll("\\s", "").toLowerCase();
        String str2 = "repp".replaceAll("\\s", "").toLowerCase();

        // m1(str1, str2);

        m2(str1, str2);

    }
}
