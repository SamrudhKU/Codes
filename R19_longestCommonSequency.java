public class R19_longestCommonSequency {
    
    // Radware codeing question: finding the longest common sequency
    public static int lcs(String str1, String str2, int s1, int s2){
        if(s1 == 0 || s2 == 0){
            return 0;
        }
        if (str1.charAt(s1-1) == str2.charAt(s2-1)) {
            return 1 + lcs(str1, str2, s1-1, s2-1);
        } else{
            return Math.max(lcs(str1, str2, s1-1, s2), lcs(str1, str2, s1, s2-1));
        }
    }
    
    public static void main(String...args){

        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        // Solution: ADH 
        // matched element is 3
        // ChartGPT
        int length = lcs(str1, str2, str1.length(), str2.length());
        System.out.println("Longest Common Sequence "+length);
    }
}
