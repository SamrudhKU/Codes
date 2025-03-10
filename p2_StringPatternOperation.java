import java.util.Scanner;
public class p2_StringPatternOperation {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        // char[] str = {'S','D','M','I','T',' ', 'I','T', ' '};
        // char[] pat = {'I','T'};
        // char[] rep = {'U', 'J', 'I', 'R', 'E'};

           
        System.out.println("Enter the String: ");
        String str = s.nextLine();
        // String str = "SDMIT IT IT";
        System.out.println("Enter the patten String: ");
        String pat = s.nextLine();
        // String pat = "IT";
        System.out.println("Enter the replaceing String: ");
        String rep = s.nextLine();
        // String rep = "UJIRE";
        String []Str = str.split(" ");
        boolean flag = false;
        for (int i = 0; i < Str.length; i++) {
            if (Str[i].equals(pat)) {
                Str[i] = rep;
                flag = true;
            } 
        }
        if (flag == false) {
            System.out.println("Patter does'nt match");
        } else{
            for (String string : Str) {
                System.out.print(string+" ");
            }
        }

        s.close();
    }
}
