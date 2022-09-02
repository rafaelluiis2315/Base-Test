package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{
    /**
     * input email da tela de login. 
     */
    @FindBy(id = "email")
    public WebElement inputEmail;

    /** 
     * input de senha da tela de login.
     */    

    @FindBy(id = "senha")
    public WebElement inputSenha;

    /**
     * Buttan de entrar da tela de login.
     */
    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;
    
    /**
     * Menssage de error da tela de login.
     */
    @FindBy(id = "mensagem")
    public WebElement menssage;
    
    /**
     * Construtor para criacao da pagina do Google.
     * @param driver Drive da pagina do Google.
     */
    public LoginPO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    public void escrever(WebElement input, String text){
        input.clear();
        input.sendKeys(text);
    }

    public void logarNoSistema( String email, String senha){
        escrever(inputEmail, email);
        escrever(inputSenha, senha);
        buttonEntrar.click();
    }
}
