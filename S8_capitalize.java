// program to conver the first and last Character to capital
public class S8_capitalize {
    public static String capitalize(String str) {
        if (str.length()<2) {
            str = str.toUpperCase();
            return str;
        }
        
        str = Character.toString(str.charAt(0)).toUpperCase() + str.substring(1,str.length()-1) + str.substring(str.length()-1).toUpperCase();
        
        return str;
    }
    public static void main(String[] args) {
    String str = "i am form thirthahalli";
    String newStr[] = str.split("\\s") ;   
    for (int i = 0; i < newStr.length; i++) {
        System.out.print(capitalize(newStr[i])+" ");
    }    

    }
}