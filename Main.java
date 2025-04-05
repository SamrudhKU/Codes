public class Main {
    public static void quictSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partation(arr, low, high);
            partation(arr, low, pi - 1);
            partation(arr, pi + 1, high);
        }
    }

    public static int partation(int arr[], int low, int high) {
        int i = low-1;
       
        int piviot = arr[high];
        for ( int j = low; j < high; j++) {
            if (arr[j] < piviot) {
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

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 3 };

        quictSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}