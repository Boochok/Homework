package hw.string.task3_regexp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PicturesAtArticle {
    public static void main(String[] args) throws IOException {
        PicturesAtArticle pictures = new PicturesAtArticle();
        String text = pictures.readHTML("String\\resources\\AnalyzedFile.html", "windows-1251");
        List<String> picturesRef = pictures.findThePictures(text);
        System.out.println("Ссылается ли автор на рисунки последовательно - " + isAscendingOrder(picturesRef));
        System.out.println(picturesRef.toString());
    }

    public List<String> findThePictures(String text) throws IOException {
        List<String> pictureRefList = new ArrayList<>();
        Pattern pattern = Pattern.compile(
                "[Рр]ис(\\D{4,5})?\\.? ((\\([а-я,]+\\))|\\d+[\\-][а-я,]+|\\d*\\s?[,и]?\\s?\\d+)");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            pictureRefList.add(matcher.group());
        }
        return pictureRefList;
    }

    public String readHTML(String path, String charset) throws IOException {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader breader = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), charset))) {
            String s;
            while((s = breader.readLine()) != null)
                sb.append(s);
        }
        return sb.toString();
    }
    public static boolean isAscendingOrder(List<String> list){
        for(int i = 1; i< list.size(); i++){
            if(list.get(i).compareTo(list.get(i-1)) < 0)
                return false;
        }
        return true;
    }
}
