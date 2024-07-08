import java.util.Arrays;

public class S9_frequencyOfChar {

    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    // this method builds count array which updates frequency for each
    // ascii character (0-255)
    // example for 'p' ascii value is 112, in the array
    // count[112] value would be 2 (p appears twice)
    static void buildCharCountArray(String str) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            int ch = count[str.charAt(i)];
        }
    }

    // this method finds first non repeating character
    // returns the index of the first non repeating character
    static int findFirstNonRepeating(String string) {
        // build char count array
        buildCharCountArray(string);

        int pos = -1, i;

        for (i = 0; i < string.length(); i++) {
            int ch2 = count[string.charAt(i)];
            if (count[string.charAt(i)] == 1) {
                pos = i;
                break;
            }
        }

        return pos;
    }

    public static void main(String[] args) {

        // Variables decleared

        // String str = "Sammu";
        // String temp = str;
        // str = str.toUpperCase();
        // char ch[] = new char[str.length()];
        // ch = str.toCharArray();
        // int freq[] = new int[str.length()];
        // boolean flag = true;

        // to find first non reapting character
        String string = "prepinsta";
        int pos = findFirstNonRepeating(string);

        for (int i = 0; i < string.length(); i++) {
            System.out.println(count[string.charAt(i)]);
        }

        System.out.println(
                pos == -1
                        ? "All characters are repeating "
                        : "First non-repeating character is "
                                + string.charAt(pos));

        // to find first non reapting character

        // for (int i : str.toCharArray()) {
        // if (str.indexOf(i) == str.lastIndexOf(i)) {
        // System.out.println("The first reapting character"+i);
        // flag = false;
        // break;
        // }
        // }
        // if (flag) {
        // System.out.println("no repeating element");

        // }

        // to find the frequency of the character

        // for (int i = 0; i < str.length(); i++) {
        // freq[i] = 1;
        // for (int j = i + 1; j < str.length(); j++) {
        // if (ch[i] == ch[j]) {
        // freq[i]++;
        // ch[j] = '0';
        // }
        // }
        // }
        // for (int i = 0; i < freq.length; i++) {
        // if (ch[i] != '0' && freq[i] == 1)
        // System.out.println(temp.charAt(i) + ":" + freq[i]);
        // }

        // using the boolena array to find visited

        // boolean visited[] = new boolean[str.length()];
        // Arrays.fill(visited, false);
        // for (int i = 0; i < str.length(); i++) {
        // int count = 0;
        // if (visited[i] == true) {
        // continue;
        // }
        // for (int j = i; j < str.length(); j++) {
        // if(str.charAt(i) == str.charAt(j)){
        // count++;
        // visited[j] = true;
        // }
        // }
        // System.out.println(temp.charAt(i)+":"+count);
        // }
    }
}
