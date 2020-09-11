package suport;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {
        //Abrindo o Navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rodrigo\\Cesar\\drivers\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Navegando para pagina Proposta
        browser.get("http://www.trivago.com.br");

        return browser;

    }
}