import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class l7 {

    public static List<Integer> findDuplicates(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length;) {
            if (array[i] != i + 1 && array[i] != array[array[i] - 1]) {
                Swap(array, i, array[i]);
            } else
                i++;
        }
        for (int i = 0; i < array.length; i++) {
            if (i + 1 != array[i]) {
                list.add(array[i]);
            }
        }
        return list;
    }

    static void Swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b - 1];
        array[b - 1] = temp;
    }


    public static void main(String args[]) {


        // int nums[] = new int[]{4,3,2,7,8,2,3,1};
        int nums[] = new int[]{1,2,2,3};
        System.out.println(findDuplicates(nums));

        // Integer nums[] = new Integer[]{4,3,2,7,8,2,3,1};
        // int arr[] = new int[]{1,1,2};

        // boolean visited[] = new boolean[nums.length];
        // List<Integer> list = new ArrayList<>();
        // HashSet<Integer> elements = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (!elements.add(nums[i])) {
        // list.add(nums[i]);
        // }
        // }
        // System.out.println(elements);
        // System.out.println(list);

        // for (int i = 0; i < nums.length; i++) {
        // if (visited[i]==false) {
        // for (int j = i+1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // visited[j] = true;
        // list.add(nums[i]);
        // }
        // }
        // }
        // }

    }
}
