package hw.io.task1_2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CharStreams {

    public static String readJavaFile(String path, String charset) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), charset))) {
            String s = null;
            while ((s = reader.readLine()) != null) {
                content = content.append(s).append("\n");
            }
        }
        return content.toString();
    }

    public static void writeFile(String content, String file, String charset) throws IOException {
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(file), charset))) {
//            String[] list = content.split("[{}, ]+");
//            for (String s : list) {
//                writer.println(s);
//            }
//            StringTokenizer st = new StringTokenizer(content);
//            while(st.hasMoreElements()){
//                writer.println(st.nextToken("{}, "));
//            }
            Scanner scanner = new Scanner(content);
            scanner.useDelimiter("[{}, ]+");
            while (scanner.hasNext()){
                writer.println(scanner.next());
            }
        }
    }
}
