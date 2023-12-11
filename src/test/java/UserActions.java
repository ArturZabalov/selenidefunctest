import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class UserActions {
    @Test
    public void moveToElement() throws InterruptedException {
        open("https://www.spicejet.com/");
        SelenideElement addOn = $(By.xpath("//div[text()='Add-ons']"));
        actions().moveToElement(addOn).build().perform();
        SelenideElement visaServices = $(By.xpath("//div[text()='Visa Services']"));
        visaServices.click();
        Thread.sleep(5000);
    }
    @Test
    public void dragAndDropTest() throws InterruptedException {
        open("https://jqueryui.com/resources/demos/droppable/default.html");
        SelenideElement sourceEl = $(By.id("draggable"));
        SelenideElement targetEl = $(By.id("droppable"));
        //actions().clickAndHold(sourceEl).moveToElement(targetEl).release().build().perform();
        actions().dragAndDrop(sourceEl, targetEl).build().perform();
        Thread.sleep(5000);
    }
    @Test
    public void rightClickTest() throws InterruptedException {
        open("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        SelenideElement rightClick = $(By.xpath("//span[text()='right click me']"));
        actions().contextClick(rightClick).build().perform();
        Thread.sleep(5000);

    }
}
