package hw.io_streams;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByteStreams {

    public static String parseJavaFile(String path) throws IOException {
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
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path))){
            byte[] keyWordsInBytes = content.getBytes();
            bos.write(keyWordsInBytes);
        }
    }
    public static String findTheKeyWords(String fileContent){
        Map<String, Integer> map = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("\\b(abstract|assert|boolean|byte|break|case|catch|char|class|const|" +
                "continue|default|do|double|enum|else|extends|final|finally|for|" +
                "float|goto|if|implements|import|instanceof|int|interface|long|native|" +
                "new|package|public|private|protected|return|short|static|strictfp|super|" +
                "switch|synchronized|this|throw|throws|try|transient|void|volatile|while)");
        Matcher matcher = pattern.matcher(fileContent);
        int countValue = 0;
        while(matcher.find()){
            map.put(matcher.group(), map.getOrDefault(matcher.group(), countValue) + 1);
        }
        return map.toString();
    }
}
