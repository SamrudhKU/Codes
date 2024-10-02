public class IncrementingStaticVariable {

    static int counter = 0;

    IncrementingStaticVariable() {
        counter++;
    }

    public static void displayCounter() {
        System.out.println("Conter: " + counter);
    }

    public static void main(String[] args) {

        IncrementingStaticVariable m = new IncrementingStaticVariable();
        m.displayCounter();

        IncrementingStaticVariable m1 = new IncrementingStaticVariable();
        m1.displayCounter();

        IncrementingStaticVariable m2 = new IncrementingStaticVariable();
        m2.displayCounter();

    }
}
