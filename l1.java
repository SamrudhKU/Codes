import java.util.ArrayList;
import java.util.Arrays;

public class l1 {

    public static void findZeros(int arr[][]){
        ArrayList<int[]> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    int temp[] = {i,j};
                    al.add(temp);
                }
            }
        }
        makeZeros(al, arr);
    }

    public static void makeZeros(ArrayList<int []> al, int arr[][]){
        for (int i = 0; i < al.size(); i++) {
            int c[] = al.get(i);
            int row = c[0];
            int col = c[i];
            for (int j = 0; j < arr.length; j++) {
                arr[row][j] = 0;
            }
            for(int j= 0; j<arr.length; j++){
                arr[j][col] = 0;
            }
        }
    }
    public static void main(String[] args) {

        int matrix[][] = new int[][] {
                { 0, 1, 1 ,1},
                { 1, 1, 1 ,1},
                { 1, 1, 1 ,0}
        };
        findZeros(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // int row = matrix.length, col = matrix[0].length;
        
        // int rowind[] = new int [2];
        // Arrays.fill(rowind, -1);
        // int colind[] = new int [2];
        // Arrays.fill(colind, -1);
        // int index = 0;
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         if  (matrix[i][j] == 0) {
        //             rowind[index] = i;
        //             colind[index] = j;
        //             index++;
        //         }
        //     }
        // }
        // for (int k = 0; k < colind.length; k++) {
        //     for (int i = 0; i < row; i++) {
        //         for (int j = 0; j < col; j++) {
        //             if (i==rowind[k] || j==colind[k] ) {
        //              matrix[i][j] = 0;
        //             } else{
        //              matrix[i][j] = matrix[i][j];
        //             }
        //         }
        //     }
        // }


        // System.out.println(Arrays.toString( matrix[0]));
        
    }
}
