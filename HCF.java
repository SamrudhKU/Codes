// Highest common factor
// Formula: Highest Number - lowest number until it becomes equal the return number
public class HCF {

    // private static int getHCF(int num1, int num2) {
    //     if (num1 == 0)
    //         return num2;
    //     if (num2 == 0)
    //         return num1;
    //     if (num1 == num2)
    //         return num2;
    //     if (num1 > num2)
    //         return getHCF(num1 - num2, num2);
    //     return getHCF(num1, num2 - num1);
    // }

    
    // static int getHCF(int a, int b){
    //     return b==0? a:getHCF(b, a%b);
    // }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        // Using the recursion function
        // int hcf = getHCF(num1, num2);
        // System.out.println(hcf);

       
        int i = 2;
        int hcf = 1;
        while((int) Math.sqrt(num2)>i){
        if(num1%i==0 && num2%i==0){
        hcf *= i;
        num1/=i;
        num2/=i;
        } else {
        i++;
        }
        }
        System.out.println(hcf);

        while (num1!=num2) {
        if(num1>num2)
        num1-=num2;
        else
        num2-=num1;
        }
        System.out.println(num2);

    }
}
