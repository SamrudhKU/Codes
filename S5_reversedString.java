public class S5_reversedString {

    public static String reversedString(String str, int i){
        if (i<0) {
            return "";
        }
        char ch = str.charAt(i);
        return ch + reversedString(str, i-1);
    }
    
   

    public static void main(String[] args) {
        String str = "Samrudh";

        System.out.println(reversedString(str,str.length()-1));

        // String has 3 class 
        // 1.String class is gives the immutabel strings
        // 2.StringBuilder class it used or immutable String
        // 3.StringBuffer class is like a string, but can be modified the length and the value usign the methods
        
        // StringBuilder sb = new StringBuilder();
        // sb.append(str);
        // sb.reverse();
        // System.out.println(sb);
    }
}
