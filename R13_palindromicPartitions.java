import java.util.ArrayList;
import java.util.List;

public class R13_palindromicPartitions {

    // To get get the sequency of subString
    // public static void sequence(String str, String ans){
    // if (str.length()==0) {
    // System.out.print(ans+" ");
    // }
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // String ss = str.substring(0, i) + str.substring(i+1);
    // sequence(ss, ans+ch);
    // }
    // }


    // To get the sebSet of the strings
    // public static String sequence(String str,int i, String ans){
    // if (str.length()<=i) {
    // System.out.print(ans+" ");
    // return str;
    // }
    // sequence(str , i+1, ans+str.charAt(i ));
    // return sequence(str, i+1, ans);
    // }



    // public static String palindromicPattern(String str, int i, String ans){
    // if (str.length()/2 == i) {
    // return str;
    // }
    // if (isPalindromic(str) && i==1) {
    // System.out.println(str);
    // }
    // String s1 = str.substring(0,i);
    // String s2 = str.substring(i, str.length()-1-i-1);
    // String s3 = str.substring(str.length()-1-i, str.length()-1);
    // System.out.println(s1+" "+ s2+" "+s3);
    // // while (i==str.length()/2) {
    // // }
    // // if (i==1) {
    // // if (isPalindromic(s2)) {
    // // System.out.println(s1+" "+ s2+" "+s3);
    // // }
    // // }
    // // else if (isPalindromic(s3) && isPalindromic(s1) && isPalindromic(s2)) {
    // // System.out.println(s1+" "+ s2+" "+s3);
    // //
    // return palindromicPattern(str, i+1, ans);
    // }

    public static boolean isPalindromic(String str) {
        boolean flag = false;
        if (str == "") {
            return true;
        }
        if (str.length() == 1) {
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }


    public static void main(String[] args) {

        // String str = "abc";
        // sequence(str,0, "");

        String str = "aabaa";
        // palindromicPattern(str, 1,"");

        List<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <= str.length() / 2; i++) {

            String s1 = str.substring(0, i);
            String s2 = str.substring(i, str.length() - i);
            String s3 = str.substring(str.length() - i);
            list.add(s1);
            list.add(s2);
            list.add(s3);
            // System.out.println(s1+" "+ s2+" "+s3);
            boolean flag = false;

            for (String string : list) {
                if (isPalindromic(string)) {
                    flag = true;
                } else {
                    flag = false;
                    count++;
                }
            }

            if (flag) {
                System.out.println(list.toString());
            }

            // To clear the ArrayList 
            list.clear();
        }

        if (count == 0) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
        }

    }
}



// Solutioned method