import java.util.Arrays;

public class S9_frequencyOfChar {
    public static void main(String[] args) {
        String str = "Sasaummu";
        String temp = str;
        str = str.toUpperCase();
        char ch[] = new char[str.length()];
        ch = str.toCharArray();
        int freq[] = new int[str.length()];
        boolean flag = true;
        // to find first non reapting character

        for (int i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("The first reapting character"+i);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("no repeating element");
            
        }



        // to find the frequency of the character 

        // for (int i = 0; i < str.length(); i++) {
        //     freq[i] = 1;
        //     for (int j = i + 1; j < str.length(); j++) {
        //         if (ch[i] == ch[j]) {
        //             freq[i]++;
        //             ch[j] = '0';
        //         }
        //     }
        // }
        // for (int i = 0; i < freq.length; i++) {
        //     if (ch[i] != '0' && freq[i] == 1)
        //         System.out.println(temp.charAt(i) + ":" + freq[i]);
        // }

        // using the boolena array to find visited

        // boolean visited[] = new boolean[str.length()];
        // Arrays.fill(visited, false);
        // for (int i = 0; i < str.length(); i++) {
        // int count = 0;
        // if (visited[i] == true) {
        // continue;
        // }
        // for (int j = i; j < str.length(); j++) {
        // if(str.charAt(i) == str.charAt(j)){
        // count++;
        // visited[j] = true;
        // }
        // }
        // System.out.println(temp.charAt(i)+":"+count);
        // }
    }
}
