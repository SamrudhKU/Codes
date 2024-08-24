public class DS_MergeSort {

    public static void mergeSort(int arr[], int low, int high){
        if (low<high) {
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int larr[] = new int[n1];
        int rarr[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            larr[i] = arr[low+i];
        }
        for (int i = 0; i < n2; i++) {
            rarr[i] = arr[mid+1+ i];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while (i<n1 && j<n2) {
           if (larr[i]<rarr[j]) {
            arr[k] = larr[i];
            i++;
           } else {
            arr[k] = rarr[j];
            j++;
           }
           k++;
        }
        while(i<n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
    public static void main(String args[]){
        int arr[] = new int[]{3,4,2,1,5};

        mergeSort(arr, 0, arr.length-1);

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
