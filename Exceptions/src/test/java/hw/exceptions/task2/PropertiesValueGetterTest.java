package hw.exceptions.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertiesValueGetterTest {


    PropertiesValueGetter pg = new PropertiesValueGetter();
    String testFile = "Exceptions\\src\\test\\resources\\test.properties";
    String fileNotExist = "param\\pam";

    @Test
    void readPropertyFile() {
        pg.readPropertyFile(testFile);
    }

    @Test
    @DisplayName("getPropertiesValue works correctly")
    void getPropertiesValueWorksCorrectly() {
        assertTrue(pg.getPropertiesValue(testFile, "null").equals("0"));
    }

    @Test
    @DisplayName("All exceptions is caught")
    void catchAllExceptions(){
        pg.getPropertiesValue(fileNotExist, "1");
        pg.getPropertiesValue(testFile, "7");

    }

}