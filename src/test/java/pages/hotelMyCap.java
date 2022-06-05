package pages;

import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class hotelMyCap {
    public hotelMyCap() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "(//a[@class='nav-link'])[4]")
    public WebElement aboutLink;

    @FindBy (xpath = "//*[text()='About']")
    public WebElement aboutBaslik;

    @FindBy (xpath = "//section[1]/div/div/div[1]")
    public WebElement aboutVideo;

    @FindBy (xpath = "//div[@class='pb-md-5']")
    public WebElement aboutAciklama;



    @FindBy (xpath = "(//a[@class='nav-link'])[5]")
    public WebElement blogLink;

    @FindBy (xpath = "//*[text()='Blog']")
    public WebElement blogBaslik;

    @FindBy(xpath="//section[1]/div/div[2]/div/div/a")
    public List<WebElement> blogLinks;



    @FindBy (xpath = "(//a[@class='nav-link'])[6]")
    public WebElement contactLink;

    @FindBy (xpath = "//*[text()='Contact Form']")
    public WebElement contactBaslik;

    @FindBy (xpath="//div[@class='form-group']")
    public List<WebElement> contakFormlar;

}
