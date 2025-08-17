public class DaemonThread {
/* 
1. Daemon Thread
A background service thread that provides support to other (user) threads.

JVM does not wait for daemon threads to finish before exiting.

Examples:
-> G arbage Collector (GC)
-> Finalizer thread
-> Background tasks like monitoring, cleanup, scheduling

Key point: When all non-daemon (user) threads finish, JVM will terminate automatically, even if daemon threads are still running.
*/


/*
2. Non-Daemon Thread (User Thread)
The default type of thread.

JVM waits for all user threads to complete before shutting down.

Examples: main thread

Any thread you create without explicitly marking it as daemon
 */
    public static void main(String...Samrudh){
        Thread t = new Thread(() -> {
            while(true)
            System.out.println("Daemon Thread running");
        });

        t.setDaemon(true);
        t.start();
        System.out.println("Non Daemon Thread");
    }
}
