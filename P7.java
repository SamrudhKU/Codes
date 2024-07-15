public class P7 {
    public static void main(String[] args) {
        int row = 10;
        int k = 1;
        for (int i = 0; i < row; i++) {
            if(i>=row/2){
                for (int j = row-i ; j > 0; j--) {
                    System.out.print("*");
                }
                k = k+2;
                
            } else {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    
    //        *
    //        **
    //        ***
    //        ****
    //        ***
    //        **
    //        *
    }
}
