package hw.string.task2;

import java.util.Arrays;
import java.util.Locale;

public class AppTest {
    public static void main(String[] args) {
        App app = new App();

        String question1 = app.ask(new Locale("ru", "RU"), "1");
        System.out.println("question 1 = " + question1);
        Object answer1 = app.answer("1");
        System.out.println("answer 1 = " + answer1.toString());

        String question2 = app.ask(Locale.US, "2");
        System.out.println("question 2 = " + question2);
        Object answer2 = app.answer("2");
        System.out.println("answer 2 = " + answer2.toString());

        Object answ3 = app.answer(Locale.GERMAN,"2");
        System.out.println("interesting answer in GERMAN = " + answ3.toString());
    }
}
