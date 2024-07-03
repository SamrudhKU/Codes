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

    private static int lElement(int[] arr, int j) {
        if(j == 1)
            return arr[0];
        
        return Math.min(arr[j-1], lElement(arr, j-1));
    }

    public static void main(String[] args) {
        int arr[] = new int[]{
            12, 34, 54, 53, 23, 23
        };
        int i = 0, max = 0;

        System.out.println("Largest Element "+largeElement(arr, i, max));

        int j = arr.length;
        System.out.println("Smallest Element "+lElement(arr, j));
    }

   
}
