public class A8_longestPalindrome {
    public static void main(String[] args) {
        int arr[] = new int[]{1,12,1221,568,897,555};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        System.out.println("longest Palindrome number: "+max);
    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp>0) {
            int last =  temp%10 ;
            rev = (rev*10)+last;
            temp/=10;
        }
        if (num == rev) {
            return true;
        } else {
            return false;
        }
    }
}
