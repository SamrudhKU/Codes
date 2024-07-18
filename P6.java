public class P6 {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if(i==0 || i==1 || i==row-1){
                    System.out.print(" *");
                } else if (j==0 || j==i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    //     Program output:
    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    // * * * * * *
    }
}
