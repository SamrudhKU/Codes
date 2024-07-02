public class StongNumber {

    static int fact = 1;
    public static void main(String[] args) {
        int num = 145, temp = num;
        int strongNum = 0;
        while(num>0){
            int lDigit = num%10;
            strongNum += fact(lDigit);;
            num/=10;
        }

        System.out.println(strongNum);

        if (temp==strongNum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strng Number");
        }
    }
    
    private static int fact(int lDigit) {
        int fact=1;
        while (lDigit>0) {
            fact = fact*lDigit;
            lDigit--;
        }

        return fact;
    }
}
