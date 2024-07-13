public class A12_subsetOrNot {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5};
        int arr2[] = new int[]{4,8,2,5};
        if (isSubet(arr1, arr2)) {
            System.out.println("Array2 is Subset of Array1");
        } else {
            System.out.println("Array2 is not a Subset of Array1");
        }
    }

    private static boolean isSubet(int[] arr1, int[] arr2) {
        int count = 0;
        int i = 0;
        int j = 0;
        for ( i = 0; i < arr2.length; i++) {
            for ( j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    // count++; //count logic
                    break; //another logic
                } 
            }    

            if (j==arr1.length) {
                return false;
            }
        }
        // if (count == arr2.length) {
        //     return true;
        // }

        return true;

    }
}
