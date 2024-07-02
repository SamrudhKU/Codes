// Java program to check a qudrant of a coordinate a line

import java.util.Scanner;

public class Qudrant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int xaxis = s.nextInt();
        int yaxis = s.nextInt();
        if (xaxis>0 && yaxis>0) {
            System.out.println("First Qudrant");
        } else if (xaxis<0 && yaxis>0) {
            System.out.println("Second Qudrant");
        }
         else if (xaxis>0 && yaxis<0){
            System.out.println("Third Qudrant");
        } else {
            System.out.println("Fourth Qudrant");
        }
        s.close();
    }
}
