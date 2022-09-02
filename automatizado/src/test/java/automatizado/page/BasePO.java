package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para criacao das novas Pages.
 * Todas as Pages devem ser herdadas desta classe.
*/
public abstract class BasePO {

    /**Drive que sera usado pelas pages */
    protected WebDriver driver;

    /**
     * Construtor base para criacao da fabrica de elemento(PageFactory).
     * @param driver Driver da pagina atual.
     */
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
