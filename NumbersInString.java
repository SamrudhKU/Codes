public class NumbersInString {
    public static void main(String[] args) {
        String str = "s09f890sf09";
        for (int i = 0; i < str.length(); i++) {
            int num = str.parseInt(str.charAt(i));
        }
    }

    