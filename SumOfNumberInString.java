// program to find the sum of numbers in the string

public class SumOfNumberInString {

    private static int countNumber(String str) {
        int count = 0;
        // it conver string to char array
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {

                // the minus 48 because it is in ASCII value
                count += (c-48);  
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "4su20cs083";
        System.out.println(countNumber(str));
    }
}
