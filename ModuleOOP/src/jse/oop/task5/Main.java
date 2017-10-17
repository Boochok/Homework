package jse.oop.task5;

public class Main {
    public static void main(String[] args) {
        Student ignat = new Student("Ignat");
        ignat.setMarks(Subgect.MATH, new Student.Mark(4.5));
        System.out.println(ignat.getSubjects());
        ignat.setMarks(Subgect.MATH, new Student.Mark(5));
    }
}
