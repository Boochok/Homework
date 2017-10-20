package hw.string.task3_regexp;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PicturesAtArticle {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PicturesAtArticle pictures = new PicturesAtArticle();
        pictures.findThePictures();
    }

    public void findThePictures() throws FileNotFoundException, UnsupportedEncodingException {
        Pattern pattern = Pattern.compile(
                "[Рр]ис(\\D{4,5})?\\.? ((\\([а-я,]+\\))|\\d+[\\-][а-я,]+|\\d*\\s?[\\,и]?\\s?\\d+)");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("String\\src\\AnalyzedFile.html"), "windows-1251"));){
            ArrayList<String> group2List = new ArrayList<>();
            String s = null;
            while((s = br.readLine()) != null){
                Matcher matcher = pattern.matcher(s);
                while(matcher.find()){
                    System.out.println(matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
