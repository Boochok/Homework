package hw.string.task1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class CrazyLogger {
    static StringBuilder tape = new StringBuilder();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY : HH-mm-ss");

    static void record(String message) {
        Date date = new Date();
        tape.append(sdf.format(date)).append(" - ").append(message).append("; ");
    }
    public static String watchTheTape(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String fdate = sdf.format(date);

        String[] notes = tape.toString().split("; ");

        StringBuilder find = new StringBuilder(fdate + ": \n");

        for (String log : notes) {
            if (log.startsWith(fdate)){
                String[] s = log.split(" : ");
                find.append(s[1]+"\n");
            }
        }
        return find.toString();
    }
}
