public class pratice2 {

    public static void printPerm(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String r = str.substring(0, i) + str.substring(i + 1);
            printPerm(r, ans + ch);
        }
    }

    public static void main(String[] args) {

        String str = "ABC";
        printPerm("ABC", " ");

        int i = 0;
        System.out.println(str.substring(0, i));
        System.out.println(str.substring(i + 1));
        System.out.println();
        i = 1;
        System.out.println(str.substring(0, i));
        System.out.println(str.substring(i + 1));
        System.out.println();
        i = 2;
        System.out.println(str.substring(0, i));
        System.out.println(str.substring(i + 1));

    }
}
