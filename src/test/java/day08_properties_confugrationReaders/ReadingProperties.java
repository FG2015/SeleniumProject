package day08_properties_confugrationReaders;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties() throws IOException {
        //creat the object of properties
        Properties properties=new Properties();
        // we need to open the file in Java memory: fileInputStream
       FileInputStream file=new FileInputStream("configuration.properties");
        properties.load(file);
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
    }
}
