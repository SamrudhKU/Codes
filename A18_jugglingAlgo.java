import java.util.Arrays;

public class A18_jugglingAlgo {

    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hcf(b, a % b);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int noOfRotation = 3;
        int n = arr.length;
        for (int i = 0; i < hcf(noOfRotation, n); i++) {
            int l=i,m,temp = arr[i];
            while(true){
                m=l+noOfRotation;
                if (m>=arr.length) {
                    m = m-arr.length;
                }
                if (m == i) {
                    break;
                }
                arr[l] = arr[m];
                l=m;
            }
            arr[l] = temp;
            System.out.println(Arrays.toString(arr));
        }

        // Hear swift will work 
        // start: [1, 2, 3, 4, 5, 6, 7, 8, 9]
        // 1> [4, 2, 3, 7, 5, 6, 1, 8, 9]
        // 2> [4, 5, 3, 7, 8, 6, 1, 2, 9] 
        // end 3> [4, 5, 6, 7, 8, 9, 1, 2, 3]

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
