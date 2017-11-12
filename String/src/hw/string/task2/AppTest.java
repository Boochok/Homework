package hw.string.task2;

import java.io.IOException;
import java.util.Locale;


public class AppTest {
    static QuestionsAndAnswersApp app = new QuestionsAndAnswersApp();
    public static void main(String[] args) throws IOException {
        app.ask(new Locale("Us", "en"));
    }
}
