import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
public class CloseBrowser {
    @Test
    public void closeBrowserTest() throws InterruptedException {
        open("https://flyticket.ru/"); // parent = 0
        System.out.println(title());
        $(By.xpath("//img[@alt='powered_by']")).click(); //child = 1
        switchTo().window(1);
        System.out.println(title());
        Thread.sleep(3000);
        closeWindow();
        switchTo().window(0);
        System.out.println(title());
        Thread.sleep(3000);
        closeWebDriver();


    }

}
