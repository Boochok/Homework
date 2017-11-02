package hw.string.task1;

public class WriteThread implements Runnable {
    CrazyLogger cl = new CrazyLogger();
    @Override
    public void run(){
        cl.record("thread " + Thread.currentThread().getName() + " have been written to the CrazyLogger");
     }
}
