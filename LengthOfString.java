// Finding the length of the String without using the strlen()
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
