public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int num = 2545;
        char output[] = new char[20];
        int i = 0;
        while(num>0){
            int last = num%16;
            if (last>9) {
                output[i] = (char) (last+55);
            } else {
                output[i] = (char) (last+48);
            } 
            i++;
            num/=16;
        }

        for (int j = i-1; j >= 0; j--) {
            
            System.out.print(output[j]);
        }
    }
}
