package hw.string.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CrazyLogger.record("first message");
        Thread.sleep(1000);
        CrazyLogger.record("message2");
        Thread.sleep(1000);
        CrazyLogger.record("massage3");
        System.out.println(CrazyLogger.tape.toString());
        System.out.println(CrazyLogger.watchTheTape(new Date()));

    }
}
