package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.Driver;

import java.util.List;

public class HotelMyCap {
    public HotelMyCap() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//*[text()='Rooms']")
    public WebElement roomsLink;

    @FindBy(xpath = "//*[text()='Restaurant']")
    public WebElement restaurantLink;

    @FindBy(xpath = "//*[text()='About']")
    public WebElement aboutLink;

    @FindBy(xpath = "//*[text()='Blog']")
    public WebElement blogLink;

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement contactLink;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginLink;


    @FindBy(tagName = "h1")
    public WebElement ourRestourantYazisi;

    @FindBy(xpath = "//div[@style='background-image: url(/siteTemplate/images/about.jpg);']")
    public WebElement solTaraftakiResim;

    @FindBy (xpath = "//div[@class='col-md-7 py-5 wrap-about pb-md-5 ftco-animate fadeInUp ftco-animated']")
    public  WebElement resminSagindakiAciklama;

    @FindBy (id = "navRestaurant")
    public WebElement restourantSayfasiLinki;

    @FindBy (xpath = "//div[@class='col-md-6']")
    public List<WebElement> restourantMenuSutunList;

    @FindBy(xpath = "(//div[@class='col-md-6'])[1]//h3")
    public List<WebElement> restourantMenuBirinciSutunList;

    @FindBy(xpath = "(//div[@class='col-md-6'])[1]//h3")
    public List<WebElement> restourantMenuIkinciSutunList;

    @FindBy(xpath = "(//h3)[6]")
    public WebElement overLoadElementi;

    @FindBy(xpath = "(//h3)[8]")
    public WebElement hamPineAppleElementi;

    @FindBy(xpath = "(//h3)[5]")
    public WebElement grilledBeefElementi;

    @FindBy(xpath = "//div[@class='col-md-12 ftco-animate fadeInUp ftco-animated']")
    public WebElement yemekResimleriSlideri;

    @FindBy(xpath = "//button[@class='owl-prev']")
    public WebElement yemekSlideriGeriButonu;

    @FindBy(xpath = "//button[@class='owl-next']")
    public WebElement yemekSlideriIleriButonu;

    @FindBy(xpath = "//button[@role='button']")
    public List<WebElement> yemekResimleriSecimButonlariList;

    @FindBy (xpath = "//li[@id='navLogon']")
    public WebElement ilkLoginButonu;

    @FindBy(tagName = "h1")
    public WebElement loginBasligi;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginButonu;

    @FindBy (xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public WebElement createNewAccountButtonu;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passwordTextBox;
}
