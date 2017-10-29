package hw.io.task4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Actor depp = new Actor("Johnny Depp");
        Film dream = new Film("Arizona Dream", depp);

        Actor nicholson = new Actor("Jack Nicholson");
        Film shining = new Film("The shining", nicholson);

        FilmCollection collection = new FilmCollection(dream, shining);
        FilmCollection.safeCollection(collection);
        FilmCollection old =  FilmCollection.viewCollection();
        Film pirates = new Film("Pirates of the caribbean", new Actor("Johnny Depp"), new Actor("Keira Knightley "));
        old.setFilm(pirates);
        FilmCollection.safeCollection(old);
        FilmCollection newCollect = FilmCollection.viewCollection();
        System.out.println(newCollect);
    }
}
