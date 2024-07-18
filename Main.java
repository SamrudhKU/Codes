public class Main {

    public static boolean patterCheck(char[] str, char[] pStr, int n, int m, boolean lookup[][]){
        if(n<0 && m<0){
            return true;
        }
        else if(m<0){
            return false;
        }
        else if(n<0 ) {
            for(int i = 0; i<=m; i++){
                if (pStr[i] != '*'){
                    return false;
                }
            }
            return true;
        }

        if(!lookup[n][m]){
            if (pStr[m] == '*') {
                lookup[n][m] = patterCheck(str, pStr, n-1, m, lookup) || patterCheck(str, pStr, n, m-1, lookup);
            }
            else {
                if (pStr[m] != '?' && pStr[m] != str[n]) {
                    lookup[n][m] = false;
                } else{
                    lookup[n][m] = patterCheck(str, pStr, n-1, m-1, lookup);
                }
            }
        }
        return lookup[n][m];
    }
    public static void main(String[] args) {
        String str1 = "b";
        String pStr1 = "?";
        System.out.println("String: "+str1);
        System.out.println("Pattern String: "+pStr1);
        char[] str = str1.toCharArray();
        char[] pStr = pStr1.toCharArray();
        boolean[][] lookup = new boolean[str.length+1][pStr.length+1];
        if(patterCheck(str,pStr,str.length-1, pStr.length-1,lookup)){
            System.out.println("Pattern Matching");
        } else{
            System.out.println("Pattern Not matching");
        }
    }
}