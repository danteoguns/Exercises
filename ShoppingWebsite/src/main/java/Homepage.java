import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    private WebElement searchForm;

    public void searchQuery(){
        searchForm.click();
        searchForm.sendKeys("Dress");
        searchForm.submit();
    }

}
