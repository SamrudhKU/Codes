import java.util.Arrays;

public class DS_InsertionSort {

    // Time complexity of O(n^2) in the worst case and O(n) in the best case.
    public static void main(String args[]){
        // int arr[] = new int[]{9,5,8,4,1};
        int arr[] = {3,6,4,1,5};
        
        // int temp = 0;
        // for (int i = 1; i < arr.length; i++) {
        //     int key = arr[i];
        //     int j = i;
        //     temp = i;
        //     while (j>=0) {
        //         if (key<arr[j]) {
        //             arr[temp] = arr[j];
        //             temp--;
        //         }
        //             j--;
        //     }
        //     arr[temp] = key;
        // }


        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (  j>=0 && key<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

}
