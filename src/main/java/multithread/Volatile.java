package multithread;

import static java.lang.System.out;

public class Volatile extends Thread {
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
            out.println("Loop is finished. counter = " + counter);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile thread = new Volatile();
        thread.start();
        Thread.sleep(3000);
        out.println("After 3 seconds it's time to wake up!");
        thread.b = false;
        thread.join();
        out.println("End of program!");
    }
}
