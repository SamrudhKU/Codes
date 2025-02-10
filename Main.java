import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Demo {
    default void show(){
    System.out.println("He;;pw");
   }
}

public class Main implements Demo {
    public static void main(String[] args) throws IOException {

        // Demo d = () ->System.out.println("Hello World");
        
        Main m = new Main();
        m.show();
        System.out.println(10+20+"A");
        // int  a = System.in.read();
        // System.out.println((char)a);

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        
        // int k = Integer.parseInt(bf.readLine());
        // System.out.println(k);

    }

   
}














