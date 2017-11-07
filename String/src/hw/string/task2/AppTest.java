package hw.string.task2;

import java.util.Locale;

public class AppTest {
    static App app = new App();
    public static void main(String[] args) {
        String question1 = app.ask(new Locale("ru", "RU"), "1");
        System.out.println("question 1 = " + question1);
        Object answer1 = app.answer("1");
        System.out.println("answer 1 = " + answer1.toString());
    }
}
