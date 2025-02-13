import java.util.Arrays;

public class practice1 {

    public static int maxElement(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] bubbleSorting(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }  
        return arr;
    }

    public static int[] reverseSorting(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }  
        return arr;
    }

    public static int secondMaxElement(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        int secondMax = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){    
            if (arr[i]<max && arr[i]!=secondMax) 
               secondMax = arr[i];
        }
        return secondMax;
    }

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if(arr[mid] < target){
                start = mid+1;
            } else {
                end-=1;
            }
        }
        return -1;
    }

    public static int[] selectionSort(int arr[]){
        int minIndex = 0; 
        int temp = 0;
        for(int i =0; i<arr.length;i++){
         minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]) {
                 minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static int[] quickSort(int arr[], int low, int high){
        if(low<high){
            int pi = partation(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        return arr;
    }

    public static int partation(int arr[], int low, int high){
        int i = low-1;
        int piviot = arr[high];
        for (int j = low; j < high; j++) {
            if(arr[j]<piviot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static int[] mergeSort(int arr[], int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }

    public static void merge(int arr[], int l, int m, int r){
        int l1 = m-l+1;
        int r1 = r-m;
        int larr[] = new int[l1];
        int rarr[] = new int[r1];
        for(int i=0; i<l1; i++){
            larr[i] = arr[l+i];
        }
        for(int i=0; i<r1; i++){
            rarr[i] = arr[m+1+i];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while(i<l1 && j<r1){
            if(larr[i] <= rarr[j]){
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i<l1){
            arr[k] = larr[i];
            i++;
            k++;
        }

        while(j<r1){
            arr[k] = rarr[j];
            j++;
            k++;
        }
        

    }
    public static void main(String...Samrudh){
        int arr[] = {1,3,4,5,2};

        // To print the maxElement in the array
        System.out.println(maxElement(arr)+" max element");

        // Bubble Sorting of array
        System.out.println("Bubble sorting "+Arrays.toString(bubbleSorting(arr)));

        // Finding second largest element
        System.out.println("Second larget element "+secondMaxElement(arr));

        // reverseSorting
        System.out.println("Reverse Bubble sorting "+Arrays.toString(reverseSorting(arr)));

        // Binary search algorithm O(log n)
        int arr1[] = {1,2,3,4,5};
        System.err.println("Binary search "+binarySearch(arr1, 4)+ " is present");
       
        // Selection sorting
        System.out.println("Selection sorting "+Arrays.toString(selectionSort(arr)));

        // Quick sort
        int arr2[] = { 2, 5, 4, 1, 3 };

        System.err.println("Quick sort " +Arrays.toString(quickSort(arr2, 0, arr2.length-1)));

        // Merge sort
        System.err.println("Merge sort "+Arrays.toString(mergeSort(arr, 0, arr.length-1)));

    }
}
