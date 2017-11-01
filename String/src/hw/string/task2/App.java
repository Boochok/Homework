package hw.string.task2;

import java.util.Locale;
import java.util.ResourceBundle;

public class App {
    ResourceBundle bundle;

    public String ask(Locale locale, String numberOfQuestion){
        bundle = ResourceBundle.getBundle("question", locale);
        return bundle.getString(numberOfQuestion);
    }
    public String ask(String numberOfQuestion){
        return ask(Locale.getDefault(), numberOfQuestion);
    }

    public String answer(Locale locale, String numberOfQuestion){
        bundle = ResourceBundle.getBundle("answers.Answer", locale);
        return bundle.getString(numberOfQuestion);
    }
    public String answer(String numberOfQuestion){
        return answer(Locale.getDefault(), numberOfQuestion);
    }
}
