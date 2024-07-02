// ASCII values can be print useing the typeCasting between int and char
// ASCII value starts for at Alphabets at a: 66
// ASCII value starts for Number at 48

public class ToPrintAscii {
    public static void main(String[] args) {
        char abs[] = new char[30];

        for (int i = 0; i < 26; i++) {
            abs[i] = (char)(i+65);
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(abs[i]+" ");
        }

        int a = 48+1;
        System.out.println("\n"+(char)a);
    }
}
