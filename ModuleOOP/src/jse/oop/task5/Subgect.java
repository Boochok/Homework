package jse.oop.task5;

public enum Subgect {
    MATH {
        public boolean isFloat() {
            return false;
        }
    }, BIOLOGY {
        public boolean isFloat() {
            return true;
        }
    };

    public abstract boolean isFloat();



}
