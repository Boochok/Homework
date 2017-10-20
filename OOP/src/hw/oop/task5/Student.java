package hw.oop.task5;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private Map subjects = new HashMap<Subject, Student.Mark>();

    public void subjectsAndMarks(Subject subject, Student.Mark mark){
        mark.value = subject.isFloat() ? mark.getValue().doubleValue() : mark.getValue().intValue();
        subjects.put(subject, mark);
    }

    public Map getSubjects() {
        return subjects;
    }

    @Override
    public String toString(){
        return name;
    }

    public static class Mark<T extends Number> {
        public void setValue(T value) {
            this.value = value;
        }

        private T value;

        public Mark(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        @Override
        public String toString() {
            String s = null;
            return s.valueOf(value);
        }
    }
}
