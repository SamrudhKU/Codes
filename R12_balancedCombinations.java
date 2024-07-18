// Generating all the possible combination of the closed parenthesis
public class R12_balancedCombinations {
    public static void patterCombanition(int n, int open, int close, String str) {

        if (open == n && close == n) {
            System.out.println(str);
        }
        if (open < n)
            patterCombanition(n, open + 1, close, str + "{");
        if (close < open)
            patterCombanition(n, open, close + 1, str + "}");
    }

    public static void main(String args[]) {
        int n = 3;
        patterCombanition(n, 0, 0, " ");
        // The following recursion are important 
        // 1.  p(3,0,0," ");  prints  {{{}}}
        // 2.  p(3,2,0, {{);  prints  {{}{}}
        // 3.  p(3,2,1, {{}); prints  {{}}{}
        // 4.  p(3,1,0, {);   prints  {}{{}}
        // 5.  p(3,1,1,{});   print   {}{}{}
    }
}
