package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HotelMyCap {
    public HotelMyCap() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[text()='Home']")
    public WebElement homeLink;

    @FindBy (xpath = "//*[text()='Rooms']")
    public WebElement roomsLink;

    @FindBy (xpath = "//*[text()='Restaurant']")
    public WebElement restaurantLink;

    @FindBy (xpath = "//*[text()='About']")
    public WebElement aboutLink;

    @FindBy (xpath = "//*[text()='Blog']")
    public WebElement blogLink;

    @FindBy (xpath = "//*[text()='Contact']")
    public WebElement contactLink;

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement loginLink;

    @FindBy (xpath = "//*[text()='Check-in Date']")
    public WebElement checkinDate;

    @FindBy (xpath = "//*[text()='Check-out Date']")
    public WebElement checkoutDate;

    @FindBy (xpath = "//*[text()='Room']")
    public WebElement room;

    @FindBy (xpath = "//*[text()='Customer']")
    public WebElement customer;

    @FindBy (xpath = "//input[@class='form-control checkin_date']")
    public WebElement checkinDateTextBox;

    @FindBy (xpath = "//select[@id='IDRoomType']")
    public WebElement roomDropDown;

    @FindBy (xpath = "//select[@id='AdultCount']")
    public WebElement adultDropDown;

    @FindBy (xpath = "//input[@value='Check Availability']")
    public WebElement checkAvailability;

    @FindBy (xpath = "(//h3[@class='mb-3'])[1]")
    public WebElement cikanIlkOda;

    @FindBy (xpath = "//a[@href='/Rooms/6']")
    public WebElement categoriesAltındakiIlkSecenek;

    @FindBy (xpath = "//section[@class='home-slider owl-carousel owl-loaded owl-drag']")
    public WebElement carousel;

    @FindBy (xpath = "//span[@class='ion-md-arrow-back']")
    public WebElement arrowButton;

    @FindBy (xpath = "(//h3[@class='heading mb-3'])[1]")
    public WebElement FrontDest257;

    @FindBy (xpath = "(//h3[@class='heading mb-3'])[2]")
    public WebElement RestaurantBar;

    @FindBy (xpath = "//div[@class='media block-6 services py-4 d-block text-center']")
    public List<WebElement> elementList;

    @FindBy (xpath = "//h3[@class='heading mb-3']")
    public List<WebElement> hizmetlerList;

    @FindBy (xpath = "//a[text()='View Room Details ']")
    public List<WebElement> viewRoomDetailsList;

    @FindBy (xpath = "//div[@class='owl-item']")
    public List<WebElement> testimonialsCarouselList;

    @FindBy (xpath = "//h2[text()='Recent Blog']")
    public WebElement recentBlogSection;

    @FindBy (xpath = "//span[.='Instagram']")
    public WebElement instagramYazisi;

    @FindBy (xpath = "//div[@class='icon d-flex justify-content-center']")
    public List<WebElement> instagramResimlerList;

    @FindBy (xpath = "//h2[@class='ftco-heading-2']")
    public List<WebElement> footerList;
}
