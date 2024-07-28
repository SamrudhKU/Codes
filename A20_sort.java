public class A20_sort {

    public static void arrange(int arr[]){
        int i = 0, j =0,k= arr.length-1;
        while (i<=k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, k);
                k--;
            }

            
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,0,1,0,2,2,1};

        arrange(arr);

        for (int j : arr) {
            System.out.print(j+" ");
        }


        // int countZero = 0;
        // int countOne =0;
        // int countTwo =0;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) 
        //         countZero++;
        //     else if (arr[i] == 1)
        //         countOne++;
        //     else 
        //         countTwo++;
        // }
        // int nArr[] = new int[arr.length];
        // int i =0;
        // for (; i < countZero; i++) {
        //     nArr[i] = 0;
        // }
        // for (; i < countOne+countZero; i++) {
        //     nArr[i] = 1;
        // }
        // for (; i < countZero+countOne+countTwo; i++) {
        //     nArr[i] = 2;
        // }
        // for (int j : nArr) {
        //     System.out.print(j+" ");
        // }
    }
}