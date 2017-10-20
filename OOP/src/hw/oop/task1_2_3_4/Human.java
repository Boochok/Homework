package hw.oop.task1_2_3_4;

import java.util.ArrayList;

class Human {
    public Pen getPen() {
        return pen;
    }

    private Pen pen;

    public Notepad getNotepad() {
        return notepad;
    }

    private Notepad notepad;

    public ArrayList<Notepad> notepadList = new ArrayList<>();
    public ArrayList<Pen> penList = new ArrayList<>();

    public Human(Pen pen, Notepad notepad) {
        this.pen = pen;
        this.notepad = notepad;
        penList.add(pen);
        notepadList.add(notepad);
    }

    public Pen askAnotherPen() {
        pen = new Pen(pen.getColor().otherColor(), pen.getPrice(), pen.getProducerName());
        penList.add(pen);
        return pen;
    }

    public Notepad askAnotherNotepad() {
        notepad = new Notepad(notepad.getPrice());
        notepadList.add(notepad);
        return notepad;
    }

    public int stationaryPriceCounter() {
        int summ = 0;
        for (Pen pen : penList) {
            summ += pen.getPrice();
        }
        for (Notepad notepad : notepadList) {
            summ += notepad.getPrice();
        }
        return summ;
    }
}
