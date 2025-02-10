public class R17_palindrome {
    
    public static String reverse(String str){
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str, int start, int end){
        if (start>=end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalindrome(str, start+1, end-1);
    }
    public static void main(String...Samrudh){

        String str = "malayalam";
        String rev = reverse(str);

        // Checking the palindrome of the String by reverseing the String
        if (str.equals(rev)) {
            System.out.println(str+" is palindrome");
        } else{
            System.out.println(str+" is not palindrome");
        }

        // Checking the palindrome of the String by recursibe method
        if (isPalindrome(str, 0, str.length()-1)) {
            System.out.println(str+" is palindrome");
        } else{
            System.out.println(str+" is not palindrome");
        }
    }
}
