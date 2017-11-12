package hw.string.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;


public class QuestionsAndAnswersApp {

    private ResourceBundle bundle;
    private ArrayList<String> listOfQuestions;

    public void ask(Locale locale) throws IOException {

        bundle = ResourceBundle.getBundle("question", locale);

        Enumeration<String> keys = bundle.getKeys();

        while (keys.hasMoreElements()) {
            String s = keys.nextElement();
            System.out.println(s + ". "+bundle.getString(s));
        }

        System.out.println("\nI can show you an answer. Choose one of the question.");

        BufferedReader numberReader = new BufferedReader(new InputStreamReader(System.in));
        String number = numberReader.readLine();
        System.out.println(answer(locale, number).toString());
    }

    public void ask() throws IOException {
        ask(Locale.getDefault());
    }

    private Object answer(Locale locale, String numberOfQuestion){
        bundle = ResourceBundle.getBundle("answers_for_task2.Answer", locale);
        return bundle.getObject(numberOfQuestion);
    }
    public Object answer(String numberOfQuestion){
        return answer(Locale.getDefault(), numberOfQuestion);
    }
}
