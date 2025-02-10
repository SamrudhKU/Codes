public class A7_frequencySorting {

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 1, 5, 1, 2, 36, 4, 88, 88, 36, 88, 88 };
        boolean[] visited = new boolean[arr.length];
        int newArr[] = new int[arr.length];
        int c[] = new int[newArr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            newArr[k] = arr[i];
            c[k] = count;
            k++;
            // System.out.println(arr[i] + " Occurs " + count + " times");
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if (c[i] < c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;

                    int temp1 = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp1;
                }
            }

        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) {
                break;
            }
            for (int j = 0; j < c[i]; j++) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
}
