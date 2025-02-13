import java.util.Arrays;

public class Main {

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partation(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static int partation(int arr[], int low, int high) {
        int piviot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] < piviot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }


    public static void mergesort(int arr[], int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int arr[], int low, int mid, int high){

        int l = mid-low+1;
        int r = high - mid;
        int larr[] = new int[l];
        int rarr[] = new int[r];

        for (int x = 0; x < l; x++) {
            larr[x] = arr[low+x];
        }

        for (int x = 0; x < r; x++) {
            rarr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = low;
        while(i<l && j<r){
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i<l){
            arr[k] = larr[i];
            i++;
            k++;
        }

        while(j<r){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    public static void main(String...Samrudh) {
        int arr[] = { 2, 5, 4, 1, 3 };

        // quicksort(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));
    
        mergesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
