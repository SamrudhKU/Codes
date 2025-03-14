public class L1_twoNumbers {
    // Example 1:
    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    // Example 2:
    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]

    // Example 3:
    // Input: nums = [3,3], target = 6
    // Output: [0,1]


       // -- Solution 1

    // public static int[] sum(int arr[], int target){
    //     int result[] = new int[arr.length];
    //     int sum = 0;
    //     if(arr.length == 2 && sum+arr[0]+arr[1] == target){
    //         result[0] = 0;
    //         result[1] = 1;
    //         return result;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         if (sum+arr[i]<=target) {
    //             sum+=arr[i];
    //             result[i] = i;
    //         } else if (sum == target) {
    //             return result;
    //         } else {
    //             int j = 0;
    //             while (j <= i) {
    //                 if (sum==target) {
    //                     return result;
    //                 }
    //                else if (sum-arr[j]+arr[i]<=target) {
    //                     sum-=arr[j];
    //                     sum+=arr[i];
    //                     result[j]=result[j+1];
    //                     result[i-1] = i;
    //                     j++;
    //                 }
    //             }
    //         }
    //     }
    //     return result;
    // }


        // -- Solution 2

    // public static int[] twoSum(int[] arr, int target) {
    //     int two[] = new int[2];
    //     if (arr.length == 2) {
    //         two[0] = 0;
    //         two[1] = 1;
    //         return two;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         int sum = arr[i];
    //         int j = i+1;
    //         while (j < arr.length) {
    //             sum += arr[j];
    //             if (sum == target) {
    //                 two[0] = i;
    //                 two[1] = j;
    //                 return two;
    //                 // break;
    //             }
    //             sum-=arr[j];
    //             j++;
    //         }
    //     }
    //     return two;
    // }


        // --Soultion 3
    public static int[] twoSum(int arr[], int target){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j]+arr[j-i] == target) {
                    return new int[]{j-i, j-i};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

        // int arr[] = {11,15,2,7,15,11};
        // int target = 9;

        // int arr[] = {3,2,4};
        // int target = 6;

         int arr[] = {3,6,3};
        int target = 6;
        
        // int arr[] = { 3, 3 };
        // int target = 6;

        for (int i :  twoSum(arr, target)) {
            if (i!=0) {
                System.out.print(i+" ");
            }
        }
       
       
        
    }
}
