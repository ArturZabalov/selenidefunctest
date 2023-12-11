import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class NavigationConcepts {
    @Test
    public void navigateTest() throws InterruptedException {
        open("https://www.google.com");
        System.out.println(title());
        open("https://flyticket.ru");
        System.out.println(title());
        back();
        System.out.println(title());
        forward();
        System.out.println(title());
        back();
        System.out.println(title());
        Thread.sleep(5000);
        refresh();



    }
}
