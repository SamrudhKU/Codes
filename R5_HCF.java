public class R5_HCF {

    // public static int hcf(int num1, int num2){    
    //     if (num1<=0 || num2<=0) {
    //         return num1>num2 ? num1 :num2;
    //     }
    //     if(num1 == num2)
    //         return num1;
    //     return hcf(num2, num1%num2);
    // }
 
    public static int hcf(int num1, int num2){
        if (num1<=0 || num2<=0) {
            return num1>num2 ? num1 :num2;
        }
        if(num1 == num2)
            return num1;
        if(num1>num2)
            hcf(num1-num2, num2);
        return hcf(num1, num2-num1);
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
       
        System.out.println(hcf(num1, num2));
    }
}
