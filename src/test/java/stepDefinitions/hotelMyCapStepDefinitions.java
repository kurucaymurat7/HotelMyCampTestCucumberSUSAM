package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.hotelMyCap;
import utilities.ConfigReader;
import utilities.Driver;

public class hotelMyCapStepDefinitions {
    static hotelMyCap hotelMyCap = new hotelMyCap();

    @Given("Kullanici HotelMyCap website gider")
    public void kullanici_hotel_my_cap_website_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCapUrl"));
    }
    @And("Home linkinin visibled and enabled oldugunu gorur")
    public void home_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.homeLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.homeLink.isEnabled());
    }
    @And("Rooms linkinin visibled and enabled oldugunu gorur")
    public void rooms_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.roomsLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.roomsLink.isEnabled());
    }
    @And("Resturant linkinin visibled and enabled oldugunu gorur")
    public void resturant_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.restaurantLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.restaurantLink.isEnabled());
    }
    @And("About linkinin visibled and enabled oldugunu gorur")
    public void about_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.aboutLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.aboutLink.isEnabled());
    }
    @And("Blog linkinin visibled and enabled oldugunu gorur")
    public void blog_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.blogLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.blogLink.isEnabled());
    }
    @And("Contact linkinin visibled and enabled oldugunu gorur")
    public void contact_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.contactLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.contactLink.isEnabled());
    }
    @And("Login linkinin visibled and enabled oldugunu gorur")
    public void login_linkinin_visibled_and_enabled_oldugunu_gorur() {
        Assert.assertTrue(hotelMyCap.loginLink.isDisplayed());
        Assert.assertTrue(hotelMyCap.loginLink.isEnabled());
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

}