import java.util.Scanner;
public class C_GlassBeam1 {
    
    // Program to find the sum of combination in an array
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {1,3,2,5,4,7,6};

        System.out.println("Enter the number: ");
        int num = s.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i] + arr[j];
                if (temp == num) {
                    System.out.print("{"+arr[i]+", "+arr[j]+"}"+" ");
                }
            }
        }
        s.close();
    }    
}
