import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

public class LaunchBrowser {
    @Test
    public void launchBrowserTest(){
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.baseUrl = "https://www.google.com";
        //Configuration.browserSize = "1920x1080"; // размер окна браузера
        //Configuration.startMaximized = true; // запуск хром в максимальном для монитора размере
        //Configuration.browserBinary = "путь до драйвера браузера";
        //System.setProperty("selenide.browserBinary", "/Users/Downloads/chromedriver");
        //System.setProperty("selenide.browser", "chrome"); // открытие в хроме или файрфоксе / дефолт в хроме
        //Configuration.screenshots = false; // скриншоты
        //mvn clean install -Dselenide.browser="firefox"

      open("/");
        $(By.name("q")).setValue("Github Selenide").pressEnter();
        //$(By.name("btnK")).click();
        $(By.id("logo")).shouldHave(appear);
        String header = $(By.xpath("//h3[text()='Selenide - Concise UI Tests with Java! - GitHub']")).getText();
        System.out.println("Header " + header);
        Assert.assertEquals(header, "Selenide - Concise UI Tests with Java! - GitHub");

    }
}
