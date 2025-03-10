public class C_GlassBeam3 {

    // Replace a character "a" with a the word "the"
    public static void main(String[] args) {
        String str = "Java is a programming language";
        str = str.toLowerCase();
        String rep = "a";
        String s[] = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(rep)) {
                s[i] = "the";
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
