public class DSA_BinarySearch{
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6};
        int start = 0, end = arr.length-1;
        int target = 55;
        int mid = 0; 
        while (start<=end) {
            mid = (start + end) /2;
            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                break;
            } else if (target>arr[mid]){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
    }
}