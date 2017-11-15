package hw.exceptions.task2;

import java.io.*;
import java.security.InvalidParameterException;
import java.util.*;


public class PropertiesValueGetter {

    private Properties properties = new PropertiesWithKeyOnly();
    private Map<Object, Object> propertyMap = new HashMap<>();

    private void readPropertyFile(String propertyFile) {

        try {
            try (InputStream is = new FileInputStream(propertyFile)) {
                properties.load(is);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //homework "Collections", task1
        propertyMap.putAll(properties);
//        Добавление элемента в Map методом put с ключом, который уже присутствует в Map
//        приводит к замене старого элемента на новый а метод put вернёт значение старого элемента:
//        System.out.println(propertyMap.put("1", "9").toString());
//        System.out.println(propertyMap.toString());

    }

    public synchronized String getPropertiesValue(String fileName, String key) {

        String value = "";

        if (propertyMap.isEmpty())
            readPropertyFile(fileName);

        try {
            value = properties.getProperty(key);
        } catch (InvalidParameterException e) {
            System.err.println(e.getMessage());
        }

        return value;
    }
}
