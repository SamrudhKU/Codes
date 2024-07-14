// This program is to print the Pascal's triangle
public class R11_pascalTriangel {
    // public static int[] pTriangle(int i, int[] arr){
    // if (i==arr.length) {
    // return arr;
    // }
    // arr[i] = sum(arr[i-1]);
    // return pTriangle(i+1, arr);
    // }

    // public static int sum(int value){
    // int sum=1;
    // int j = 10;
    // while (value>1) {
    // int k = value%10;
    // value/= 10;
    // int l = value%10;
    // sum += (k+l)*j;
    // j*=10;
    // }
    // sum+=1*j;
    // return sum;
    // }

    private static void printSequence(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(sequence(i, k)+" ");
            }
            System.out.println();
        }
    }

    private static int sequence(int i, int k) {
        if (k == 0 || k == i) {
            return 1;
        }
        return sequence(i - 1, k - 1) + sequence(i - 1, k);
    }

    public static void main(String[] args) {
        // pTriangle(n,0, arr);

        int n = 5;
        printSequence(n);

        // Requeries for normal method
        // int arr[] = new int[n];
        // arr[0] = 1;
        // arr[1] = 11;

        // Normal recurssive method with sum method
        // pTriangle(2, arr);

        // Normal Method
        // for (int i = 2; i < arr.length; i++) {
        // arr[i] = sum(arr[i-1]);
        // }

        // Requeries for normal method
        // for (int i : arr) {
        // System.out.println(i);
        // }
    }
}
