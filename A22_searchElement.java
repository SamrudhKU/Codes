public class A22_searchElement {

    private static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int arr[], int target) {
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String... Samrudh) {

/*
    1. Time Complexity (Execution Steps)
        👉 Count how the number of operations grows with input size n.
        Constant work (no loop): O(1)
        Single loop (n times): O(n)
        Nested loop (n × n): O(n²)
        Divide and conquer (split in half each time, like Binary Search): O(log n)
        Loop with division/multiplication (like doubling index in Exponential Search): O(log n)
    ✔ Focus on the highest growth term (ignore constants & small terms).

    
    2. Space Complexity (Memory Usage)
        👉 Count the extra memory used apart from input.
        No extra storage (in-place): O(1)
        Uses extra array proportional to input size: O(n)
        Recursive calls stack: O(log n) or O(n) depending on depth.
    ✔ Look at variables, data structures, recursion stack.


    > Time → count loops / splits
    > Space → count extra storage / recursion
*/


        // 🔹 Linear Search
        // > Best Case (target at first element): O(1)
        // > Worst Case (target at last/not present): O(n)
        // > Average Case: O(n/2) ≈ O(n)
        // > Space Complexity: O(1) → no extra space used
        int arr[] = { 1, 3, 2, 5, 4 };
        int index = linearSearch(arr, 22);
        System.out.println(index == -1 ? "Element Not found" : "Element at index " + index);

        // 🔹 Binary Search (works only on sorted arrays)
        // > Best Case (target at mid): O(1)
        // > Worst Case: O(log n)
        // > Average Case: O(log n)
        // > Space Complexity:
            // > Iterative version → O(1)
            // > Recursive version → O(log n) (because of recursion stack)
        int arr1[] = { 1, 2, 3};
        int index1 = binarySearch(arr1,21);
        System.out.println(index1 == -1 ? "Element Not found" : "Element at index " + index1);


    }
}
