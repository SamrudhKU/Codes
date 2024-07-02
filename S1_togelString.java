// Converting lower case to upper case vice versa
public class S1_togelString {
    public static void main(String[] args) {
        String str = "Samrudh";
        
        // String java is immutable it can't be changed

        // so we are creating a empty string and add by a character to it
        String str1 = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                str1 = str1+Character.toUpperCase(str.charAt(i));
            } else {
                str1 += Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(str1);
    }
}
