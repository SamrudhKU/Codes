import java.util.Scanner;

public class ArmStrong{
    public static void main(String args[]){
        // int num = 371; 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Range ");
        int range = s.nextInt();
        for (int i = 0; i <= range; i++) {
            int order = length(i);
            if(i==isArm(i, order)){
                System.out.println(i);
            }
        }
        s.close();
    }

    private static int length(int num) {
        int len = 0;
        while(num>0){
            num = num/10;
            len++;  
        }
        return len;
    }

    private static int isArm(int num, int len) {
        if(num==0){
            return 0;
        }

        int digit = num%10;

        return (int)Math.pow(digit, len) + isArm(num/10, len);
   }
}