public class C_GlassBeam2 {
    
    public static int fib(int num){
        if(num==0){
            return 0;
        }
        if (num==1) {
            return 1;
        }
        return fib(num-2) + fib(num-1);
    }

    public static int fib1(int num){
        int a = 0;
        int b = 1;
        if(num==0){
            return 0;
        }
        if (num==1) {
            return 1;
        }
        for (int i = 2; i <= num; i++){
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // Program to find the fibonacci of number
    // 0,1,1,2,3,5,8
    public static void main(String[] args) {
        
        int num = 6;
        System.out.println("Fibonacci of Number is: "+fib(num));

        // System.out.println("Fibonacci of Number of is: "+fib1(num));

    }
}
