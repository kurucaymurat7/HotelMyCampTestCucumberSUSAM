package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
<<<<<<< HEAD

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HotelMyCap;
=======
import org.openqa.selenium.WebElement;
import pages.hotelMyCap;
>>>>>>> e00fd7f0fdcb20f48b31623790142baf05cc2cbe
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.*;

import static org.openqa.selenium.Keys.*;
import java.time.Duration;





public class HotelMyCapStepDefinitions {
    public static String roomType;
    HotelMyCap hotelMyCap = new HotelMyCap();
    WebDriverWait wait;
    JavascriptExecutor jse;
    Actions actions;


    @Given("Kullanici HotelMyCap website gider")
    public void kullanici_hotel_my_cap_website_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCapUrl"));
    }
<<<<<<< HEAD


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
=======
    @Given("About linkinin visibled and enabled oldugunu gorur")
    public void about_linkinin() {
        hotelMyCap.aboutLink.click();
        Assert.assertTrue(hotelMyCap.aboutBaslik.isDisplayed());
        Assert.assertTrue(hotelMyCap.aboutVideo.isDisplayed());
        Assert.assertTrue(hotelMyCap.aboutAciklama.isDisplayed());
    }
    @Given("Blog linkinin baslik ve link testi")
    public void blog_linkinin() {
        hotelMyCap.blogLink.click();
        Assert.assertTrue(hotelMyCap.blogBaslik.isDisplayed());
        Assert.assertTrue(hotelMyCap.blogLinks.size() == 6);
        for (WebElement blogcuk : hotelMyCap.blogLinks) {
            Assert.assertTrue(blogcuk.isEnabled());
        }
    }
    @Given("Contact linkinin gorunurlugu ve contactForm sayi testi")
    public void contact_linkinin() {
        hotelMyCap.contactLink.click();
        Assert.assertTrue(hotelMyCap.contactBaslik.isDisplayed());
        Assert.assertTrue(hotelMyCap.contakFormlar.size() == 6);
        for (WebElement kontaklar : hotelMyCap.contakFormlar) {
            Assert.assertTrue(kontaklar.isEnabled());
        }
>>>>>>> e00fd7f0fdcb20f48b31623790142baf05cc2cbe
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
        js.executeScript("arguments[0].scrollIntoView(true);", hotelMyCap.yemekResimleriSecimButonlariList.get(0));
        Assert.assertTrue(hotelMyCap.yemekResimleriSlideri.isDisplayed());
    }

    @And("sag ve sol yon tuslarinin enable oldugu test edilir")
    public void sagVeSolYonTuslarininEnableOlduguTestEdilir() {
        Assert.assertTrue(hotelMyCap.yemekSlideriGeriButonu.isEnabled());
        Assert.assertTrue(hotelMyCap.yemekSlideriIleriButonu.isEnabled());
    }

    @And("resimlerin altinda dort adet butonun enable oldugu test edilir")
    public void resimlerinAltindaDortAdetButonunEnableOlduguTestEdilir() {
        hotelMyCap.yemekResimleriSecimButonlariList.stream().forEach(t -> Assert.assertTrue(t.isEnabled()));
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
        String usernameExpectedTypeAttribute = "text";
        String passwordExpectedTypeAttribute = "password";
        System.out.println("Erkam Cok uslu");
        String usernameActualTypeAttribute = hotelMyCap.userNameTextBox.getAttribute("type");
        String passwordActualTypeAttribute = hotelMyCap.passwordTextBox.getAttribute("type");

        Assert.assertEquals(usernameExpectedTypeAttribute, usernameActualTypeAttribute);
        Assert.assertEquals(passwordExpectedTypeAttribute, passwordActualTypeAttribute);
    }

    @And("dort hizmetin yanyana ve gorunur oldugunu test eder")
    public void dortHizmetinYanyanaVeGorunurOldugunuTestEder() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript(  "arguments[0].scrollIntoView(true);",hotelMyCap.ourRoomsText);
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(hotelMyCap.hizmetlerList.get(0)));

        hotelMyCap.hizmetlerList.stream().forEach(t->Assert.assertTrue(t.isDisplayed()));
      hotelMyCap.hizmetlerList.stream().forEach(t-> System.out.println(t.getText()));
    }


    @And("Home linkinin gittigi sayfanın title'ının Concort Hotel - Home oldugunu test eder")
    public void homeLinkininGittigiSayfanınTitleInınConcortHotelHomeOldugunuTestEder() {
        hotelMyCap.homeLink.click();
        String expectedTitle = "Concort Hotel - Home";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @And("Rooms linkinin gittigi sayfanın title'ının Concort Hotel - Rooms oldugunu test eder")
    public void roomsLinkininGittigiSayfanınTitleInınConcortHotelRoomsOldugunuTestEder() {
        hotelMyCap.roomsLink.click();
        String expectedTitle = "Concort Hotel - Rooms";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }

    @And("Resturant linkinin gittigi sayfanın Concort Hotel - Content : Our Restaurant oldugunu test eder")
    public void resturantLinkininGittigiSayfanınTitleInınConcortHotelContentOurRestaurantOldugunuTestEder() {
        hotelMyCap.restaurantLink.click();
        String expectedTitle = "Concort Hotel - Content : Our Restaurant";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @Given("About linkinin gittigi sayfanın Concort Hotel - Content : About oldugunu test eder")
    public void about_linkinin_gittigi_sayfanın_concort_hotel_content_about_oldugunu_test_eder() {
        hotelMyCap.aboutLink.click();
        String expectedTitle = "Concort Hotel - Content : About";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @And("Blog linkinin gittigi sayfanın Concort Hotel - Blog oldugunu test eder")
    public void blogLinkininGittigiSayfanınConcortHotelBlogOldugunuTestEder() {
        hotelMyCap.blogLink.click();
        String expectedTitle = "Concort Hotel - Blog";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @And("Contact linkinin gittigi sayfanın Concort Hotel - Contact Form oldugunu test eder")
    public void contactLinkininGittigiSayfanınConcortHotelContactFormOldugunuTestEder() {
        hotelMyCap.contactLink.click();
        String expectedTitle = "Concort Hotel - Contact Form";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @And("Login linkinin gittigi sayfanın Hotelmycamp - Log in oldugunu test eder")
    public void loginLinkininGittigiSayfanınHotelmycampLogInOldugunuTestEder() {
        hotelMyCap.loginLink.click();
        String expectedTitle = "Concort Hotel - Log in";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @Given("Kullanici HotelMyCap Home sekmesine gider")
    public void kullanici_hotel_my_cap_home_sekmesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCapUrl"));
        hotelMyCap.homeLink.click();
    }

    @Given("CheckinDate webelementinin visibled and enabled oldugunu test eder")
    public void checkin_date_webelementinin_visibled_and_enabled_oldugunu_test_eder() {
        Assert.assertTrue(hotelMyCap.checkinDate.isDisplayed() && hotelMyCap.checkinDate.isEnabled());
    }

    @Given("CheckoutDate webelementinin visibled and enabled oldugunu test eder")
    public void checkout_date_webelementinin_visibled_and_enabled_oldugunu_test_eder() {
        Assert.assertTrue(hotelMyCap.checkoutDate.isDisplayed() && hotelMyCap.checkoutDate.isEnabled());
    }

    @Given("Room webelementinin visibled and enabled oldugunu test eder")
    public void room_webelementinin_visibled_and_enabled_oldugunu_test_eder() {
        Assert.assertTrue(hotelMyCap.room.isDisplayed() && hotelMyCap.room.isEnabled());
    }

    @Given("Customer webelementinin visibled and enabled oldugunu test eder")
    public void customer_webelementinin_visibled_and_enabled_oldugunu_test_eder() {
        Assert.assertTrue(hotelMyCap.customer.isDisplayed() && hotelMyCap.customer.isEnabled());
    }

    @And("checkinDate girer checkoutDate Girer")
    public void checkindateGirerCheckoutDateGirer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(hotelMyCap.checkinDateTextBox)
                .sendKeys("6/12/2022" + TAB)
                .sendKeys("6/15/2022").perform();
    }

    @And("room bilgisi girer")
    public void roomBilgisiGirer() {
        Select roomSelect = new Select(hotelMyCap.roomDropDown);
        roomSelect.selectByVisibleText("Single");
        roomType = roomSelect.getFirstSelectedOption().getText();
    }

    @And("customer bilgisi girer")
    public void customerBilgisiGirer() {
        Select customerSelect = new Select(hotelMyCap.adultDropDown);
        customerSelect.selectByVisibleText("1 Adult");
    }

    @Then("checkAvailability butonuna tiklar")
    public void checkavailabilityButonunaTiklar() {
        hotelMyCap.checkAvailability.click();
    }

    @And("Cikan ilk odanin isminin kaydedilen room bilgisini icerdiği test edilir")
    public void cikanIlkOdaninIsmininKaydedilenRoomBilgisiniIcerdiğiTestEdilir() {
        String actualOdaType = hotelMyCap.cikanIlkOda.getText();
        Assert.assertTrue(actualOdaType.contains(roomType));
    }

    @And("Categories altindaki secenegin room bilgisi icerdigi test edilir")
    public void categoriesAltindakiSeceneginRoomBilgisiIcerdigiTestEdilir() {
        jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", hotelMyCap.categoriesAltındakiIlkSecenek);
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(hotelMyCap.categoriesAltındakiIlkSecenek));
        String actualText = hotelMyCap.categoriesAltındakiIlkSecenek.getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains(roomType));
    }

    @And("Anasayfa slider’da iki adet Carousel oldugunu,ilkinde Welcome To Hotelmycamp ve ikincisinde Enjoy A Luxury Experience yadigi test edilir")
    public void anasayfaSliderDaIkiAdetCarouselOldugunuIlkindeWelcomeToHotelmycampVeIkincisindeEnjoyALuxuryExperienceYadigiTestEdilir() {
        List<String> carouselsTextList = new ArrayList<>();

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!carouselsTextList.contains(hotelMyCap.carousel.getText())) {
                carouselsTextList.add(hotelMyCap.carousel.getText());
            } else
                break;
        }

        Assert.assertTrue(carouselsTextList.size()==2);
        Assert.assertTrue(carouselsTextList.get(0).contains("Welcome To Concort Hotel") || carouselsTextList.get(0).contains("Enjoy A Luxury Experience"));
        Assert.assertTrue(carouselsTextList.get(1).contains("Welcome To Concort Hotel") || carouselsTextList.get(1).contains("Enjoy A Luxury Experience"));
    }

    @And("Sliderda yönlendirme butonlarinin calisip calismadigi test edilir")
    public void sliderdaYönlendirmeButonlarininCalisipCalismadigiTestEdilir() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        Assert.assertTrue(hotelMyCap.arrowButton.isEnabled());
    }

    @And("YirmiBes Front Desk Restaurant Bar Transfer Services Spa Suites textlerin gorunur ve yan yana olduğu test edilir")
    public void yirmibesFrontDeskRestaurantBarTransferServicesSpaSuitesTextlerinGorunurVeYanYanaOlduğuTestEdilir() {
        jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(  "arguments[0].scrollIntoView(true);",hotelMyCap.RestaurantBar);
        wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(hotelMyCap.hizmetlerList.get(0)));

        hotelMyCap.hizmetlerList.stream().forEach(t->Assert.assertTrue(t.isDisplayed()));
        hotelMyCap.hizmetlerList.stream().forEach(t-> System.out.println(t.getText()));
    }

    @And("Anasayfa Our Rooms bolumunde gösterilen seçeneklere tiklanir ve gidilen sayfa URL’sinin RoomDetail içerdiği test edilir")
    public void anasayfaOurRoomsBolumundeGösterilenSeçeneklereTiklanirVeGidilenSayfaURLSininRoomDetailIçerdiğiTestEdilir() {
        for (int i = 0; i < hotelMyCap.viewRoomDetailsList.size(); i++) {
            hotelMyCap.viewRoomDetailsList.get(0).click();
            String expectedURL = "RoomDetail";
            String actualURL = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(actualURL.contains(expectedURL));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Driver.getDriver().navigate().back();
        }
    }

    @And("Guests sliderinda bes adet Carousel olduğu ve hepsinin isminin Nathan Smith olduğu test edilir")
    public void guestsSliderindaBesAdetCarouselOlduğuVeHepsininIsmininNathanSmithOlduğuTestEdilir() {
        Assert.assertTrue(hotelMyCap.testimonialsCarouselList.size()==5);
        for (int i = 0; i < hotelMyCap.testimonialsCarouselList.size(); i++) {
            Assert.assertTrue(hotelMyCap.testimonialsCarouselList.get(0).getText().contains("Nathan Smith"));
        }
    }

    @And("Recent Blog bolumunun gorunur olduğu ve tiklanir olduğu test edilir")
    public void recentBlogBolumununGorunurOlduğuVeTiklanirOlduğuTestEdilir() {
        ReusableMethods.scroolDown(hotelMyCap.recentBlogSection);
        Assert.assertTrue(hotelMyCap.recentBlogSection.isDisplayed());
    }

    @And("Instagram yazisinin gorunur olduğu ve resimlerin tiklanir olduğu test edilir")
    public void ınstagramYazisininGorunurOlduğuVeResimlerinTiklanirOlduğuTestEdilir() {
        ReusableMethods.scroolDown(hotelMyCap.instagramYazisi);
        Assert.assertTrue(hotelMyCap.instagramYazisi.isDisplayed());
        for (WebElement each:hotelMyCap.instagramResimlerList) {
            each.click();
            ReusableMethods.waitFor(3);
            actions = new Actions(Driver.getDriver());
            actions.sendKeys(ESCAPE).perform();
        }
    }

    @And("Footer bolumunde dort adet kolon olduğu ve basliklarinin Hotelmycamp, Useful Links, Privacy, Have Questions olduğu test edilir")
    public void footerBolumundeDortAdetKolonOlduğuVeBasliklarininHotelmycampUsefulLinksPrivacyHaveQuestionsOlduğuTestEdilir() {
        ReusableMethods.scroolDown(hotelMyCap.footerList.get(0));
        List<String> expectedFooterTextList = new ArrayList<>(Arrays.asList("Concort Hotel", "Useful Links", "Privacy", "Have a Questions?"));
        List<String> actualFooterTextList = new ArrayList<>();
        for (int i = 0; i < hotelMyCap.footerList.size(); i++) {
            actualFooterTextList.add(i, hotelMyCap.footerList.get(i).getText());
        }
        Collections.sort(expectedFooterTextList);
        Collections.sort(actualFooterTextList);
        Assert.assertTrue(actualFooterTextList.size()==4);
        Assert.assertEquals(actualFooterTextList, expectedFooterTextList);
    }
}

