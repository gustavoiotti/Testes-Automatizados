/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumleanpages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * 
 * @author gustavoiotti
 */
public class LoginPage {
    
    WebDriver driver;
    
    By username = By.name("login");
    By password = By.name("senha");
    By lbutton = By.xpath("//*[@id=\"form-login\"]/div/button");
    By documento = By.name("documento");
    By cep = By.name("codigoPostal");
    By register = By.xpath("//*[@id=\"form-pre-cadastro\"]/div/button");
    
    By msgerror = By.xpath("/html/body/div[1]/div/section[1]/div/div/div[1]/form/div/div[2]/ul/li");
    By msgerror1 = By.xpath("/html/body/div[1]/div/section[1]/div/div/div[1]/form/div/div[1]/ul/li");
    By msgerror2 = By.xpath("/html/body/div[1]/div/section[1]/div/div/div[2]/form/div/div[1]/ul/li");
    By msgerror3 = By.xpath("/html/body/div[1]/div/section[1]/div/div/div[2]/form/div/div[2]/ul/li");
    
    By fpass = By.xpath("/html/body/div[1]/div/section[1]/div/div/div[1]/form/div/label[2]/a");
    By email = By.name("email");
    By confirm = By.xpath("/html/body/div[1]/section/div/div/div/form/div/button");
    By msgemail = By.xpath("/html/body/div[1]/section/div/div/div/form/div/div/ul/li");
    By options = By.xpath("/html/body/div[2]/header/nav/div[6]/div/div/ul/li[1]/a");
    By tests = By.xpath("/html/body/div[2]/header/nav/div[6]/div/div/ul/li[1]/div/div/div/ul/li[5]/a");
    
    By coptions = By.xpath("/html/body/div[2]/header/nav/div[5]/div/div[1]/button");
    By cdepart = By.xpath("/html/body/div[2]/header/nav/div[1]/div[1]/div[2]/div[1]/h4/a");
    By ctests = By.xpath("/html/body/div[2]/header/nav/div[1]/div[1]/div[2]/div[2]/div/ul/li[5]/div/div[1]/h4/a[1]");
    
    By qtd = By.xpath("/html/body/div[2]/section[1]/div/div/div[2]/div/div[2]/div[3]/input");
    By buy = By.xpath("/html/body/div[2]/section[1]/div/div/div[2]/div/div[2]/form/button");
    By concep = By.xpath("/html/body/div[2]/section[1]/div/div/div[2]/div/div[2]/div[7]/form/div/div[1]/input");
    By concepbutton = By.xpath("/html/body/div[2]/section[1]/div/div/div[2]/div/div[2]/div[7]/form/div/div[2]/button");
    
    By eletr = By.xpath("/html/body/div[2]/header/nav/div[6]/div/div/ul/li[5]/a");
    By pdt1 = By.xpath("/html/body/div[2]/section[1]/div[2]/div/form/div[2]/div/div[3]/div/div/div/div[8]/div");
    By msgqtd = By.xpath("/html/body/div[2]/section[1]/div/div/div[2]/div/div[2]/div[7]/span");
    
    
    
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }   
    
    public void typeUsername(){
        driver.findElement(username).sendKeys("22222222");
    }
    
    public void typePassword(){
        driver.findElement(password).sendKeys("senha01");
    }
    
    public void clickLoginButton(){
        driver.findElement(lbutton).click();
    }
    
    public void typeDocument(){
        driver.findElement(documento).sendKeys("11111111111");
    }
    
    public void typeCep(){
        driver.findElement(cep).sendKeys("12345678");
    }
    
    public void clickRegisterButton(){
        driver.findElement(register).click();
    }
    
    public void blankArea(){
        
        String text = driver.findElement(msgerror).getText();
        assertEquals("campo obrigatório.", text);

        /**
        * 
        String error = driver.findElement(msgerror).getText();        
        String experror = "campo obrigatório.";        
        Assert.assertEquals(error, experror);
        *
        **/
    }
    
    public void blankArea1(){
        
        String text = driver.findElement(msgerror1).getText();
        assertEquals("campo obrigatório.", text);

    }
    
    public void blankArea2(){
        
        String text = driver.findElement(msgerror2).getText();
        assertEquals("campo obrigatório.", text);

    }
    
    public void blankArea3(){
        
        String text = driver.findElement(msgerror3).getText();
        assertEquals("campo obrigatório.", text);

    }
    
    public void clickFPass(){
       driver.findElement(fpass).click();
    }
    
    public void typeEmail(){
        driver.findElement(email).sendKeys("0000000");
        
    }
    
    public void typeEmail2(){
        driver.findElement(email).sendKeys("email@email.com");
    }
    
    public void clickConf(){
        driver.findElement(confirm).click();
    }
    
    public void msgErrorEmail(){
        String msg1 = driver.findElement(msgemail).getText();
        assertEquals("email inválido.", msg1);
    }
    
    public void copc(){
        driver.findElement(coptions).click();
    }
    
    public void cdep(){
        driver.findElement(cdepart).click();
    }
    
    public void ctestop(){
        driver.findElement(ctests).click();
    }
    
    public void opc(){
        driver.findElement(options).click();
    }
    
    public void testop(){
        driver.findElement(tests).click();
    }
    
    public void quant(){
        driver.findElement(qtd).sendKeys("99999");
    }
    
    public void quant0(){
        driver.findElement(qtd).clear();
    }
    
    public void buy(){
        driver.findElement(buy).click();
    }
    
    public void conscep(){
        driver.findElement(concep).sendKeys("09876543");
    }
    
    public void ok(){
        driver.findElement(concepbutton).click();
    }
    
    public void eletronic(){
        driver.findElement(eletr).click();
    }
    
    public void cel(){
        driver.findElement(pdt1).click();
    }
    
    public void msgqtd(){
        String msg2 = driver.findElement(msgqtd).getText();
        assertEquals("Disponível em estoque", msg2);
    }
    
}
