import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
public class FindElementConcepts {
    @Test
    public void elementsTest(){
        open("https://www.amazon.com/");
        ElementsCollection colls = $$(By.tagName("a"));
        System.out.println(colls.size());
        /*for(SelenideElement e: colls) {
            String text = e.getText();
            String onclick = e.getAttribute("href");
            System.out.println(text + " ------- " + onclick);

        }*/
        colls.shouldHave(CollectionCondition.sizeLessThan(300));
        //colls.forEach(e -> System.out.println(e.getText()));
        //colls.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
        colls.last(2).forEach(e -> System.out.println(e.getText()));




    }
}
