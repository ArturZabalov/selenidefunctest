import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class SelectDropDownTest {
    @Test
    public void userActions() throws InterruptedException {
        open("https://www.orangehrm.com/30-day-free-trial/");
        //select html tag

        $(By.id("Form_getForm_Country")).selectOption(2);
        Thread.sleep(2000);
        $(By.id("Form_getForm_Country")).selectOption("India");
        Thread.sleep(2000);
        $(By.id("Form_getForm_Country")).selectOptionByValue("France");
        Thread.sleep(2000);

        //without using select html tag
        ElementsCollection coll = $$(By.cssSelector("select")); // непонятно почему не проходит по списку
        System.out.println(coll.size());
        for(SelenideElement e : coll) {
            String text = e.getText();
            System.out.println(text);
            if(text.equals("Angola")) {
                e.click();
                break;
            }
        }
        Thread.sleep(2000);


    }
}
