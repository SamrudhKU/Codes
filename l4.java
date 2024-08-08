// Program is to check the sum of two numbers is target and returning it.

import java.util.Arrays;

public class l4 {

    public static int[] twoSum(int[] arr, int target) {   
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j-i]+arr[j] == target) {
                    // System.out.println(arr[j-i]+arr[i]);
                    return new int[]{j-i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]) {
        // int arr[] = {1,2,3,4};
        // int arr[] = { 3, 3 };
        int arr[] = {3,2,4};
        // int arr[] = {2,4, 11, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));        
    }
}
