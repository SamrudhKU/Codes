public class L2_palindrome {
    static public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int halfRev = 0;
        while(x > halfRev) {
            halfRev = (halfRev * 10) + (x % 10);
            x /= 10;
        }
        return x == halfRev || x == halfRev / 10;
    }
    public static void main(String[] args) {

        int num = 1221;
        System.out.println(isPalindrome(num) ? "It is palindrome" : "Not palindrome");
    }
}
