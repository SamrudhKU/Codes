public class FibonacciSeries {

    static int num1 = 0, num2 = 1, sum;
    public static void main(String[] args) {
        int range = 7;
        range-=2;
        // System.out.print(num1+" ");
        // System.out.print(num2+" ");


        // To print the fibonacci of nth term
        System.out.println(fib(range));

    }

    private static int fib(int range) {
        if(range>0){
            
                sum = num1 + num2; 
                // System.out.print( sum + " ");
                num1 = num2;
                num2 = sum;
                fib(range-1);
            
        }
        return sum;
    }
}

