package classes.properties;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        // READ DATA FROM PROPERTIES FILE
        try {
            // load file
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            // get value of key from file
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ditemukan: " +exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }

        // PUT DATA TO PROPERTIES FILE (KEY, VALUE)
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Rifqi");
            properties.put("name.middle", "Muhammad");
            properties.put("name.last", "Aziz");

            properties.store(new FileOutputStream("name.properties"), "Name Config");
        } catch (FileNotFoundException exception) {
            System.out.println("File properties gagal dibuat");
        } catch (IOException exception) {
            System.out.println("Data gagal disimpan ke file");
        }
    }
}
