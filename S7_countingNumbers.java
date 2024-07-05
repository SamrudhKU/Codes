public class S7_countingNumbers {
    public static void main(String[] args) {
        String str = "4SU20CS083";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            // Character.isDigit() is a built-in function to check the digit 
            // if (str.charAt(i) > '0' && str.charAt(i)<='9' || Character.isDigit(str.charAt(i))) {
            //     // to get the numeric value from the string we use the Character.getNumericValue()
            //     sum+=Character.getNumericValue(str.charAt(i));
            // }

            if (str.charAt(i) > '0' && str.charAt(i)<='9' ) {
                sum+=str.charAt(i) - 48;
            }
        }
        // sum = str.charAt(0);
        System.out.println(sum);
    }

}