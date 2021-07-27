package ru.netology.orderCard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class orderCardTest {

    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        ChromeOptions
                options =
                new ChromeOptions();
        options.addArguments( "--disable-dev-shm-usage" );
        options.addArguments( "--no-sandbox" );
        options.addArguments( "--headless" );
        driver =
                new ChromeDriver( options );
        driver.get( "http://localhost:7777" );


    }
}