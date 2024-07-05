public class S6_removeCharacter {
    public static void main (String args[]){
        String s = "sffad54 5a4*,./affa";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                s= s.substring(0, i) + s.substring(i+1);
                i--;
            }
        }

        // s = s.replaceAll("[^a-zA-Z]", "");

        System.out.println(s);
    }

}