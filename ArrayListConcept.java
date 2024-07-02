// This give a basic information about the ArrayList class in java

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Lyken");
        arr.add("Dodge");
        arr.add("Suzaki");
        arr.add("Ford");
        arr.add("BMW");
        arr.add("Bugatti");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        Collections.sort(arr);
        
        System.out.println("After sorting");
        for(String i : arr){
            System.out.println(i);
        }

        arr.remove(0);
        System.out.println(arr);

        arr.clear();
        System.out.println(arr);

    }
}
