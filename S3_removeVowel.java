public class S3_removeVowel {

    public static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        if(ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') {
            return true;
        } else 
            return false;
    }

    public static String removeVowel(String str) {
        if(str.isEmpty()){
            return str;
        }

        // It takes character at index zero because we are taking the substring at index one of original string
        char ch = str.charAt(0);
        if(isVowel(ch)){
            return removeVowel(str.substring(1));
        } 
        return ch + removeVowel(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "Samrudh";

        System.out.println(removeVowel(str));
        // This adds consolents to new String
        // str = str.toUpperCase();
        // String str1 = "";
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if(ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') {
        //         continue;
        //     } else {
        //         str1 += ch;
        //     }
        // }
        // System.out.println(str1);

        // This is by using the String replaceAll() function
        // str = str.replaceAll("[aeiou]", "");
        // System.out.println(str);
    
        
    }

}

