// Decimal to octal conversion is same as this but by 8

public class DecimalToBinary{
    public static void main(String[] args) {
        int i=0;
        int binary [] = new int [8];
        int num = 15;
        while (num>0){
            binary[i++] = num%2;
            num/=2;
        }

        for (int j = i-1; j>=0;j--){
            System.out.print(binary[j]);
        }
        // System.out.println(binary);
    }
}