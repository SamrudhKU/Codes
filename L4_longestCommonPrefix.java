public class L4_longestCommonPrefix {

    public static String longestCommonPrefix(String[] s) {
        String prefix = "";

        char str[] = null;
        int i = 0;
        if (s.length == 1) {
            return String.join("", s);
        }

        if (s.length > 1) {
            int min = Math.min(s[i].length(), s[i + 1].length());
            for (int j = 0; j < min; j++) {
                if (s[i].charAt(j) == s[i + 1].charAt(j)) {
                    prefix += s[i].charAt(j);
                } else {
                    break;
                }
            }

            str = prefix.toCharArray();
            if (s.length > 2) {
                for (int k = 2; k < s.length; k++) {
                    if (s[k] == "") {
                        return "";
                    }
                    int newMin = Math.min(str.length, s[k].length());
                    for (int j = 0; j < newMin; j++) {
                        if (str[j] != s[k].charAt(j)) {
                            str[j] = ' ';
                        }
                    }
                }
            }

        }
        return new String(str).trim();

    }


    public static String longestCommonPrefix1(String[] str) {
        String prefix = str[0];
        if(str.length == 1 || str[0] == "")  return "";
        if (str.length == 1) return str[0];
        for (int i = 1; i < str.length; i++) {
            String current = str[i];
            while (!current.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (current == "") return "";
            }
        }
        return prefix;
    }
    
    public static void main(String[] args) {
        // String s[] = {"flower", "flow", "flight"};
        // String s[] = {"flower"};
        String s[] = { "aabab", "aba", "ab" };

        System.out.println(longestCommonPrefix1(s));


    }
}
