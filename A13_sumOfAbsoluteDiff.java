import java.util.Arrays;

public class A13_sumOfAbsoluteDiff {
    public static int minimumDiff(int[] arr){
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += Math.abs(arr[i] - arr[j]);
            }
            result = Math.min(result, sum);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr1[] = new int[]{2,4,5,3};

        // This is minimum difference to all the elem
        System.out.println("The required minimum sum is "+minimumDiff(arr1));



        
        // This is the sum of minimum difference between the elements
        int arr[] = new int[]{3,8,2,6};
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i]-arr[i+1];
            sum+=diff;
        }
        sum = Math.abs(sum);
        System.out.println("The sum of minimum absolute differences is: " +sum);
    }
}
