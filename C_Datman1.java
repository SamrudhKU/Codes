import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C_Datman1 {
    public static void main(String[] args) {
        String str1[] = { "a", "a", "a", "ab" };
        String str2[] = { "a", "a", "ab", "aab" };

        System.out.println(removeDuplicate1(str1, str2));;

        String s1[] = removeDuplicate(str1);
        String s2[] = removeDuplicate(str2);

        for (int i = 0; i < Math.max(s1.length, s2.length); i++) {
            if (s1!=null || s2!=null && s1[i].equals(s2[i])) {
                if(s1[i]!=null)
                System.out.print(s1[i]);
            }
        }       
    }

    public static List<String> removeDuplicate1(String[] str1, String str2[]){
        Set<String> s1 = new HashSet<>(Arrays.asList(str1));
        Set<String> s2 = new HashSet<>(Arrays.asList(str2));

        s1.retainAll(s2);

        return new ArrayList<String>(s1);
    }

    private static String[] removeDuplicate(String[] str) {
        String newString[] = new String[str.length];
        boolean status[] = new boolean[str.length];
        
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < status.length; j++) {
                if (i!=j && str[i].equals(str[j]) &&  (status[i] != true || status[j] != true)) {
                    status[i] = true;
                    status[j] = true;
                }
            }
        }

        for (int i = 0; i < status.length; i++) {
            if (status[i]==false) {
                newString[i] = str[i];
            }
        }

        return newString;
    }
}
