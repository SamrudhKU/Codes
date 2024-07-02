import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args) {
        // int binary =0101;
        Scanner sc = new Scanner(System.in);    
		System.out.print("Enter a binary number : ");
		int binary = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while (binary>0){
            int digit = binary % 10;
            decimal += digit * Math.pow(2, n);
            binary=binary/10;
            n++;
        }

        System.out.println(decimal);

        sc.close();
    }
}