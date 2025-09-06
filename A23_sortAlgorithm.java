import java.util.Arrays;
public class A23_sortAlgorithm {

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]){
        
    }
    public static void main(String... Samrudh) {

        int arr[] = { 1, 4, 3, 5, 2 };
        bubbleSort(arr);
    }
}

