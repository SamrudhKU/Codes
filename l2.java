import java.util.Arrays;

// This program is to move the zero's in arrays to the last
public class l2 {

    public static void replaceZeros(int arr[]){
        
    }
    public static void main(String args[]){
        // int arr[] = new int[]{0,1,0,3,12};
        int arr[] = new int[]{0,0,1};

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index<arr.length) {
            arr[index] = 0;
            index++;
        }
        
        System.out.println(Arrays.toString(arr));


        
    }
}
