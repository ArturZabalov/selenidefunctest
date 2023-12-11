import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class FooterList {
    @Test
    public void elementsTest() {
        open("https://www.freshworks.com/");
        ElementsCollection colls = $$(By.xpath("//footer//ul/li/a"));
        System.out.println(colls.size());
        colls.forEach(e -> System.out.println(e.getText()));
        colls.last(5).forEach(e -> System.out.println(e.getText()));
        colls.first(5).forEach(e -> System.out.println(e.getText()));
        List<String> footerTextList = colls.texts();
        footerTextList.forEach(e -> System.out.println(e));


    }
}
