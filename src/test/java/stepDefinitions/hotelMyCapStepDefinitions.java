package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.hotelMyCap;
import utilities.ConfigReader;
import utilities.Driver;

public class hotelMyCapStepDefinitions {
    hotelMyCap hotelMyCap = new hotelMyCap();

    @Given("Kullanici HotelMyCap website gider")
    public void kullanici_hotel_my_cap_website_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCapUrl"));
    }

    @Given("About linkinin visibled and enabled oldugunu gorur")
    public void about_linkinin_visibled_and_enabled_oldugunu_gorur() {
        hotelMyCap.aboutLink.click();
        Assert.assertTrue(hotelMyCap.aboutBaslik.isDisplayed());
        Assert.assertTrue(hotelMyCap.aboutVideo.isDisplayed());
        Assert.assertTrue(hotelMyCap.aboutAciklama.isDisplayed());
    }
    @Given("Blog linkinin visibled and enabled oldugunu gorur")
    public void blog_linkinin_visibled_and_enabled_oldugunu_gorur() {
        hotelMyCap.blogLink.click();
        Assert.assertTrue(hotelMyCap.blogBaslik.isDisplayed());
        Assert.assertTrue(hotelMyCap.blogLinks.size()==6);
        for (WebElement blogcuk:hotelMyCap.blogLinks) {
            Assert.assertTrue(blogcuk.isEnabled());
        }
    }
    @Given("Contact linkinin visibled and enabled oldugunu gorur")
    public void contact_linkinin_visibled_and_enabled_oldugunu_gorur() {
        hotelMyCap.contactLink.click();
        Assert.assertTrue(hotelMyCap.contactBaslik.isDisplayed());
        Assert.assertTrue(hotelMyCap.contakFormlar.size()==6);
        for (WebElement kontaklar:hotelMyCap.contakFormlar) {
            Assert.assertTrue(kontaklar.isEnabled());
        }
    }
    }

