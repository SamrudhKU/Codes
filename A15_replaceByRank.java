import java.util.Arrays;

public class A15_replaceByRank {

    public static void rankArray(int arr[]){
        // To copy to array we can use 
        int[] newArr = Arrays.copyOfRange(arr, 0, arr.length);

        // Sorting of Array
        Arrays.sort(newArr);
        
        // Ranking of Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == newArr[j]){
                    arr[i] = j+1;
                }
            }
        }
        

    }
    public static void main(String[] args) {
        int arr[] = new int[]{100, 2, 70, 40, 30};

        rankArray(arr);
        System.out.println(Arrays.toString(arr));
        
        // copying of array manually

        // int[] newArr = new int[arr.length];
        // for (int i = 0; i < newArr.length; i++) {
        //     newArr[i] = arr[i];
        // }

        // Sorting of array

        // for(int i = 0; i<arr.length;i++){
        //     for (int j = i; j < arr.length; j++) {
        //         if (arr[i]>=arr[j]) {
        //             int temp1 =arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp1;                }
        //     }
        // }


        // filling the rank array

        // int rank[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[j] == newArr[i]){
        //             rank[i] = j+1;
        //         }
        //     }
        // }

    }
}
