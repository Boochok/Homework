package jse.oop.task5;

public class Main {
    public static void main(String[] args) {
        Student ignat = new Student("Ignat");
        ignat.subjectsAndMarks(Subject.MATH, new Student.Mark(4.5));
        ignat.subjectsAndMarks(Subject.BIOLOGY, new Student.Mark(5));
        ignat.subjectsAndMarks(Subject.PHYSICS, new Student.Mark(4));
        System.out.println(ignat.getSubjects());
    }
}
