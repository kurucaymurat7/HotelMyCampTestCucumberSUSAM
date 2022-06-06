package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.RoomPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class roomPage2StepDefinitions {
    RoomPage roomPage = new RoomPage();

    @Given("{string} secer")
    public void oda_secer(String string) {
        ReusableMethods.scrollBy(64450);
        ReusableMethods.waitForVisibility(roomPage.secilenOda,30);
        roomPage.secilenOda.click();
    }
    @Given("Oda resminin visibled oldugunu gorur")
    public void oda_resminin_visibled_oldugunu_gorur() {
        Assert.assertTrue(roomPage.odaResmiElement.isDisplayed());
    }
    @Given("Aciklama bolumu yazilarinin visibled oldugunu gorur")
    public void aciklama_bolumu_yazilarinin_visibled_oldugunu_gorur() {
        ReusableMethods.scrollBy(450);
        ReusableMethods.waitFor(5);
        //roomPage.aciklamaElemanlari.forEach(t-> System.out.println(t.isDisplayed()));
        //roomPage.aciklamaElemanlari.forEach(t-> System.out.println(t.getText()));
        ReusableMethods.assertIsDisplayed(roomPage.aciklamaElemanlari);


    }
    @Given("Onerilen odalarin tiklanir oldugunu gorur")
    public void onerilen_odalarin_tiklanir_oldugunu_gorur() {
        ReusableMethods.scrollBy(1600);
        ReusableMethods.assertIsEnabled(roomPage.onerilenOdalar);
        //roomPage.onerilenOdalar.forEach(t-> System.out.println(t.getText()));
        //roomPage.onerilenOdalar.forEach(t-> System.out.println(t.isDisplayed()));
        //System.out.println("onerilen oda size "+roomPage.onerilenOdalar.size());

    }
    @Given("Categories bolumu altindaki linklerin tiklanir oldugunu gorur")
    public void categories_bolumu_altindaki_linklerin_tiklanir_oldugunu_gorur() {
        ReusableMethods.assertIsEnabled(roomPage.categoriesElemanlari);

    }



}
