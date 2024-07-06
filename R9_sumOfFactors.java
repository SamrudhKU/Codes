// Program is to find the sum of factors 
// Input : 4
// Output : 5167
// Explanation : 1 + (2*3) + (4*5*6) + (7*8*9*10) = 5167.

import java.util.Scanner;

public class R9_sumOfFactors {

    // public static int findFactors(int num, int i, int k){
    // int sum = 1;
    // if(i>num) {
    //     return 0;
    // }
    // for(int j = 0; j<i;j++){
    //     sum*=k;
    //     k++;
    // }
    // return sum+findFactors(num, i+1, k);
    // }

    public static int findFactors(int num, int current, int calculated) {
        int i, sum = 1;
        if (current>num){
            return 0;
        }
        for (i= calculated ; i < current + calculated; i++) {
            sum*=i;
        }
        return sum + findFactors(num, current+1, i);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to get factors ");
        int num = s.nextInt();
        int result = findFactors(num, 1, 1);
        System.out.println(result);
        s.close();
    }
}
