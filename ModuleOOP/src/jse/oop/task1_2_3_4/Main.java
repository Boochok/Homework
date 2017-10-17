package jse.oop.task1_2_3_4;



class Main {
    public static void main(String[] args) {
        Eraser eraser = new Eraser(5.99);
        Notepad notepad = new Notepad(30.1);
        Pencil pencil = new Pencil(10.5);
        Pen pen = new Pen(Pen.Color.BLACK, 20);
        StatKit stkit = new StatKit();
        stkit.setKit(eraser);
        System.out.println(stkit.getKit());
        stkit.sortKitPrice();
        System.out.println(stkit.getKit());
        stkit.sortKitName();
        System.out.println(stkit.getKit());
        Scissors scissors = new Scissors(50);
        stkit.setKit(scissors);


    }
}
