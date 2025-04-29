public class S16_findOccurance {

    private static void m1(String str) {
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println((char) i + ":" + count[i]);
            }
        }
    }

    static public void m2(String str) {
        boolean b[] = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (b[i] == true) {
                continue;
            }
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    b[j] = true;
                    count++;
                }
            }
            System.out.println(str.charAt(i) + ":" + count);

        }
    }

    public static void main(String... Samrudh) {
        String str = "asasdfewfs";
        m1(str);
        System.out.println();
        m2(str);
    }
}
