package hw.io.task4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Film implements java.io.Serializable {

    private String title;

    private List<Actor> actors = new ArrayList<>();

    public Film (String title, Actor... stars){
        this.title = title;
        Collections.addAll(actors, stars);
    }
    public String getTitle(){
        return title;
    }

    public List<Actor> getActors() {
        return actors;
    }
    @Override
    public String toString() {
        return String.format("\"%s\", Stars: %s.", title, actors.toString());
    }
}
