package hw.io.task1_2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ByteStreams {

    public static String readJavaFile(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        try(BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(path))){
            int b;
            char byteToChar;
            while((b =  bis.read()) != -1){
                byteToChar = (char) b;
                content.append(byteToChar);
            }
        }
        return content.toString();
    }

    public static void writeKeysIntoFile(String content,String path) throws IOException {
        try(PrintStream ps = new PrintStream(new FileOutputStream(path))){
            String[] list = content.split("[{}, ]+");
            for (String s : list) {
                ps.println(s);
            }
//        StringTokenizer st = new StringTokenizer(content, ", {}");
//            while(st.hasMoreTokens()){
//                ps.println(st.nextToken());
//            }
//        Scanner scanner = new Scanner(content);
//            scanner.useDelimiter("[{}, ]+");
//            while (scanner.hasNext()){
//                ps.println(scanner.next());
//            }
        }
    }
}
