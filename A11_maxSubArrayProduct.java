// This program is to get the maximum product of the subArray
public class A11_maxSubArrayProduct {

    private static int maxProduct(int arr[]){
        int max = 1;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                max *= arr[j];
                result = Math.max(result, max);
            }
            result = Math.max(result, max);
            
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, -30, 0, 24, 12};
        System.out.println(maxProduct(arr));
    }
}
