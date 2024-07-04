public class R7_lengthOfString {

    public static int lengthOfString(String str){
        if (str == "") {
            return 0;
        }
        return 1 + lengthOfString(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "Samrudh";
        System.out.println(lengthOfString(str));
    }
}
