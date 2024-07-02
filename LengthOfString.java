// Finding the length of the String without using the strlen()
// It can be done by converting it toCharArray() and itterating with for each loop
public class LengthOfString {
    public static void main(String[] args) {
        String str = "Samrudh";
        int i = 0;
        char[] ch = str.toCharArray();
        for (char st : ch) {
            i++;
        }
        System.out.println(i);
    }
}

