package hw.string.task1;


import java.util.Arrays;
import java.util.Date;

public class CrazyLoggerTest {
    CrazyLogger cl = new CrazyLogger();
    public static void main(String[] args) throws InterruptedException {
        CrazyLoggerTest main1 = new CrazyLoggerTest();
        main1.go();

    }
    public void go(){
        cl.record("first message");
        cl.record("message2");
        cl.record("massage3");
        System.out.println(cl.getTape());
        System.out.println("============");
        System.out.println("Message have to contains \"3\" " + cl.findInformation("3"));
        System.out.printf("Today's message: %n%s", cl.findByDate(new Date()));
    }
}
