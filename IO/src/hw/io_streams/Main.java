package hw.io_streams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String javaFile;
        javaFile = ByteStreams.parseJavaFile("IO\\src\\hw\\io_streams\\CharStreams.java");

        JavaKeywords jk = new JavaKeywords();
        String keys;
        keys = jk.findTheKeywords(javaFile);

        ByteStreams.writeKeysIntoFile(keys, "BS_file1.txt");
        JavaKeywords jk2 = new JavaKeywords();
        javaFile = CharStreams.parseJavaFile("IO\\src\\hw\\io_streams\\ByteStreams.java", "UTF-8");
        keys = jk2.findTheKeywords(javaFile);

        CharStreams.writeFile(keys, "CS_file2.txt", "UTF-8");
    }
}
