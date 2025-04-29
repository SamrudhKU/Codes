public class pratice6 {

    public static int search(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        while (low<=high) {
            if (mid == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String...Samrudh){
        int arr[] = {1,2,3,4,5,6};
        System.out.println(search(arr, 2));

    }
}
