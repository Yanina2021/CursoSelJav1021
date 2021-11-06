package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjercicioOrangePage { 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();  
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();

		WebElement directory = driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b"));
		directory.click();
		
		WebElement name = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		name.sendKeys("Nathan");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("searchBtn"));
		search.click();
		
		WebElement nathan = driver.findElement(By.xpath ("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b"));
		String message = nathan.getText();
		
		if(message.contains("Nathan Elliot")) {
			System.out.println("El perfil contiene el nombre de Nathan Elliot");		
		}else {
			System.out.println("Error: El perfil no contiene el nombre de Nathan Elliot");
		}
		
		
	}

}
