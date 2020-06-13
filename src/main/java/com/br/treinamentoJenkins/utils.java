package com.br.treinamentoJenkins;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


public class utils {
	
    public static WebDriver driver;
    

    public utils() {
    	System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com.br/");
    	
    }

    public static void closeDriver() {
        driver.close();

    }

}
