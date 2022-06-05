package pages;

import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class hotelMyCap {
    public hotelMyCap() {
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

}
