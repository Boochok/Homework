package jse.oop.task5;

public enum Subject {
    MATH {
        public boolean isFloat() {
            return true;
        }
    }, BIOLOGY {
        public boolean isFloat() {
            return false;
        }
    }, PHYSICS{
        @Override
        public boolean isFloat() {
            return true;
        }
    };

    public abstract boolean isFloat();



}
