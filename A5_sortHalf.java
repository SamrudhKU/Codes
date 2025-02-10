// This program is to print half a array in acceding ordre and half arrya in decending order
public class A5_sortHalf {

    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 1, 2, 3 };
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // It will sort the second half of the array in decending order
        // int n = (arr.length)/2;
        // for (int i = n; i<arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         if(arr[i]<arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }   
        //     }
        // }
        
        // Printing first half of the array
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i]+" ");
        }

        // Printing second half of the array in reveseing order
        for (int i = arr.length-1; i >= arr.length/2; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}



