import java.util.Scanner;

public class p3_StackOperation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        final int max = 5;
        int arr[] = new int[max];
        int top = -1;
        while (true) {
            System.out.println("1>push 2>pop 3>peak 4>show 5>exit");
            switch (s.nextInt()) {
                case 1:
                    top = push(s, arr, top);
                    break;
                case 2:
                    top = pop(top, arr);
                    break;
                case 3:
                    peak(s, top, arr);
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
                    ;
            }
            
        }
    }

    private static void show(int top, int arr[]) {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    private static void peak(Scanner s, int top, int arr[]) {
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
        if (status==false) {
            System.out.println("Element is not found");
        } 
    }

    private static int pop(int top, int arr[]) {
        if (top<0) {
            System.out.println("Underflow");
        } else {
            top--;
        }
        return top;
    }

    private static int push(Scanner s, int arr[], int top) {
        if (top < arr.length-1) {
            System.out.println("Enter the value: ");
            int value = s.nextInt();
            top++;
            arr[top] = value;
        } else {
            System.out.println("Stack overflow");
        }
        return top;
    }
}
