// The (n) number  students are looking to find (r) seats in a classroom. 
// This will be solve using the permutation n!/(n-r)!

import java.util.Scanner;
public class PermutationOfSeats {

    // Hear we using a method overloading for the factorial function
    // with the same name but with the different parameters
    public static int factorail(int num) {
        int fact = 1;
        while (num>0) {
            fact*=num;
            num--;
        }
        return fact;
    }

    public static int factorail(int num, int seat){
        int fact = 1, Nnum = num - seat;
        while (Nnum>0) {
            fact*=num;
            Nnum--;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = s.nextInt();

        int seats = factorail(n)/factorail(n-y);
        System.out.println(seats);

        s.close();
    }
}
