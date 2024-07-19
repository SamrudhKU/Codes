// This program helps to sum the sum of equlibrium index of the array
public class A16_equilibriumIndex {
    public static void main(String[] args) {
        // int arr[] = { 1,2,3,4,5,1,3,2,4 };
        int arr[] = { 1,2,12,6,5,1,3,2,4 };

        int arr_size = arr.length;
        System.out.print("Equilibrium Index : ");
        System.out.println(equilibrium_index(arr, arr_size));
    }

    private static int equilibrium_index(int[] arr, int arr_size) {
        int sum  = 0;
        int leftsum = 0;
        for (int i = 0; i < arr_size; i++) {
            sum+= arr[i];
        }
        for (int i = 0; i < arr_size; i++) {
            sum-=arr[i];
            if (sum == leftsum) {
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}
