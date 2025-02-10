public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <=8; i++) {
            for (int j = i; j <= 8; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= i; j++) {
                if (j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==i) {
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=7; j++) {
                System.out.print(" ");
            }
            for(int j=i;j<=6;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // System.out.println("        *");
    }
}
