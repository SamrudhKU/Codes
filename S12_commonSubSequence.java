// This program shows how to strore the subSequence in Array from
import java.util.ArrayList;
import java.util.List;

public class S12_commonSubSequence {
    public static String subString(String str,int n, String ans, List<String> result){
        if (n == str.length()) {  
            result.add(ans);         
            return ans;
        }
        
        subString(str, n+1, ans+str.charAt(n), result);
        return ans +  subString(str, n+1, ans, result);
    }

    public static String[] getSubstring(String str){
        List<String> result = new ArrayList<>();
        subString(str,0,  " ", result);
        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "AB";
        String[] subSequence1 = getSubstring(str1);
        String[] subSequence2 = getSubstring(str2);
       
        for (String string : subSequence1) {
            System.out.print(string+" ");
        }

        System.out.println();

        for (String string : subSequence2) {
            System.out.print(string+" ");
        }
    }
}
