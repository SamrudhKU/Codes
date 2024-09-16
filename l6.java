// Program to find the sum of subArray which is divisible by given number.

public class l6 {

    public static int subarraysDivByK1 (int[] nums, int k) {
        var mods  = new int[k];
        int m     = 0;
        int count = 0;
        mods[0] = 1;
        for (int num: nums) {
            m = Math.floorMod(m + num, k);
            count += mods[m];
            mods[m] += 1;
        }
        return count;
    }

    public static int subarraysDivByK(int[] nums, int k) {
        // Array to store the frequency of remainders
        int[] remainderList = new int[k];
        // Variable to store the cumulative sum
        int sum = 0;
        // Variable to count the number of subarrays divisible by k
        int count = 0;
        // Initialize remainderList[0] to 1 to handle subarrays directly divisible by k
        remainderList[0] = 1;
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Update the cumulative sum
            sum += nums[i];
            // Calculate the remainder of the cumulative sum divided by k
            int rem = sum % k;
            // If the remainder is negative, adjust it to be positive
            if (rem < 0) {
                rem += k;
            }
            // Add the frequency of the current remainder to the count
            count += remainderList[rem];
            // Increment the frequency of the current remainder in the remainderList
            remainderList[rem]++;
        }
        // Return the count of subarrays divisible by k
        return count;
    }    

    private static int subarraysDivByK2(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum%k==0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static void main(String args[]) {
        int arr[] = new int[] { 4, 5, 0, -2, -3, 1 };
        System.out.println(subarraysDivByK2(arr, 5));
    }

   
}
