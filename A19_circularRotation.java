import java.util.Arrays;;
public class A19_circularRotation {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};

        int r =3; // Number of rotation
        int j = 0;
        for (int i = 0; i < r; i++) {
            int temp = arr[0];
            for (j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
            System.out.println(Arrays.toString(arr));
        }

        
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
