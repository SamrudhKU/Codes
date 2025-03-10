import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class pratice5 {
    public static void main(String[] args) {


        String s1 = "G oD".replaceAll("\\s","").toLowerCase();
        String s2 = "dO G".replaceAll("\\s", "").toLowerCase();

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        
        System.out.println("String C1: "+Arrays.toString(c1));
        System.out.println("String C2: "+Arrays.toString(c2));
        if (Arrays.equals(c1, c2)) {
            System.out.println("String Anagram: "+Arrays.toString(c1));
        } else
         System.out.println("Not Anagram: "+Arrays.toString(c1));





        Set<Integer> s = new TreeSet<Integer>(new DescendingOrder());
        s.add(10);
        s.add(90);
        s.add(30);

        s.add(50);
        s.add(5);
        System.out.println(s);

        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

class DescendingOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
