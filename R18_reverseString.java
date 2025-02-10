public class R17_palindrome {
    
    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: reverse the rest of the string and append the first character
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String args[]){

        String input = "Helo";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
  


    }
}
