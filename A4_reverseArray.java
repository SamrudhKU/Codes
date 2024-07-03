public class A4_reverseArray {

    private static void reverseing(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseing(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int start = 0, end = arr.length - 1;

        // Reverceing using the for loops
        // for (int i = 0; i < arr.length/2; i++) {
        // int temp = arr[i];
        // arr[i] = arr[arr.length-1-i];
        // arr[arr.length-1-i] = temp;
        // }

        // using while loop
        // while(start<end){
        // int temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;
        // start++;
        // end--;
        // }

        reverseing(arr, start, end);

        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }   
}
