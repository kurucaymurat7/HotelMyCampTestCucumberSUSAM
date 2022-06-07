package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import pages.HotelMyCap;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCapStepDefinitions {
    HotelMyCap hotelMyCap = new HotelMyCap();

    @Given("Kullanici HotelMyCap website gider")
    public void kullanici_hotel_my_cap_website_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCapUrl"));
    }

    @Given("Home linkinin visibled and enabled oldugunu gorur")
    public void home_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.homeLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.homeLink.isEnabled());
    }

    @Given("Rooms linkinin visibled and enabled oldugunu gorur")
    public void rooms_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.roomsLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.roomsLink.isEnabled());
    }

    @Given("Resturant linkinin visibled and enabled oldugunu gorur")
    public void resturant_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.restaurantLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.restaurantLink.isEnabled());
    }

    @Given("About linkinin visibled and enabled oldugunu gorur")
    public void about_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.aboutLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.aboutLink.isEnabled());
    }

    @Given("Blog linkinin visibled and enabled oldugunu gorur")
    public void blog_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.blogLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.blogLink.isEnabled());
    }

    @Given("Contact linkinin visibled and enabled oldugunu gorur")
    public void contact_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.contactLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.contactLink.isEnabled());
    }

    @Given("Login linkinin visibled and enabled oldugunu gorur")
    public void login_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.loginLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.loginLink.isEnabled());
    }

    @And("“OurRestaurant” basliginin gorunur oldugu test edilir")
    public void ourrestaurantBasligininGorunurOlduguTestEdilir() {

        Assert.assertTrue(hotelMyCap.ourRestourantYazisi.isDisplayed());

    }

    @And("Sol tarafta resmin gorunur oldugu test edilir")
    public void solTaraftaResminGorunurOlduguTestEdilir() {
        Assert.assertTrue(hotelMyCap.solTaraftakiResim.isDisplayed());

    }

    @And("Resmin saginda aciklamalar bolumunun yer aldigi test edilir")
    public void resminSagindaAciklamalarBolumununYerAldigiTestEdilir() {
        Assert.assertTrue(hotelMyCap.resminSagindakiAciklama.isDisplayed());

    }

    @And("Restourant sayfasina gider")
    public void restourantSayfasinaGider() {
        hotelMyCap.restourantSayfasiLinki.click();

    }

    @And("Menu altinda iki sutun bulundugunu ve her sutun altinda dorder element oldugu test edilir")
    public void menuAltindaIkiSutunBulundugunuVeHerSutunAltindaDorderElementOlduguTestEdilir() {

        Assert.assertEquals(2, hotelMyCap.restourantMenuSutunList.size());
        Assert.assertEquals(4, hotelMyCap.restourantMenuBirinciSutunList.size());
        Assert.assertEquals(4, hotelMyCap.restourantMenuIkinciSutunList.size());


    }

    @And("“Ultimate Overload” altinda “Ham & Pineapple” ustunde “Grilled Beef with potatoes” oldugu test edilir")
    public void ultimateOverloadAltindaHamPineappleUstundeGrilledBeefWithPotatoesOlduguTestEdilir() {
        int overLoadElementiYeri = hotelMyCap.overLoadElementi.getLocation().getY();
        int hamAppleElementiYeri = hotelMyCap.hamPineAppleElementi.getLocation().getY();
        int grilledBeefElementiYeri = hotelMyCap.grilledBeefElementi.getLocation().getY();
        Assert.assertTrue(overLoadElementiYeri < hamAppleElementiYeri && overLoadElementiYeri > grilledBeefElementiYeri);


    }

    @And("Yemek resimleri sliderinin gorundugu test edilir")
    public void yemekResimleriSliderininGorunduguTestEdilir() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",hotelMyCap.yemekResimleriSecimButonlariList.get(0));
        Assert.assertTrue(hotelMyCap.yemekResimleriSlideri.isDisplayed());
    }

    @And("sag ve sol yon tuslarinin enable oldugu test edilir")
    public void sagVeSolYonTuslarininEnableOlduguTestEdilir() {
        Assert.assertTrue(hotelMyCap.yemekSlideriGeriButonu.isEnabled());
        Assert.assertTrue(hotelMyCap.yemekSlideriIleriButonu.isEnabled());
    }

    @And("resimlerin altinda dort adet butonun enable oldugu test edilir")
    public void resimlerinAltindaDortAdetButonunEnableOlduguTestEdilir() {
        hotelMyCap.yemekResimleriSecimButonlariList.stream().forEach(t->Assert.assertTrue(t.isEnabled()));
    }

    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici login sayfasina gider")
    public void kullaniciLoginSayfasinaGider() {
        kullanici_hotel_my_cap_website_gider();
        hotelMyCap.ilkLoginButonu.click();
    }

    @And("Login basliginin gorunur oldugu test edilir")
    public void loginBasligininGorunurOlduguTestEdilir() {
        Assert.assertTrue(hotelMyCap.loginBasligi.isDisplayed());
    }

    @And("Login ve Create a new account butonlarinin enable oldugu test edilir")
    public void loginVeCreateANewAccountButonlarininEnableOlduguTestEdilir() {
        Assert.assertTrue(hotelMyCap.ikinciLoginButonu.isEnabled());
        Assert.assertTrue(hotelMyCap.createNewAccountButtonu.isEnabled());
    }

    @And("Username ve Password type attribute’larinin text ve password oldugu test edilir")
    public void usernameVePasswordTypeAttributeLarininTextVePasswordOlduguTestEdilir() {
String usernameExpectedTypeAttribute="text";
String passwordExpectedTypeAttribute="password";

String usernameActualTypeAttribute=hotelMyCap.userNameTextBox.getAttribute("type");
String passwordActualTypeAttribute=hotelMyCap.passwordTextBox.getAttribute("type");

Assert.assertEquals(usernameExpectedTypeAttribute,usernameActualTypeAttribute);
Assert.assertEquals(passwordExpectedTypeAttribute,passwordActualTypeAttribute);
    }
}
