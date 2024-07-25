import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class R15_subsetsOfNumber {

    public static void subSets(String str, String ans, int index){
        if (str.length() <=  index) {
            System.out.println(ans);
            return;
        }
        subSets(str, ans+str.charAt(index), index+1);
        subSets(str, ans, index+1);
    }

    public static void findSubsets(List<List<Integer>> subset, ArrayList<Integer> input, ArrayList<Integer> output, int index){
        if (index == input.size()) {
            subset.add(output);
            return;
        }
        findSubsets(subset, input, new ArrayList<>(output), index+1);

        output.add(input.get(index));
        findSubsets(subset, input, new ArrayList<>(output), index+1);
    }
    public static void main(String[] args) { 

        List<List<Integer>> subset = new ArrayList<>();

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        findSubsets(subset, input, new ArrayList<>(), 0);
        

        Comparator<Object> comp = new Comparator<>(){
            @SuppressWarnings("unchecked")
            @Override
            public int compare(Object o1, Object o2) {
                int n = Math.min(((List<List<Integer>>) o1).size(), ((List<List<Integer>>)o2).size());
                for (int i = 0; i <n; i++) {
                    if (((List<List<Integer>>) o1).get(i) == ((List<List<Integer>>) o2).get(i)) {
                        continue;
                    } else {
                        // If it is negative it sort
                        // it can be implemented as  return o1.get(i) - o2.get(i); or the below method
                        return -1;
                    }
                }
                return 1;
            }
        };

        
        // Hear we are passing the Comparator object the sort method of Collections
        Collections.sort(subset, comp);
        


        // The comparator is functional interface which can be implemented using the lambda expression
        //  Collections.sort(subset, (o1, o2) -> {
        //     int n = Math.min(o1.size(), o2.size());
        //     for (int i = 0; i < n; i++) {
        //         if (o1.get(i) == o2.get(i)){
        //             continue;
        //         }else{
        //             return o1.get(i) - o2.get(i);
        //         }
        //     }
        //     return 1;
        // });

        // To show List<List<Integer>>
        for (int i = 0; i < subset.size(); i++) {
            for (int j = 0; j < subset.get(i).size(); j++) {
                System.out.print(subset.get(i).get(j)+" ");
            }
            System.out.println();
        }



        // Normal method to get the Substring
        // String str = "123";
        // subSets(str, "", 0);
    }
}
