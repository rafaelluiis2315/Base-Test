package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;
    /**
     * Construtor para criacao da pagina do Google.
     * @param driver Drive da pagina do Google.
     */
    public GooglePO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
}
