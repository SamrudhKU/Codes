public class R16_removeAdjacentDuplicateChar {

    // public static void adjacentDuplicateChar(String str, String nstr,char ch,
    // char nch, int sindex, int nindex ){
    // if (str.length()-1 == sindex) {
    // if (str.charAt(sindex) != ch && nch != str.charAt(sindex)) {
    // nstr = nstr+str.charAt(sindex);
    // }
    // System.out.println(nstr);
    // return;
    // }
    // if (str.charAt(sindex) == str.charAt(sindex+1)) {
    // adjacentDuplicateChar(str, nstr, ch, nch, sindex+2, nindex);
    // }
    // if (str.charAt(sindex) == ch) {
    // adjacentDuplicateChar(str, nstr, ch, nch, sindex+1, nindex);
    // }
    // if (str.charAt(sindex) != str.charAt(sindex+1) && str.charAt(sindex) !=
    // nstr.charAt(nindex) && nstr.charAt(nindex) != str.charAt(sindex)) {
    // ch = str.charAt(sindex);
    // adjacentDuplicateChar(str, nstr+str.charAt(sindex), ch, nstr.charAt(nindex),
    // sindex+1, nindex+1 );
    // }
    // }

    public static String adjacentDuplicateChar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (j < str.length() - 1 && str.charAt(j) == str.charAt(j + 1)) {
                j++;
            }

            if (i == j) {
                sb.append(str.charAt(i));
            }

            i = j + 1;
        }

        String output = sb.toString();
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

// public class R16_removeAdjacentDuplicateChar {

// // Recursive function to remove all adjacent duplicates
// public static String removeAdjacentDuplicates(String str) {
// // Base case: If the string is empty or has only one character
// if (str.length() <= 1) {
// return str;
// }

// // Iterate through the string and remove adjacent duplicates
// StringBuilder sb = new StringBuilder();
// int i = 0;
// while (i < str.length()) {
// // Check if the current character is the same as the next character
// int j = i;
// while (j < str.length() - 1 && str.charAt(j) == str.charAt(j + 1)) {
// j++;
// }

// // If adjacent duplicates were found, skip them
// if (j == i) {
// sb.append(str.charAt(i));
// }

// // Move to the next unique character
// i = j + 1;
// }

// // Recursively call the function until no more adjacent duplicates are found
// String result = sb.toString();
// if (result.length() == str.length()) {
// return result;
// } else {
// return removeAdjacentDuplicates(result);
// }
// }

// public static void main(String[] args) {
// String input = "abbaca";
// String output = removeAdjacentDuplicates(input);
// System.out.println("Original String: " + input);
// System.out.println("String after removing adjacent duplicates: " + output);
// }
// }
