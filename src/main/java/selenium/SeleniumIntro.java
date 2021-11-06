package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); //Maximizar ventana
		
		//Obteniendo objetos/ webelements de la pagina
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		
		//Obtener el titulo de la pagina
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validacion de la URL
		String urlActual = driver.getCurrentUrl();
		System.out.println("La URL actual es : " + urlActual);
		
		//Metodos de navegacion
//driver.navigate().back();
//Thread.sleep(2000);
//driver.navigate().forward();
//Thread.sleep(2000);
// iver.navigate().refresh(); 
		
		WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
		assignLeaveBtn.click();
		
		//Borrar texto en textbox
		WebElement employeeNameTxt = driver.findElement(By.id("assignleave_txtEmployee_empName"));
		employeeNameTxt.sendKeys("Marcial Rivera");
		Thread.sleep(2000);
		employeeNameTxt.clear();
		
		//Verificar que un elemento desplegado en la pagina 
		WebElement assignBtn = driver.findElement(By.id("assignBtn"));
		boolean isDisplayed = assignBtn.isDisplayed();
		if (isDisplayed) {
			System.out.println("El boton esta desplegado");		
		}
		
		//Obtener text de un elemento
		WebElement welcomeMsg = driver.findElement(By.id("Welcome"));
		String message = welcomeMsg.getText();
		
		if(message.contains("Sai")){
			System.out.println("El mensaje contiene eol nombre de Sai");
		}else {
		System.out.println("ERROR:el mensaje no contiene el nombre de Sai");
		
		}
		
	}
}



