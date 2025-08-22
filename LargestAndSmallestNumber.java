public class LargestAndSmallestNumber {
    
    public static int findLargest(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondLargest(int arr[]){
        int max = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int thirdLargest(int arr[]){
        int max = arr[0], secondMax = 0, thirdMax = 0;
        for(int i = 1; i < arr.length; i++){
            if (max<arr[i]) {
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max){
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] != secondMax && arr[i] > thirdMax){
                thirdMax = arr[i];
            }
        }
        return thirdMax;
    }

    public static int findSmallest(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }   
    
    public static int secondSmallest(int arr[]){
        int min = arr[0], secondMin = 999;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] != min && arr[i] < secondMin ) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    public static int thirdSmallest(int arr[]){
        int min = arr[0], secondMin = 999, thirdMin = 999;
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]) {
                thirdMin = secondMin;
                secondMin = min;
                min = arr[i];
            } else if (arr[i]!=min && arr[i] < secondMin) {
                thirdMin = secondMin;
                secondMin = arr[i]; 
            } else if (arr[i] != secondMin && arr[i] < thirdMin) {
                thirdMin = arr[i];
            }
        }
        return thirdMin;
    }
    public static void main(String... Samrudh) {

        int arr[] = {11,1,2,3,54,-5};

        System.out.println("Largest Number:  "+findLargest(arr));
        System.out.println("Second Largest Number:  "+secondLargest(arr));
        System.out.println("Third Largest Number:  "+thirdLargest(arr));

        System.out.println("Smallest Number:  "+findSmallest(arr));
        System.out.println("Second Smallest Number:  "+secondSmallest(arr));
        System.out.println("Third Smallest Number:  "+thirdSmallest(arr));
    }
}