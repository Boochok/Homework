package hw.string.task1;

import java.util.Date;

public class CrazyLoggerTest {
    CrazyLogger cl = new CrazyLogger();
    public static void main(String[] args) throws InterruptedException {
        CrazyLoggerTest main1 = new CrazyLoggerTest();
        main1.go();

    }
    public void go(){
        cl.record("first message");
        cl.record("message 2");
        cl.record("massage 3");
        System.out.println(cl.getTape());
        System.out.println("============");
        cl.findInformation("3");
        System.out.println("============");
        Date date = new Date();
        cl.findByDate(date);
        System.out.println("============");
        Thread t1 = new Thread(new WriteThread());
        Thread t2 = new Thread(new WriteThread());
        t1.setName("One");
        t2.setName("Two");
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cl.getTape());
    }
}
