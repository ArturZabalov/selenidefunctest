import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class HandleFrameTest {
    @Test
    public void frameTest() throws InterruptedException {
        open("https://allwebco-templates.com/support/S_script_IFrame.htm");
        Thread.sleep(5000);
        switchTo().frame($(By.xpath("//iframe[@name='Framename' and @class='framesample framesample2']")));
        $(By.xpath("//img[@alt='Search']")).click();
        $(By.xpath("(//input[@name='terms'])[2]")).sendKeys("testing");
        $(By.name("submitbutton")).click();
        switchTo().defaultContent();
        String textSpan = $(By.xpath("//span[text()='Sample website in an IFrame page']")).getText();
        System.out.println(textSpan);


        Thread.sleep(5000);


    }
}
