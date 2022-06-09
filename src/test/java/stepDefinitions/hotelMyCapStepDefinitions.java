package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HotelMyCap;

import utilities.ConfigReader;
import utilities.Driver;

public class hotelMyCapStepDefinitions {
    HotelMyCap hotelMyCap = new HotelMyCap();

    @Given("Kullanici HotelMyCap website gider")
    public void kullanici_hotel_my_cap_website_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCapUrl"));
    }
    @Given("Home " +
            " visibled and enabled oldugunu gorur")
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
}
