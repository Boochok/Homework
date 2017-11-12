package hw.exceptions.task1;

import java.io.*;
import java.security.InvalidParameterException;
import java.util.Properties;


public class PropertiesValueGetter {

    private Properties properties = new PropertiesWithKeyOnly();
    private boolean isRead = false;

    private void readPropertyFile(String propertyFile) {

        try {
            try (InputStream is = new FileInputStream(propertyFile)) {
                properties.load(is);
                isRead = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPropertiesValue(String fileName, String key) {

        String value = "";

        if (isRead == false)
            readPropertyFile(fileName);

        try {
            value =  properties.getProperty(key);
        }catch (InvalidParameterException e){
            System.err.println(e.getMessage());
        }

        return value;
    }
}
