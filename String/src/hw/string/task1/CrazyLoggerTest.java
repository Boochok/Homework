package hw.string.task1;


public class CrazyLoggerTest {
    public static void main(String[] args) throws InterruptedException {
        CrazyLoggerTest main1 = new CrazyLoggerTest();
        CrazyLoggerTest main2 = new CrazyLoggerTest();
        main1.go();
        main2.go();
    }
    public void go(){
        CrazyLogger.record("first message");
        CrazyLogger.record("message2");
        CrazyLogger.record("massage3");
        System.out.println(new CrazyLogger().getTape());
    }
}
