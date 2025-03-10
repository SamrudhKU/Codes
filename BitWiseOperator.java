public class BitWiseOperator {

    public static void isEvenOrOdd(int num){
        if ((num&1)==0 ) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void isEvenOrOdd1(int num){
        // Checking even or odd without modulus operator
        if ((num/2)*2 == num) {
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        int num = 12;
        isEvenOrOdd(num);

        isEvenOrOdd1(num);
        // Bitwise right swift operator
        int num1 = 4;
        System.out.println(num1<<2);

        // Bitwise left swift operator
        int num2 = 16;
        System.out.println(num2>>2);

    }
}
