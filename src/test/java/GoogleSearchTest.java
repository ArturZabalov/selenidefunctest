import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleSearchTest {
    @Test
    public void googleSearchTest() {
        open("https://www.google.com");
        $(By.name("q")).setValue("Github Selenide").pressEnter();
        //$(By.name("btnK")).click();
        $(By.id("logo")).shouldHave(appear);
        String header = $(By.xpath("//h3[text()='Selenide - Concise UI Tests with Java! - GitHub']")).getText();
        System.out.println("Header " + header);
        Assert.assertEquals(header, "Selenide - Concise UI Tests with Java! - GitHub");
        int headerCount = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        System.out.println("headerCount " + headerCount);
        $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(headerCount));



    }
}
