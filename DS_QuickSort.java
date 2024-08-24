import java.util.Arrays;

    
public class DS_QuickSort {

    // QuickSort time complixity
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partation(arr, low, high);
            // Hear we are calling two times because we are spliting the array into two parts.
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partation(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void main(String args[]) {
        int nums[] = new int[] { 1, 3, 6, 5, 4, 2 };

        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
