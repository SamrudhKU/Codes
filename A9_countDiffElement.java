// It shows the count of  differnt element and the reapting element
import java.util.Arrays;

public class A9_countDiffElement {
    public static void main(String args[]){
        int arr[] = new int[]{1,16,7,8,8,2,4,4,1,54,3,3,2};
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false); 
        int count = 0;
        System.out.println("The repating elements are:");
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]==true){
                continue;
            }
            
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    System.out.print(arr[i]+" ");
                }
            }
            count++;
        }
        System.out.println();
        System.out.println("The count of different element is: "+count);       
    }
}
