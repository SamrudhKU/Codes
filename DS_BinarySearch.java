public class DS_BinarySearch {

    // Time complexity O(log n) 
    public static void main(String args[]) {

        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
        int target = 2;

        // int result = binarySearch(arr, target);
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element is found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }


    // This is a recursive method
    private static int binarySearch(int[] arr, int target, int start, int end) {
        if (start>end) {
            return -1;
        }
        int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
               return binarySearch(arr, target, mid+1, end);
            } else {
               return binarySearch(arr, target, start, mid-1);
            }
  
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}