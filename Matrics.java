public class Matrics {

    private static void findEven(int matrix[][]){
        int n = matrix.length;
        int layers =  (n+1)/2;
        // for top side
        for (int layer = 0; layer < layers; layer++) {
            int count=0;
            
        

        for (int i = layer; i < n-layer; i++) {
            if(matrix[layer][i]%2==0 ){
                count++;   
            }
        }

      

        // for right side
        for (int i = layer+1; i < n-layer; i++) {
            if(matrix[i][n-layer-1]%2==0 ){
                count++;
            }
        }
        // for bottom
        for (int i = n-layer-2; i < n-layer; i++) {
            if(matrix[n-layer-1][i]%2==0 ){
                count++;
            }
        }

          // for left side
          for (int i = n-layer-2; i > layer; i--) {
            if(matrix[i][layer]%2==0 ){
                count++;
            }
        }

        System.out.println("layer:"+layer+"count:"+count);
        
    }
        
    }
    public static void main(String[] args) {
        int matrix[][] = {
            // {0,1,2},
            // {3,4,5},
            // {6,7,8}

            // {2,  3,   4,  5},
            // {6,  7,   8,  9},
            // {10, 11, 12, 13},
            // {14, 15, 16, 17}

            {2,  3,  4,   5,  6,  7},
            {8,  9,  10, 11, 12, 13},
            {14, 15, 16, 17, 18, 19},
            {20, 21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30, 31},
            {32, 33, 34, 35, 36, 37}

        };

        findEven(matrix);
    
    }
}
