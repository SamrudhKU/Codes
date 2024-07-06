

public class R10_sumOfSubset {
    public static void findSum(int[] arr, int l, int r, int sum) {
        if (l>r) {
            System.out.print(sum+" ");
            return;
        }
        findSum(arr, l+1, r, sum+arr[l]);
        findSum(arr, l+1, r, sum);
        
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
       
        findSum(arr, 0,arr.length-1, 0);
    }
}
