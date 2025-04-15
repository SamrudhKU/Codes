import java.util.Arrays;

public class L5_validPrenthesis {

    private static boolean isValid(String p){
        Character open[] = new Character[p.length()/2];
        int k = 0;
        if (p.charAt(0) == '}' || p.charAt(0) == ')' || p.charAt(0) == ']' || p.length()%2 != 0) {
            return false;
         } 
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '{' || p.charAt(i) == '(' || p.charAt(i) == '[') {
                open[k] = p.charAt(i);
                k++;
            } else if(open[k-1] == '{' && p.charAt(i) == '}'){
                open[k-1] = null;
                k--;
            } else if(open[k-1] == '(' && p.charAt(i) == ')'){
                open[k-1] = null;
                k--;
            } else if(open[k-1] == '[' && p.charAt(i) == ']'){
                open[k-1] = null;
                k--;
            } else {
                return false;
            }
        }
    
       for (Character c : open) {
        if (c != null) {
            return false;
        } 
       }
        return true;
    }


    public static void main(String...Samrudh){
        String p = "([])";
        System.out.println(isValid(p));

        Character open[] = new Character[p.length()/2];

        
    }
}
