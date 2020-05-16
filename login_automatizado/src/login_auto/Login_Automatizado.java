package login_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Automatizado {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver(); //Chamar o chrome
		//site
		driver.get("http:\\virtualif.iftm.edu.br/VRTL/");
		//esperar
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//usuário
		driver.findElement(By.id("usuario")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//senha
		driver.findElement(By.id("senha-desktop")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//clicar em entrar
		driver.findElement(By.id("frm-login-btn-entrar")).click();					


		
	}
}
