public class EvenNumbersInLayers {

    // Function to count the number of even numbers in each layer of the square matrix
    public static void countEvenNumbersInLayers(int[][] matrix) {
        int n = matrix.length;
        int layers = (n + 1) / 2;
        for (int layer = 0; layer < layers; layer++) {
            int evenCount = 0;

            // Top row of the current layer
            for (int i = layer; i < n - layer; i++) {
                int cv = matrix[layer][i];
                if (cv % 2 == 0) evenCount++;
            }

            // Right column of the current layer
            for (int i = layer + 1; i < n - layer; i++) {
                int cv = matrix[i][n - layer - 1];
                if (cv % 2 == 0) evenCount++;
            }

            // Bottom row of the current layer
            for (int i = n - layer - 2; i >= layer; i--) {
                int cv = matrix[n - layer - 1][i] ;
                if (cv % 2 == 0) evenCount++;
            }

            // Left column of the current layer
            for (int i = n - layer - 2; i > layer; i--) {
                int cv = matrix[i][layer] ;
                if (cv % 2 == 0) evenCount++;
            }

            System.out.println("Layer " + layer + " has " + evenCount + " even numbers.");
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {2,  3,   4,  5},
            {6,  7,   8,  9},
            {10, 11, 12, 13},
            {14, 15, 16, 17}

            // {2,  3,  4,   5,  6,  7},
            // {8,  9,  10, 11, 12, 13},
            // {14, 15, 16, 17, 18, 19},
            // {20, 21, 22, 23, 24, 25},
            // {26, 27, 28, 29, 30, 31},
            // {32, 33, 34, 35, 36, 37}
        };

        System.out.println(matrix.length);
        countEvenNumbersInLayers(matrix);
    }
}
