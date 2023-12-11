import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class JsAlertsPopUpHandle {
    @Test
    public void alertTest() throws InterruptedException {
        open("https://mail.rediff.com/cgi-bin/login.cgi");
        $(By.name("proceed")).click();
        Thread.sleep(5000);
        Alert alert = switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Please enter a valid user name");
        alert.accept(); // ok button
        //alert.dismiss(); // not ok button
        alert.sendKeys("test keys");// send keys for JS promt form

    }
}

