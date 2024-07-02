public class R3_largestElement {
    public static int largeElement(int arr[], int i, int max){
        
        if (arr.length==1) {
            return arr[arr.length-1];
        }
        if (arr[i]>max) {
            max = arr[i];
        }
        if(i==arr.length-1){
            return max;
        }
        return largeElement(arr, i+1, max);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{
            12, 34, 54, 53, 23, 23
        };
        int i = 0, max = 0;
        System.out.println(largeElement(arr, i, max));
    }
}
