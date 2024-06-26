// Least Common Multiple.
// Formula = (num1 * num2) / hcf

public class LCM {
    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 36;

        int max = num1>num2? num1/2+1 : num2/2+1;
        int i = 2;
        int hcf = 1;
        while (max> i) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf *= i;
                num1 /= i;
                num2 /= i;
            } else if (num1 % i == 0) {
                hcf *= i;
                num1 /= i;
            } else if (num2 % i == 0) {
                hcf *= i;
                num2 /= i;
            } else {
                i++;
            }
        }
        System.out.println(hcf);
    }
}

