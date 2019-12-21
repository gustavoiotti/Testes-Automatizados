/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumleantests;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumleanpages.LoginPage;

/**
 *
 * @author gustavoiotti
 */
public class SeleniumLeanTest {
    
    @Test //Testa login válido
    public void validLoginTest(){
        
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.typeUsername();
        login.typePassword();
        login.clickLoginButton();
        
        driver.close();
        
        
    }
    
    @Test //Testa novo registro válido
    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.typeDocument();
        login.typeCep();
        login.clickRegisterButton();
        
        driver.close();
    }
    
    @Test // (Mobile) Testa login válido
    public void validMobLoginTest(){
        
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(375, 667));
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.typeUsername();
        login.typePassword();
        login.clickLoginButton();
        
        driver.close();       
        
    } 
    @Test // (Mobile) Testa novo registro válido
    public void validMobRegisterTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(375, 667));
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.typeDocument();
        login.typeCep();
        login.clickRegisterButton();
        
        driver.close();
    }
    
    @Test //Testa campo vazio "Login" Senha vazio
    public void invalidLoginPassTest(){
        
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.typeUsername();
        login.clickLoginButton();
        login.blankArea();
        
        driver.close();
        
        
    }
    
    @Test //Testa campo vazio "Login" Usuário vazio
    public void invalidLoginUserTest(){
        
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.typePassword();
        login.clickLoginButton();
        login.blankArea1();
        
        driver.close();
           
    }
    @Test //Testa campo vazio "Cadastro" Documento vazio
    public void invalidRegisterDocTest(){
        
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
                
        login.typeCep();
        login.clickRegisterButton();
        login.blankArea2();
        
        driver.close();
           
    }
    @Test //Testa campo vazio "Cadastro" CEP vazio
    public void invalidRegisterCepTest(){
        
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.typeDocument();
        login.clickRegisterButton();
        login.blankArea3();
        
        driver.close();
           
    }
    
    @Test //Testa opção "Esqueci a senha" adiciona email inválido
    public void invalidForgorPass(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.clickFPass();
        login.typeEmail();
        login.clickConf();
        
        driver.close();
        
    }
    @Test //Testa opção "Esqueci a senha" adiciona email válido
    public void validForgorPass(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/identificacao");
        
        LoginPage login = new LoginPage(driver);
        
        login.clickFPass();
        login.typeEmail2();
        login.clickConf();
        
        driver.close();
        
    }
    @Test //Navega pelo menu (Opções/Teste)
    public void menuTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/");
        
        LoginPage login = new LoginPage(driver);
        
        login.opc();
        login.testop();
        
        driver.close();
    }
    
    @Test //Navega pelo menu (Menu Eletrônicos/ celular/ limpa quantidade/ add quantidade/ checa msg de disponibilidade)
    public void qtdBuyTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://teste.leancommerce.com.br/");
        
        LoginPage login = new LoginPage(driver);
        
        login.eletronic();
        login.cel();
        login.quant0();
        login.quant();
        login.msgqtd();
        
        driver.close();
    }
    
    @Test // (Mobile) Navega pelo menu (Opções/Departamento e Teste)
    public void mobMenuTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(375, 667));
        
        driver.get("https://teste.leancommerce.com.br/");
        
        LoginPage login = new LoginPage(driver);
        
        login.copc();
        login.cdep();
        login.ctestop();
        
        driver.close();
    }
    
    @Test //(Mobile) Consulta o valor do frete, seleciona a quantidade do produto e clica no botão comprar
    public void mobBuytest(){
        System.setProperty("webdriver.chrome.driver", "/Users/gustavoiotti/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(375, 667));
        
        driver.get("https://teste.leancommerce.com.br/produto-teste-pbi-13036");
        
        LoginPage login = new LoginPage(driver);
        
        login.conscep();
        login.ok();
        login.quant0();
        login.quant();
        login.buy();
        
        driver.close();
    }
    
}
