package hw.string.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private static volatile StringBuilder tape = new StringBuilder();
    private static StringBuilder find = new StringBuilder();

    String getTape() {
        return tape.toString();
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY : HH-mm");


    public synchronized void record(String message) {
        Date date = new Date();
        tape.append(sdf.format(date)).append(" - ").append(message).append("; ");
    }

    static String[] watchTheTape() {
        return tape.toString().split("; ");
    }

    static String[] pieceOfTape;

    public String findInformation(String pattern) {
        pieceOfTape = watchTheTape();
        if (find.length() != 0)
            find.delete(0, find.length());
        synchronized (find) {
            for (String piece : pieceOfTape) {
                if (piece.contains(pattern))
                    find.append(piece).append(";");
            }
        }

        return find.toString();
    }

    public String findByDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String stringDate = sdf.format(date);
        if (find.length() != 0)
            find.delete(0, find.length());
        puzzleFinding(stringDate);

        return find.toString();
    }

    private synchronized void puzzleFinding(String stringDate) {
        find = find.append(stringDate + ": \n");
        pieceOfTape = watchTheTape();
        for (String log : pieceOfTape) {
            if (log.startsWith(stringDate)) {
                String[] s = log.split(" : ");
                find.append(s[1] + "\n");
            }
        }
    }
}
