public class P12 {
    public static void main(String[] args) {
        int k = 10;
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
