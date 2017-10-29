package hw.io.task4;

import java.io.Serializable;

public class Actor implements Serializable {

    private String name;

    public Actor(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
