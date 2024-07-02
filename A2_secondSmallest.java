public class A2_secondSmallest {

    static int secSmallest(int arr[], int n)
   {
      // assigning first element as smallest temporarily
      int smallest = arr[0];

      // we find the smallest element here
      for (int i=0; i < n; i++){
         if(arr[i] < smallest)
            smallest = arr[i];
      }

     // temporarily assinging largest max value
     int sec_smallest = Integer.MAX_VALUE;
     
     // finding second smallest here
     for (int i=0; i < n; i++){
         if(arr[i] != smallest && arr[i] < sec_smallest)
           sec_smallest = arr[i];
     }

    return sec_smallest;

  }
    public static void main(String[] args) {

        // This method uses the 2 for loop first to find first small element and second to find the next smallest except the fistSmallest
        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.print(secSmallest(arr, n)); 
     


        // This method is by sorting the array and then finding the element by index
        // int arr[] = new int[] {
        //         12, 34, 54, 53, 23, 23
        // };
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         if (arr[i] > arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        // System.out.println("Second Smallest: "+arr[1]);
        // System.out.println("Second Largest: "+arr[arr.length-1-1]);
    }
}
