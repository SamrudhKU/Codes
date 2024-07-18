public class S4_palindrome {

    // public static boolean isPalindrome(String str) {
    //     for (int i = 0; i < str.length()/2; i++) {
    //         if (str.charAt(i) == str.charAt(str.length()-1-i)) {
    //             return true;
    //         } 
    //     }
    //     return false;
    // }

    public static boolean isPalindrome(String str, int i){
        if (str.charAt(i) == str.charAt(str.length()-1-i)) {
            return true;
        } 
        isPalindrome(str, i+1);

        return false;
        
    }
    public static void main(String args[]){
        String str = "Samrudh";

        if (isPalindrome(str, 0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}