package automatizado.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;

import automatizado.page.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {
    
    private static LoginPO loginPage;

    private String menssageErrorOne = "Informe usuário e senha, os campos não podem ser brancos.";
    private String menssageErrorTwo = "E-mail ou senha inválidos";
    private String emalVazia = "";
    private String senhaVazia = "";
    private String emalErrado = "test";
    private String senhaErrado = "test";
    private String emalCerto = "admin@admin.com";
    private String senhaCerto = "admin@123";

    @BeforeClass
    public static void preparartest(){
        loginPage = new LoginPO(driver); 
    }
    
    @Test
    public void TC_001(){

        loginPage.logarNoSistema(emalVazia, senhaVazia);

        String getMenssageErrorLogin = loginPage.menssage.getText();

        assertEquals(getMenssageErrorLogin, menssageErrorOne);
    
    }

    @Test
    public void TC_002(){
        loginPage.logarNoSistema(emalErrado, senhaVazia);

        String getMenssageErrorLogin = loginPage.menssage.getText();

        assertEquals(getMenssageErrorLogin, menssageErrorOne);
    
    }

    @Test
    public void TC_003(){

        loginPage.logarNoSistema(emalVazia, senhaErrado);

        String getMenssageErrorLogin = loginPage.menssage.getText();

        assertEquals(getMenssageErrorLogin, menssageErrorOne);
    
    }

    @Test
    public void TC_004(){

        loginPage.logarNoSistema(emalErrado, senhaErrado);
        String getMenssageErrorLogin = loginPage.menssage.getText();

        assertEquals(getMenssageErrorLogin, menssageErrorTwo);
    
    }

    @Test
    public void TC_007(){

        loginPage.logarNoSistema(emalCerto, senhaCerto);
        String getTitlePage = driver.getTitle();

        assertEquals(getTitlePage, "Controle de Produtos");
    }

}
