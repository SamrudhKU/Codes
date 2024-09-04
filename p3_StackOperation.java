import java.util.Scanner;

public class p3_StackOperation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int max = 2;
        int arr[] = new int[max];
        int top = -1;
        while (true) {
            System.out.println("1>push 2>pop 3>isPresent 4>show 5>exit");
            switch (s.nextInt()) {
                case 1:
                    arr = push(s, arr, top);
                    top++;
                    break;
                case 2:
                    top = pop(top, arr);
                    break;
                case 3:
                    isPresent(s, top, arr);
                    break;
                case 4:
                    show(top, arr);
                    break;
                case 5:
                    System.exit(0);
                    ;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }

        }
    }

    private static void show(int top, int arr[]) {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    private static void isPresent(Scanner s, int top, int arr[]) {
        System.out.println("Enter the search Element ");
        int value = s.nextInt();
        boolean status = false;
        for (int i = top; i >= 0; i--) {
            if (arr[i] == value) {
                System.out.println("Element is present");
                status = true;
                break;
            } else {
                status = false;
            }
        }
        if (status == false) {
            System.out.println("Element is not found");
        }
    }

    private static int pop(int top, int arr[]) {
        if (top < 0) {
            System.out.println("Underflow");
        } else {
            arr[top] = 0;
            top--;
            if (top>0) {
                arr = shirnk(arr, top);
            }

        }
        return top;
    }

    private static int[] shirnk(int arr[], int top) {
        if (top <= (arr.length / 2) / 2) {
            int capacity = top;
            int[] newStatck = new int[capacity];
            System.arraycopy(arr, 0, newStatck, 0, capacity);
            return newStatck;
        }
        return arr;
    }

    private static int[] push(Scanner s, int arr[], int top) {
        if (top >= arr.length - 1) {
            arr = expand(arr);
        }
        System.out.println("Enter the value: ");
        int value = s.nextInt();
        top++;
        arr[top] = value;
        return arr;
    }

    public static int[] expand(int arr[]) {
        int capacity = arr.length;
        int dynamicStack[] = new int[capacity * 2];
        System.arraycopy(arr, 0, dynamicStack, 0, capacity);
        return dynamicStack;
    }
}
