// ASCII value for upperCase alphabet is between 65 to 90
import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = s.next().charAt(0);
        ch = Character.toUpperCase(ch);
        

        // it uses assci values
        // if (ascii>=65 && ascii<=90) {
            if(ch>='A' && ch<='Z') {
            System.out.println(ch+": It is alphabet");
        } else {
            System.out.println(ch+": It is not alphabet");
        }
        s.close();
    }
}