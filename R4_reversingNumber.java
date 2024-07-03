public class R3_reversingNumber {

    public static void reversedNum(int num){
        if (num<10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num%10);
            reversedNum(num/10);
        }
        
    }
    public static void main(String[] args) {
        int num = 1234;
        reversedNum(num);
    }
}
