
public class R12_balancedCombinations {
    public static void patterCombanition(int n, int open, int close, String str) {

        if (open == n && close == n) {
            System.out.println(str);
            // return str;
        }
        if (open < n)
            patterCombanition(n, open + 1, close, str + "{");
        if (close < open)
            patterCombanition(n, open, close + 1, str + "}");

    }

    public static void main(String args[]) {
        int n = 3;
        patterCombanition(n, 0, 0, " ");

    }
}
