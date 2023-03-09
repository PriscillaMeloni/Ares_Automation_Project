package com.twilia.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create the Properties object (create object)
    //make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else.
    private static Properties properties = new Properties();
    /*
    The reason for declaring the Properties object as a private static variable
    is to ensure that there is only one instance of the object throughout the
    lifetime of the application. Declaring it as private prevents direct access
    to the object from outside the class, while making it static ensures that it
    is shared across all instances of the class.
     */

    static{ //static block
        /*
        In this example, the static block initializes the properties object by loading the
        configuration data from a file called config.properties. If there is an error while
        loading the file (e.g., if the file is missing or cannot be read), the catch block
        will handle the exception by printing a stack trace.
The reason for using a static block with try and catch in this way is to ensure that the
properties object is initialized before any other methods in the Configuration Reader
class are called. By using a static block, you can be sure that the properties object will
be initialized exactly once, when the class is first loaded into memory.
         */

        try {
            //2- Open file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("configuration.properties");
            //3- Load the "properties" object with "file" (load properties)
            properties.load(file);

            //close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
            e.printStackTrace();
        }
    }

    //create a utility method to use the object to read
    //4- Use "properties" object to read from the file (read properties)

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
