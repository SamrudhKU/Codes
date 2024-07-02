public class A1_largestNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{
            12, 34, 54, 53, 23, 23
        };

        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]> max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
