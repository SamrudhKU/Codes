public class pratice6 {

    public static String stringReduction(String str) {
        while (true) {

            StringBuilder reduced = new StringBuilder();
            boolean reductionStatus = false;
            for (int i = 0; i < str.length(); i++) {
                if (i < str.length() - 1 && str.charAt(i) != str.charAt(i + 1)) {
                    reduced.append(reduction(str.charAt(i), str.charAt(i + 1)));
                    reductionStatus = true;
                    i++;
                } else {
                    reduced.append(str.charAt(i));
                }

            }
            if (!reductionStatus) {
                break;
            }
            str = reduced.toString();
        }

        return str;
    }

    private static char reduction(char c1, char c2) {
        if ((c1 == 'A' && c2 == 'B' ) || (c1 == 'B' && c2 == 'A')) {
            return 'C';
        } else if ((c1 == 'B' && c2 == 'C') || (c1 == 'C' && c2 == 'B')) {
            return 'A';
        } else {
            return 'B';
        }
    }

    public static void main(String[] args) {

        System.out.println(stringReduction("ABCABC").toUpperCase());

    }
}
