package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RoomPage {
    public RoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement sayfaBasligiElementi;

    @FindBy(xpath = "//h3[@class='heading mb-4']")
    public WebElement advanceSearchBaslik;

    @FindBy(xpath = "//div[@class='fields']/div[@class='form-group']")
    public List<WebElement> advanceSearchFormElemanlari;

    @FindBy(id = "IDRoomType")
    public WebElement roomTypeDdm;

    @FindBy(id = "AdultCount")
    public WebElement adultCountDdm;

    @FindBy(id = "ChildrenCount")
    public WebElement childrenCountDdm;

    @FindBy(id = "location")
    public WebElement locationElement;

    @FindBy(xpath = "//div[@class='categories']")
    public WebElement categoriesSection;


    @FindBy(xpath = "//section[1]/div/div/div[2]/div[2]/div/li/a")
    public List<WebElement> categoriesElemanlari;

    @FindBy(xpath = "//h3[text()='Recent Blog']")
    public WebElement recentBlogElement;

    @FindBy(xpath = "//section[1]/div/div/div[2]/div[3]/div/div/h3/a")
    public List<WebElement> recentBlogElemanlari;

    @FindBy(xpath = "//iframe[@src='/home/tagcloud']")
    public WebElement tagCloudIframe;

    @FindBy(xpath = "//*[text()='Tag Cloud']")
    public WebElement tagCloudBaslik;

    @FindBy(xpath = "//a[@class= 'tag-cloud-link']")
    public List<WebElement> tagCloudElemanlari;
}
