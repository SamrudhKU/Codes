import java.util.Arrays;

public class DS_SelectionSort {

    // Selection sorting Algorithm: This is done by taking the maximum or minimum by inner loop and swap it in outer loop with the last or fist element
    public static void main(String args[]) {
        // int arr[] = new int[]{ 6,5,2,8,3,7,9};
        int arr[] = new int[]{ 2,3,4,1,5};
      

        // Sorting by maximum value
        int temp = 0;
        int max = 0;
        int i, j;
        for ( i = 0; i < arr.length-1; i++) {
            for ( j = 0; j < arr.length-1-i; j++) {
                if (arr[max] < arr[j] ) {
                    max = j;
                }
            }
                temp = arr[max];
                arr[max] = arr[j-1];
                arr[j-1] = temp;  
                System.out.println(Arrays.toString(arr));
        }


        // Sorting by minimum value
        // int minIndex = 0;
        // for (int i = 0; i < arr.length-1; i++) {
        //     minIndex = i;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[minIndex] > arr[j]) {
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[minIndex];
        //     arr[minIndex] = arr[i];
        //     arr[i] = temp;
        // }

        System.out.println(Arrays.toString(arr));
    }
}
