package hw.string.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private static StringBuilder tape = new StringBuilder();

    static String getTape() {
        return tape.toString();
    }
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY : HH-mm");


    public static void record(String message) {
        Date date = new Date();
        tape.append(sdf.format(date)).append(" - ").append(message).append("; ");
    }

    static String[] watchTheTape(){
        return tape.toString().split("; ");
    }

    static String[] pieceOfTape;

    public static String findInformation(String pattern){
        StringBuilder find = new StringBuilder();
        pieceOfTape = watchTheTape();
        for (String piece : pieceOfTape) {
            if(pattern.matches(piece))
                find.append(piece).append("\n");
        }
        return find.toString();
    }
    public static String findByDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String stringDate = sdf.format(date);
        StringBuilder find = new StringBuilder(stringDate + ": \n");
        pieceOfTape = watchTheTape();
        for (String log : pieceOfTape) {
            if (log.startsWith(stringDate)){
                String[] s = log.split(" : ");
                find.append(s[1]+"\n");
            }
        }
        return find.toString();
    }
}
