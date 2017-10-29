package hw.io.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilmCollection implements java.io.Serializable {

    private List<Film> films = new ArrayList<>();

    public FilmCollection(){
    }

    public FilmCollection(Film ... movie) {
        Collections.addAll(films, movie);
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilm(Film... film) {
        Collections.addAll(films, film);
    }

    @Override
    public String toString() {
        return films.toString();
    }
    public static void safeCollection(FilmCollection collection) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FilmCollection.txt"))) {
            oos.writeObject(collection);
        }
    }

    public static FilmCollection viewCollection() throws IOException {
        FilmCollection collection = null;
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FilmCollection.txt"))) {
                try {
                    collection = (FilmCollection) ois.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        return collection;
    }
}