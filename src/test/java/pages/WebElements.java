package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GWD;

public class WebElements extends Metods {

    public WebElements() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[title='Giriş Yap']")
    public WebElement login1;

    @FindBy(id = "login")
    private WebElement login2;

    @FindBy(xpath = "//button[text()='Kabul Et']" )
    private WebElement cookie1;

    @FindBy(xpath = "//input[@id='txtUserName']")
    private WebElement email;

    @FindBy(id = "btnLogin")
    private WebElement login3;

    @FindBy(xpath = "//input[@id='txtPassword']")
    private WebElement sifre;

    @FindBy(id = "btnEmailSelect")
    private WebElement login4;

    @FindBy(xpath = "//span[text()='Nazmiye Akdoğan']")
    private WebElement pageValidation;

    @FindBy(xpath = "//input[@placeholder='Ürün, kategori veya marka ara']")
    private WebElement searchBox;

    @FindBy(xpath = "//div[text()='ARA']")
    private WebElement ara;

    @FindBy(xpath = "//h3[text()='LRsmile Tavşan Detaylı Çanta Seti (Yurt Dışından)']")
    private WebElement canta;

    @FindBy(xpath = "(//button[@class='add-to-basket button small'])[1]")
    private WebElement addToCart1;

    @FindBy(xpath = "(//button[@class='add-to-basket button small'])[2]")
    private WebElement addToCart2;

    @FindBy(xpath = "//a[@class='checkoutui-Modal-2iZXl']")
    private WebElement closeButton;

    @FindBy(xpath = "//button[text()='Sepete git']")
    private WebElement basket;

    @FindBy(xpath = "(//a[text()='LRsmile Tavşan Detaylı Çanta Seti (Yurt Dışından)'])[1]")
    public WebElement checked1;

    @FindBy(xpath = "(//h3[text()='Stanley Klasik Trigger Action Seyahat Bardağı 0.47 LT'])[1]")
    private WebElement termos;

    @FindBy(xpath = "(//a[text()='Stanley Klasik Trigger Action Seyahat Bardağı 0.47 LT'])[1]")
    public  WebElement checked2;


    WebElement myElement;
    public void send(String strElement, String value){
        switch (strElement)
        {
            case "email" : myElement = email; break;
            case "sifre" : myElement = sifre; break;
            case "searchBox" : myElement = searchBox; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void click(String strElement){
        switch (strElement)
        {
            case "cookie1" : myElement = cookie1; break;
            case "login2" : myElement = login2; break;
            case "login3" : myElement = login3; break;
            case "login4" : myElement = login4; break;
            case "ara" : myElement = ara; break;
            case "canta" : myElement = canta; break;
            case "addToCart1" : myElement = addToCart1; break;
            case "addToCart2" : myElement = addToCart2; break;
            case "closeButton" : myElement = closeButton; break;
            case "basket" : myElement = basket; break;
            case "termos" : myElement = termos; break;
        }
        clickFunction(myElement);
    }

    public void check(String strElement, String text){
        switch (strElement)
        {
            case "pageValidation" : myElement =pageValidation; break;
        }
        verifyContainsText(myElement,text);
    }

















}
