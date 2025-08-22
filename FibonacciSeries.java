public class FibonacciSeries {

    public static void main(String[] args) {

        int range = 7;
        System.out.println(fib2(range, 0, 1));

    }

    private static int fib2(int num, int a, int b){
        if (num<1) {
            throw new IllegalArgumentException("Can't get Fibonacci Series of Less then One");
        } else if (num==1) {
            return 0;
        } else if (num<=2) {
            return b;
        } else{
            return fib2(num-1, b, b+a);
        }
    }
}

