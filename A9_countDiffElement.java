import java.util.Arrays;

public class A9_countDiffElement {
    public static void main(String args[]){
        int arr[] = new int[]{1,1,3,3,2};
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false); 
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]==true){
                continue;
            }
            
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                }
            }
            count++;
        }
        System.out.println(count);       
    }
}
