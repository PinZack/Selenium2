package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C02_SwitchingWindows extends TestBase {


    @Test

    public void test01(){

        // amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");
        // url'in amazon icerdigini test edin

        String expectectedUrlIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectectedUrlIcerik));

        bekle(2);


        // Yeni bir tab olarak  wise quarter anasayfaya gidin

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.wisequarter.com");


        // title'in Wise icerdigini test edin

        String expectedTitleIcerik = "Wise";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));


        // yeni br window acarak yotube sayfasina gidin

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.youtube.com");
        // url'in youtube icerdigini test edin

        String expectedUrlIcerik = "youtube";
        actualUrl= driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        bekle(3);

        // acilan tum sayfalari kapatin

    }
}
