public class A6_frequencyOfElement {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 5, 1, 2, 36, 4, 88, 36, 88, 88 };
        boolean[] visited = new boolean[arr.length];
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
            System.out.println(arr[i] +" Occurs " + count + " times");
        }

        
       

    }
}
