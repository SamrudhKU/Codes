class Demo1 {

    // To chech the constructor, block and static block elecution
    Demo1() {
        System.out.println("Parent Class constructor");
    }

    static {
        System.out.println("Parent Static Block");
    }
    {
        System.out.println("Parent Normal Block");
    }
}

public class pratice3 extends Demo1 {

    pratice3() {
        System.out.println("Child Class constructor");
    }

    static {
        System.out.println("Child Static Block");
    }
    {
        System.out.println("Child Normal Block");
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max; // Update second largest
                max = num; // Update largest
            } else if (num > secondMax && num != max) {
                secondMax = num; // Update second largest if it's not duplicate of max
            }
        }
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax; // Handle if no second largest
    }

    public static void main(String[] args) {
        pratice3 p = new pratice3();

        int[] arr = { 12, 35, 1, 10, 35, 34, 1 };
        System.out.println("Second Largest: " + findSecondLargest(arr));

    }
}
