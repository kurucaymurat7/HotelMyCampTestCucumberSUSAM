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

    @FindBy(tagName = "h1")
    public WebElement loginBasligi;

    @FindBy (xpath = "//li[@id='navLogon']")
    public WebElement ilkLoginButonu;


    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginButonu;

    @FindBy (xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public WebElement createNewAccountButtonu;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//div[@class='media-body p-2 mt-2']")
    public List<WebElement> hizmetlerList;

    @FindBy(xpath = "(//h2[@class='mb-4'])[3]")
    public WebElement ourRoomsText;

    @FindBy (xpath = "//*[text()='Home']")
    public WebElement homeLink1;

    @FindBy (xpath = "//*[text()='Rooms']")
    public WebElement roomsLink1;

    @FindBy (xpath = "//*[text()='Restaurant']")
    public WebElement restaurantLink1;

    @FindBy (xpath = "//*[text()='About']")
    public WebElement aboutLink1;

    @FindBy (xpath = "//*[text()='Blog']")
    public WebElement blogLink1;

    @FindBy (xpath = "//*[text()='Contact']")
    public WebElement contactLink1;

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement loginLink1;

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
    public List<WebElement> hizmetlerList1;

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


    @FindBy (xpath = "//*[text()='About']")
    public WebElement aboutBaslik;

    @FindBy (xpath = "//section[1]/div/div/div[1]")
    public WebElement aboutVideo;

    @FindBy (xpath = "//div[@class='pb-md-5']")
    public WebElement aboutAciklama;




    @FindBy (xpath = "//*[text()='Blog']")
    public WebElement blogBaslik;

    @FindBy(xpath="//section[1]/div/div[2]/div/div/a")
    public List<WebElement> blogLinks;




    @FindBy (xpath = "//*[text()='Contact Form']")
    public WebElement contactBaslik;

    @FindBy (xpath="//div[@class='form-group']")
    public List<WebElement> contakFormlar;

}
