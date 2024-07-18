public class P9 {
    public static void main(String[] args) {
        int row  = 10;
        int k = 0;
        for (int i = 0; i <=row; i++) {
            if (i<row/2) {
                for (int j = row/2-i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }    
            }
             else {
                for (int j = 0; j < k ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < row-i; j++) {
                    System.out.print("*");
                }  
                k++;
                }
            System.out.println();
            
        }


    //      *
    //     ***
    //    *****
    //   *******
    //    *****
    //     ***
    //      *
    }
}
