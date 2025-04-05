// This program is gives the sum of subSets

public class R10_sumOfSubset {
    public static void findSum(int[] arr, int l, int r, int sum) {
        if (l>r) {
            System.out.print(sum+" ");
            return;
        }
        findSum(arr, l+1, r, sum+arr[l]);
        findSum(arr, l+1, r, sum);   
    }

    public static void findSum1(String[] arr, int l, int r, String sum) {
        if (l>r) {
            System.out.print(sum+" ");
            return;
        }
        findSum1(arr, l+1, r, sum+arr[l]);
        findSum1(arr, l+1, r, sum);   
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        String str[] = new String[]{"a","b","c"};
        findSum1(str, 0, str.length-1, "");
        // The subStrings are [123, 12, 13, 1, 23, 2, 3, 0] 
        // The subStrings are [1, 2, 3] the sum this gives [6 3 4 1 5 2 3 0 ]

        System.out.println();
        findSum(arr, 0,arr.length-1, 0);

    }
}
