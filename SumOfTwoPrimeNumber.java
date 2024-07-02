// Program to find Can a number be expressed as a sum of two prime numbers using java

import java.util.Scanner;
public class SumOfTwoPrimeNumber {

    public static boolean isPrime(int num){
        if(num<2){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        boolean flag = false;

        // it uses two loops it can be simplified as 
        // for (int i = 2; i <= num; i++) {
        //     if (isPrime(i) ) {
        //         for (int j = i; j <= num; j++) {
        //             if (isPrime(j)) {
        //                 sum = i+j;
        //                 if(sum==num){
        //                     System.out.println(num+":"+i+"+"+j);
        //                 }
        //             }
        //         }
        //     }   
        // }


        // it uses the single loop
        for (int i = 2; i <= num/2; i++) {
            if(isPrime(i)){
                if (isPrime(num-i)) {
                    sum=i+(num-i);
                    if(sum==num){
                       System.out.println(num+":"+i+"+"+(num-i));
                       flag = true;
                    }
                }
            }
        }

        if (flag == false) {
            System.out.println(num+" cannot be expressed as sum of two prime numbers");
        }
        s.close();
    }
}
