// Here we are finding the N-bit binary nubmer zeros or one.
// Hear N - the number is bit in the binary number.
// To calculate the range 2^(N-1) to (2^N)-1

public class R14_NbitNumberOnesOrZeros {

    public static void binaryNumber(int num, String str) {
        int i = 1;
        int binary = 0;
        while (num > 0) {
            binary += (num % 2) * i;
            num /= 2;
            i *= 10;
        }
        System.out.print(binary+ " ");
    }

    public static void printNumbers(String binary, int extraElement, int remainingPlaces){
        if (remainingPlaces == 0) {
            System.out.println(binary);
            return;
        }
        printNumbers(binary+"1", extraElement+1, remainingPlaces-1);
        if (extraElement>0) {
            printNumbers(binary+"0", extraElement-1, remainingPlaces-1);
        }
    }
    public static void main(String args[]) {
        int bit = 4;

        printNumbers("",0, bit);

        // To print numbers
        // for(int i = (int) Math.pow(2,(bit-1)); i<= (int)Math.pow(2,bit)-1;i++){
        //    binaryNumber(i,"");
        // }
       
    }

}
