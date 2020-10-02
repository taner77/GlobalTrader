package com.glb_trader.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    //Bu class in amaci, configuration.properties dosyasindaki
    //verileri (test data ) okumaktir

    //create Properties intance
    private  static Properties properties;



    //Properties i bu dosyaya yukluyoruz
    //Daha sonra properties dosyasini okuyacagiz

    static {
        //  String path = "C:\\Users\\steel\\IdeaProjects\\mytestNGframework\\configuration.properties";
        String path = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path); //FileInputStream kullanarak bir dosya aciyoruz
            properties = new Properties();
            properties.load(file);
        } catch (Exception e) {
            // System.out.println("File path bulunamadi");
            e.printStackTrace();
        }
    }
    //Okumak icin static bir metod olusturalim.
    //Bu metod kullanici anahtar kelimeyi girdiginde(key) , value return eder.

    public static String getProperty(String key){

        return properties.getProperty(key);
    }


//public static void main(String[] args) {
//    System.out.println(properties.getProperty("browser"));
//}
}


