public class P2 {
    public static void main(String[] args) {
        // Designing patter

        // ****
        //  ****
        //   ****
        //    ****

        int row = 4;
        int col = 4;
        for (int i = 0; i < row; i++) {
            int k=0;

            while(k<i){
                System.out.print(" ");
                k++;
            }
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
