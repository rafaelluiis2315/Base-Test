package automatizado.test;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.ControleDeProdutoPO;
import automatizado.page.LoginPO;

public class ControleDeProduto extends BaseTest{
    
    private static LoginPO loginPage;    
    private static ControleDeProdutoPO ControleDeProdutoPage;

    @BeforeClass
    public static void preparartest(){
        
        loginPage = new LoginPO(driver); 
        loginPage.logarNoSistema("admin@admin.com", "admin@123");

        ControleDeProdutoPage = new ControleDeProdutoPO(driver); 
    }

    @Test
    public void TC_001(){
        ControleDeProdutoPage.linkDeVoltar.click();
    }

    @Test
    public void TC_002(){
        ControleDeProdutoPage.buttonAdicionar.click();
        ControleDeProdutoPage.buttonAdicionar.click();

        String titulo = ControleDeProdutoPage.tituloDoCard.getText();

        System.out.println(titulo);

    }
}
