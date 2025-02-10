import java.util.*;

class Result {
    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
        // Ensure the lists are sorted before merging
        Collections.sort(a);
        Collections.sort(b);

        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Merge the two sorted lists
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                mergedList.add(a.get(i++));
            } else {
                mergedList.add(b.get(j++));
            }
        }

        // Add remaining elements
        while (i < a.size()) {
            mergedList.add(a.get(i++));
        }
        while (j < b.size()) {
            mergedList.add(b.get(j++));
        }

        return mergedList;
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Size of first list
        if (n < 0) {
            System.out.println("Invalid input size.");
            return;
        }

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int m = scanner.nextInt(); // Size of second list
        if (m < 0) {
            System.out.println("Invalid input size.");
            return;
        }

        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }

        List<Integer> result = Result.mergeArrays(a, b);

        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
