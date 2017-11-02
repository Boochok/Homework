package hw.string.task2;

import java.util.Locale;
import java.util.ResourceBundle;

public class App {
    private ResourceBundle bundle;

    public String ask(Locale locale, String numberOfQuestion){
        bundle = ResourceBundle.getBundle("question", locale);
        return bundle.getString(numberOfQuestion);
    }
    public String ask(String numberOfQuestion){
        return ask(Locale.getDefault(), numberOfQuestion);
    }

    public Object answer(Locale locale, String numberOfQuestion){
        bundle = ResourceBundle.getBundle("answers_task2.Answer", locale);
        return bundle.getObject(numberOfQuestion);
    }
    public Object answer(String numberOfQuestion){
        return answer(Locale.getDefault(), numberOfQuestion);
    }
}
