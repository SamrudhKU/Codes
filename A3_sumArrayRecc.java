// This is the array of sum using the Recursion

public class A3_sumArrayRecc {

    // public static int sumOfArray(int arr[], int i, int sum) {
    //     if (arr.length==1) {
    //         return arr[0];
    //     }
    //     sum+= arr[i];
    //     if (i==arr.length-1) {
    //        return sum;
    //     }
    //     return sumOfArray(arr, i+1, sum);
    // }

    public static int sumOfArray(int arr[], int i) {
        if(i==arr.length-1){            
            return arr[i];
        }
        return arr[i] + sumOfArray(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {12,32,43,12,34,23,24};
        int i = 0, sum=0;
        // System.out.println(sumOfArray(arr, i, sum));

        System.out.println(sumOfArray(arr, i));
    }
}
