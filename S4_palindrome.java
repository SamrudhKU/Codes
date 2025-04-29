public class S4_palindrome {

    // public static boolean isPalindrome(String str) {
    //     for (int i = 0; i < str.length()/2; i++) {
    //         if (str.charAt(i) == str.charAt(str.length()-1-i)) {
    //             return true;
    //         } 
    //     }
    //     return false;
    // }

    public static boolean isPalindrome(String str, int start, int end){
       if (start>=end) {
        return true;
       }
       if (str.charAt(start) !=str.charAt(end)) {
        return false;
       }
       return isPalindrome(str, start+1, end-1);
    }

    
    public static void main(String args[]){
        // String str = "Samrudh";
        // String str = "Malayalam";

        String str = "aF, Ds_sd fa";
        str = str.replaceAll("[,_\\s]", "").toLowerCase();
        if (isPalindrome(str, 0, str.length()-1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
    }
}