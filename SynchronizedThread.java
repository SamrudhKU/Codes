class Counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
public class SynchronizedThread {
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();

        Thread t = new Thread( ()->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        } );

        Thread t1 = new Thread( ()-> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t.start();
        t1.start();

        t.join();
        // t1.join();

        System.out.println("Counter Value: "+ c.getCount());

    }
}
