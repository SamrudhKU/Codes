public class R16_removeAdjacentDuplicateChar {

    public static String adjacentDuplicateChar(String str) {
        if (str.length() <= 1) {
            return str;
        }

        // To store once duplicate element removed
        StringBuilder sb = new StringBuilder();
        int i = 0;

        // Iterate through all the elements
        while (i < str.length()) {
            int j = i;

            // To find if the duplicate element is present 
            while (j < str.length() - 1 && str.charAt(j) == str.charAt(j + 1)) {
                j++;
            }

            // If j is not increment. It means no duplicate adjacent element
            if (i == j) {
                sb.append(str.charAt(i));
            }

            // Increment to the next character to the string
            i = j + 1;
        }

        String output = sb.toString();

        // If the string length and output length matches it means there no adjacent duplicate elements found
        if (output.length() == str.length()) {
            return output;
        } else {
            return adjacentDuplicateChar(output);
        }
    }

    public static void main(String args[]) {
        String str = "acbbbdddce";
        System.out.println(adjacentDuplicateChar(str));
        // char ch = str.charAt(0);
        // char nch = str.charAt(0);
        // adjacentDuplicateChar(str, " ", ch, nch, 0, 0);

    }
}
