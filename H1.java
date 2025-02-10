// This program is used to compare between the two List<string> objects

import java.util.ArrayList;
import java.util.List;

public class H1 {

    public static List<Integer> matchingStrings (List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
            
        for(int i=0; i<queries.size();i++){
            Integer count = 0;
            for(int j=0;j<strings.size();j++){
                if (queries.get(i).equals(strings.get(j))){
                    count = count + 1;
                }   
            }
            list.add(count);
            // System.out.println(list.get(i));
        }
        
        return list;
        }
        
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add( "baba");
        strings.add("aba");
        strings.add("xzxb");

        

        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
       
        System.out.println(matchingStrings(strings, queries));

        

    }
}