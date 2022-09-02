package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizado.page.GooglePO;


@FixMethodOrder(MethodSorters.NAME_ASCENDING) /*metodo para ordenar os testes(NomeTexte1, NomeTeste2) */
public class GoogleTest extends BaseTest {
    
    private static GooglePO googlePage;

    @BeforeClass
    public static void preparartest(){
        googlePage = new GooglePO(driver); 
    }

    @Test
    public void pesquisarGoogle1(){
        googlePage.inputPesquisa.clear();
       googlePage.inputPesquisa.sendKeys("Batata frita" + Keys.ENTER);
       googlePage.inputPesquisa.clear();
       String resultado =googlePage.divResultadoPesquisa.getText();


       assertTrue(resultado, resultado.contains("Aproximadamente"));
       System.out.println(resultado);

    }

    @Test
    public void pesquisarGoogle2(){

        googlePage.inputPesquisa.clear();
        googlePage.inputPesquisa.sendKeys("Pudim" + Keys.ENTER);
        googlePage.inputPesquisa.clear();
        
        String resultado =googlePage.divResultadoPesquisa.getText();
 
 
        assertTrue(resultado, resultado.contains("Aproximadamente"));
        System.out.println(resultado);

    }
}
