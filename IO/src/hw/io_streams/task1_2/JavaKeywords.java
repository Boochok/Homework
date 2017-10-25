package hw.io_streams.task1_2;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaKeywords {

    Map<String, Integer> keywordsMap = new LinkedHashMap<>();

    public String findTheKeywords(String fileContent) {

        Pattern pattern = Pattern.compile(javaKeyWordsPattern());
        Matcher matcher = pattern.matcher(fileContent);

        while (matcher.find()) {
            putWordsIntoMap(matcher);
//          keywordsMap.put(matcher.group(),keywordsMap.getOrDefault(matcher.group(), 0)+1);
        }
        return keywordsMap.toString();
    }

    private void putWordsIntoMap(Matcher matcher) {
        if (!keywordsMap.containsKey(matcher.group()))
            keywordsMap.put(matcher.group(),0);
        keywordsMap.put(matcher.group(), keywordsMap.get(matcher.group())+1);
    }
    private static String javaKeyWordsPattern(){
        return "\\b(abstract|assert|boolean|byte|break|case|catch|char|class|const|" +
                "continue|default|do|double|enum|else|extends|final|finally|for|" +
                "float|goto|if|implements|import|instanceof|int|interface|long|native|" +
                "new|package|public|private|protected|return|short|static|strictfp|super|" +
                "switch|synchronized|this|throws?|try|transient|void|volatile|while)\\b";
    }

}
