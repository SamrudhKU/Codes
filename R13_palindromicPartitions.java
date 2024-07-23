public class R13_palindromicPartitions {

    private static String checkPossiblites(String str, int len, int index) {
        
    }

    public static boolean isPalindrome(String str, int len ){
        for (int i=0; i<len/2;){
            if (str.charAt(i) == str.charAt(len-i)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String str = "aabaa";
        checkPossiblites(str, str.length()-1, 0);
    }

    
}