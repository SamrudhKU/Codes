public class R8_permutaionOfString {

    // Recursion is mainly help for backtracking the problems
    public static void permute(String str, String ans) {
        if(str.length()==0){
            System.out.print(ans+" ");
            return; 
        }
        // each the loop will start at zero until it return the value of the function call
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String r = str.substring(0,i) + str.substring(i+1);
            // Hear it will return the substring 
            permute(r, ans+ch);
        }
    }
    public static void main (String args[]){
        String str = "abcd";
        permute(str, "");
    }
}