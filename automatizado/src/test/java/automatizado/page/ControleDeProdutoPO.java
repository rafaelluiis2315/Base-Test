package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControleDeProdutoPO extends BasePO {

    @FindBy(css = "nav.navbar>div.collapse>ul>li>a.nav-link")
    public WebElement linkDeVoltar;

    @FindBy(css = "div.container>div>Button#btn-adicionar")
    public WebElement buttonAdicionar;
    
    @FindBy(css = "div.modal-content>div.modal-header>h4")
    public WebElement tituloDoCard;

    public ControleDeProdutoPO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
}
