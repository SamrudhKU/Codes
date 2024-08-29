import java.util.Scanner;

public class p1_ArrayOperation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[20];
        int size = 0;
        while (true) {
            System.out.println("1> create array 2> display array 3> insert array 4> delete array 5> exit");
            int choice = s.nextInt();
            switch (choice) {

                case 1:
                    size = createArray(s, arr);
                    break;
                case 2:
                    displayArray(arr, size);
                    break;
                case 3:
                    size = insertArray(s, arr, size);
                    break;
                case 4:
                    size = deleteElement(s, arr, size);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private static int deleteElement(Scanner s, int arr[], int size) {
        System.out.println("Enter the position to delete: ");
        int pos = s.nextInt();
        if (pos<0 || pos>size-1) {
            System.out.println("Invalid postion");
        } else {
            for (int i = pos; i < size; i++) {   
                arr[i] = arr[i+1];
            }
            return size-1;
        }
        return size;
    }

    private static int insertArray(Scanner s, int[] arr, int size) {
        System.out.println("Enter the position: ");
        int pos = s.nextInt();
       
        if (pos<0 || pos>size-1) {
            System.out.println("Invalid postion");
        } else {
            System.out.println("Enter the Element: ");
            int element = s.nextInt();
            for (int i = size; i >= pos; i--) {
                arr[i] = arr[i-1];
            }
            arr[pos] = element;
            return size+1;
        }

        return size;
    }

    private static int createArray(Scanner s, int arr[]) {
        System.out.println("Enter the size of the Array");
        int size = s.nextInt();
        // arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return size;
    }

    private static void displayArray(int[] arr, int size) {
        System.out.println("Elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
