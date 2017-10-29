package hw.io.task3;

import java.io.*;

public class ByteAndCharIO {


    public static void main(String[] args) throws IOException {
        readAndWrite("IO\\resources\\task3.txt","toFile.txt");
    }

    private static void readAndWrite(String fromFile, String toFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(fromFile), "UTF-8"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(toFile, true), "UTF-16"))) {
                    if (s.endsWith("."))
                        writer.write("\n");
                    writer.write(s);
                }
            }
        }
    }
}
