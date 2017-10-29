package hw.string.task1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {
    static StringBuilder tape = new StringBuilder();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY : HH-mm");

    static void record(String message) {
        Date date = new Date();
        tape.append(sdf.format(date)).append(" - ").append(message).append(";");
    }
    public static String watchTheTape(String date){

        String[] notes = tape.toString().split(";");

        StringBuilder find = new StringBuilder(date + ": \n");

        for (String log : notes) {
            if(log.startsWith(date)){
                String[] s = log.split(" : ");
                find.append(s[1]).append("\n");
            }
        }
        return find.toString();
    }
}
