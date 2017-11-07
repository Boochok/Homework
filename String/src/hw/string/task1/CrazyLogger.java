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


    public void record(String message) {
        Date date = new Date();
        synchronized (tape) {
            tape.append(sdf.format(date)).append(" - ").append(message).append("; ");
        }
    }

    static String[] watchTheTape() {
        return tape.toString().split("; ");
    }

    static String[] pieceOfTape;

    public void findInformation(String pattern) {
        pieceOfTape = watchTheTape();
        if (find.length() != 0)
            find.delete(0, find.length());
        synchronized (find) {
            for (String piece : pieceOfTape) {
                String[] message = piece.split(" - ");
                if (message[1].contains(pattern))
                    find.append(piece).append("; ");
                else
                    continue;
            }
        }
        String result = find.length() == 0 ? "CrazyLogger doesn't have such message" : find.toString();
        System.out.println(result);
    }

    public String findByDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String stringDate = sdf.format(date);
        if (find.length() != 0)
            find.delete(0, find.length());
        return puzzleFinding(stringDate);
    }

    private synchronized String puzzleFinding(String stringDate) {
        pieceOfTape = watchTheTape();
        for (String log : pieceOfTape) {
            if (!log.startsWith(stringDate))
                continue;
            find = find.append(stringDate + ": ");
            String[] s = log.split(" : ");
            find.append(s[1] + "; ");
        }
        return find.length() == 0 ? "CrazyLogger doesn't have such information." : find.toString();
    }
}
