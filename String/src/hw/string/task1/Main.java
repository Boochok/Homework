package hw.string.task1;

public class Main {
    public static void main(String[] args) {
        CrazyLogger.record("first message");
        System.out.println(CrazyLogger.tape);
        CrazyLogger.record("message2");
        CrazyLogger.record("massage3");

    }
}
