// Anagram means two string contains same length and same characters but it can be shuffled

import java.util.Arrays;

public class S10_anagram {
    public static void main(String[] args) {
        String str1 = "prep";
        String str2 = "repp";

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
            // To sort two char array

            // for (int i = 0; i < ch2.length; i++) {
            //     for (int j = 0; j < ch2.length; j++) {
            //         if (ch1[i] < ch1[j]) {
            //             char temp = ch1[i];
            //             ch1[i] = ch1[j];
            //             ch1[j] = temp;
            //         }
            //         if (ch2[i] < ch2[j]) {
            //             char temp = ch2[i];
            //             ch2[i] = ch2[j];
            //             ch2[j] = temp;
            //         }
            //     }
            // }

            // boolean flag = false;
            // for (int i = 0; i < ch2.length; i++) {
            //     if (ch1[i] == ch2[i]) {
            //         flag = true;
            //     } else {
            //         System.out.println("Not anagram");
            //         flag = false;
            //         break;
            //     }
            //     // System.out.println(ch1[i]+" : "+ch2[i]);
            // }

            // if (flag) {
            //     System.out.println("It is Anagram");
            // }
        }
    }
}
