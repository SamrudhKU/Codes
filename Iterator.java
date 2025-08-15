import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");

        java.util.Iterator<String> iter = list.iterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
