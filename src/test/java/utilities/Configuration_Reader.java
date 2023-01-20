package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
    private static  Properties properties=new Properties();

   static {

       try {
           Properties properties=new Properties();

           FileInputStream file=new FileInputStream("configuration.properties");
           properties.load(file);

           file.close();

       } catch (IOException e) {
           System.out.println("file not found in the configurationReader class");
       }

   }
   public  static  String getProperty(String keyword){
       return properties.getProperty(keyword)
   }
}
