import java.util.Arrays;
public class A21_moveZerosToEnd {

    private static void moveZeros(int[] arr) {
        int i = 0;
        for ( i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0 && arr[i+1] != 0) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            } else if(arr[i] == 0 && arr[i+1] == 0){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            } 
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeros1(int arr[]){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while(index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String...Samrudh){

        // 1,2,3,0,0,4
        int arr[] = {1,0,2,3,0,4};
        
        moveZeros(arr);

        moveZeros1(arr);
    }

}
