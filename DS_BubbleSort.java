import java.util.Arrays;

// Time complexity is O(n^2)

// In Bubble sort we compearing the element no the next element if it's greater then we are swaping.
public class DS_BubbleSort {
    public static void main(String args[]){
        int arr[] = new int[]{3,2,4,6,5,7,9,8};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
}
