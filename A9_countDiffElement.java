// It shows the count of  differnt element and the reapting element
import java.util.Arrays;

public class A9_countDiffElement {

   
    public static void main(String args[]){
        int arr[] = new int[]{1,16,7,8,8,2,4,4,1,54,3,3,2};
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false); 
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]==true){
                continue;
            }
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;

                    // arr[i] = 0;
                } 
              
            }
            System.out.println(arr[i]);

            
    

            // To get the non reapted element
    
            // if (arr[i]!=0) {
            //     System.out.println(arr);
            // }

        }
    }
}
