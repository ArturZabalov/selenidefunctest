import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class WebDriverRunnerTest {
    @Test
    public void myTest(){
        open("https://www.drive2.ru");
        WebDriverRunner.clearBrowserCache();
        System.out.println(WebDriverRunner.url());
        Assert.assertTrue(WebDriverRunner.url().contains("drive2"));
        //System.out.println(WebDriverRunner.source());
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(WebDriverRunner.isChrome());
        if(WebDriverRunner.isChrome()) {
            System.out.println("True Chrome");
        }
        WebDriverRunner.getAndCheckWebDriver();
        System.out.println(WebDriverRunner.supportsJavascript() + " Support Javascript");
        List<File> fileList = WebDriverRunner.getBrowserDownloadsFolder().files();
        System.out.println(fileList.size());




        WebDriverRunner.closeWebDriver();



    }
}
