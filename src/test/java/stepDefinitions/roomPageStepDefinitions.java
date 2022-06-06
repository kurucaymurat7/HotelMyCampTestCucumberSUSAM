package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RoomPage;
import pages.hotelMyCap;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class roomPageStepDefinitions {
    RoomPage roomPage = new RoomPage();
    hotelMyCap hotelMyCapPage = new hotelMyCap();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Then("Kullanici Rooms linkine tiklar")
    public void kullanici_rooms_linkine_tiklar() {
        hotelMyCapPage.roomsLink.click();
    }
    @Then("Rooms basliginin visibled oldugunu gorur")
    public void rooms_basliginin_visibled_oldugunu_gorur() {
        Assert.assertTrue(roomPage.sayfaBasligiElementi.isDisplayed());
    }
    @Then("Advance Search basliginin visibled oldugunu gorur")
    public void advance_search_basliginin_visibled_oldugunu_gorur() {
        Assert.assertTrue(roomPage.advanceSearchBaslik.isDisplayed());
    }
    @Then("Advance Search form elemanlarini gorur")
    public void advance_search_form_elemanlarini_gorur() {
        Assert.assertEquals(Integer.parseInt(ConfigReader.getProperty("advanceSearchFormElemanSayisi")),roomPage.advanceSearchFormElemanlari.size());
    }
    @Then("RoomType seceneklerini gorur")
    public void room_type_seceneklerini_gorur() {
        Select select = new Select(roomPage.roomTypeDdm);
        Assert.assertEquals(10,select.getOptions().size());
    }
    @Then("AdultCount seceneklerini gorur")
    public void adult_count_seceneklerini_gorur() {
        Select select = new Select(roomPage.adultCountDdm);
        Assert.assertEquals(8,select.getOptions().size());
    }
    @Then("Children seceneklerini gorur")
    public void children_seceneklerini_gorur() {
        Select select = new Select(roomPage.childrenCountDdm);
        Assert.assertEquals(9,select.getOptions().size());
    }
    @Then("Location kutusunun enabled oldugunu gorur")
    public void location_kutusunun_enabled_oldugunu_gorur() {
        Assert.assertTrue(roomPage.locationElement.isEnabled());
    }
    @Then("Advance Search bolumunun altinda Categories bolumunu gorur")
    public void advance_search_bolumunun_altinda_categories_bolumunu_gorur() {
        Assert.assertTrue(roomPage.locationElement.getLocation().getY()<roomPage.categoriesSection.getLocation().getY());
    }
    @Then("Categories bolumunde RoomTypelari gorur")
    public void categories_bolumunde_room_typelari_gorur() {
        //List<String> categoriesRoomType =  new ArrayList<>();
        //roomPage.categoriesElemanlari.forEach(t-> categoriesRoomType.add(t.getText()));

        //Select select = new Select(roomPage.roomTypeDdm);
        //List<String> advanceSearchRoomType =  new ArrayList<>();
        //select.getOptions().forEach(t-> advanceSearchRoomType.add(t.getText()));

        //System.out.println("categories => "+ categoriesRoomType);
        //System.out.println("advanceSearch => "+ advanceSearchRoomType);
        //Assert.assertTrue(categoriesRoomType.containsAll(advanceSearchRoomType));

    }
    @Then("Categories bolumunun altinda Recent Blog bolumunu gorur")
    public void categories_bolumunun_altinda_recent_blog_bolumunu_gorur() {
        Assert.assertTrue(roomPage.categoriesSection.getLocation().getY()<roomPage.recentBlogElement.getLocation().getY());
    }
    @Then("Recent Blog altindaki linkleri gorur")
    public void recent_blog_altindaki_linkleri_gorur() {
        //System.out.println("recent blog size "+roomPage.recentBlogElemanlari.size());
        //for (WebElement each: roomPage.recentBlogElemanlari){
        //    System.out.println(each.getText());
        //    System.out.println(each.isDisplayed());
        //    //Assert.assertTrue(each.isDisplayed());
        //}

    }
    @Then("Tag Cloud bolumunu gorur")
    public void tag_cloud_bolumunu_gorur() {
        Driver.getDriver().switchTo().frame(roomPage.tagCloudIframe);
        Assert.assertTrue(roomPage.tagCloudBaslik.isDisplayed());
    }
    @Then("Tag Cloud altindaki linkleri gorur")
    public void tag_cloud_altindaki_linkleri_gorur() {
        List<String> tagCloudLink = new ArrayList<>();
        roomPage.tagCloudElemanlari.forEach(t-> tagCloudLink.add(t.getText()));
        List<String> expectedTagCLoudLink =  new ArrayList<>(Arrays.asList(ConfigReader.getProperty("tagCLoudElemanlari").split(",")));
        Assert.assertTrue(tagCloudLink.containsAll(expectedTagCLoudLink));
    }
}
