package hw.exceptions.task2;

import java.security.InvalidParameterException;
import java.util.Properties;

public class PropertiesWithKeyOnly extends Properties {
    @Override
    public String getProperty(String key){
        String properties = super.getProperty(key);
        if (properties == null) {
            throw new InvalidParameterException(
                    String.format("Missing value for key %1s", key));
        }
        return properties;
    }
}
