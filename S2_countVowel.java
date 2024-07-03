public class S2_countVowel {
    public static int isVolwe(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') {
            return 1;
        } 
        return 0;
    }

    public static int countVowel(String str, int i){
        if (i == 1)
            return isVolwe(str.charAt(i-1));

        return countVowel(str, i-1) + isVolwe(str.charAt(i-1));
    }
    
    public static void main(String[] args) {
        String str = "aaaeiouasdfadsfasdfadsf";
        System.out.println(countVowel(str, str.length()));

    }
}
