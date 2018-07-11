import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    private WebElement searchForm;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    private WebElement yellowDress;

    @FindBy (xpath = "//*[@id=\"add_to_cart\"]/button/span")
    private WebElement addToCart;

    @FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    private WebElement proceedToCheckout;

    public void searchQuery(){
        searchForm.click();
        searchForm.sendKeys("Dress");
        searchForm.submit();
        yellowDress.click();
    }

//    public void toCheckout(){
//        addToCart.click();
//        proceedToCheckout.click();
//    }



}
