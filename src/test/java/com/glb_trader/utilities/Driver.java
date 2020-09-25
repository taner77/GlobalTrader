package com.glb_trader.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;


public  class Driver {
    // Driver class driver instance yi kullanmak icin kullanilir (Singleton Driver)
    //Ihtiyacimiz oldugunda driver'i kurmak ve baslatmak icin kullaniriz
    // Driver null oldugunda create edip baslatacagiz (if driver==null)
    //Driver class 'i farkli browserlar ile de kullanacacgimiz sekilde olusturacagiz!!!
    //Driver class 'i farkli browserlar ile de kullanacacgimiz sekilde olusturacagiz!!!
    private Driver(){
        // Baska obje olusturulmasini istemedigimiz icin creta ediyoruz
    }
    //driver instance olusturalim
    static WebDriver driver;

    //Driver 'i baslatmak icin static bir method olusturalim
    public static WebDriver getDriver() {
        if(driver==null) {
            switch (ConfigurationReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver =new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver();
                    driver =new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case"headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){  // eger driver chrome'u isaret ediyorsa
            driver.quit();  // driver'i kapat
            driver=null;  //driver'in null oldugundan emin olmak icin null atiyoruz
            // boylelikle driver'i tekrar baslatabiliriz
            // Multi Browser test yaparken bu onemli olacak

            driver.close();
        }
    }
}
