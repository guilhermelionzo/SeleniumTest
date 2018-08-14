import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aplicacao {

	public static void main(String[] args) throws InterruptedException {
		
		String Url = "https://iw.claro.com.br/v2/login";
		
		setup();
		
		WebDriver browser = new ChromeDriver();
		
		//browser.get("https://automatetheboringstuff.com");
		
		browser.get(Url);
		
		WebElement element = browser.findElement(By.xpath("//*[@id=\"login\"]"));
		
		element.sendKeys("");
			
		element = browser.findElement(By.xpath("//*[@id=\"senha\"]"));
		
		element.sendKeys("");
		
		element = browser.findElement(By.xpath("//*[@id=\"loginBox\"]/table/tbody/tr[5]/td[2]/input"));
		
		element.click();
		
		Url = "https://iw.claro.com.br/v2/eng/relatorio/sitevsetapa";
		
		browser.get(Url);
		
		element = browser.findElement(By.xpath("//*[@id=\"UNNEGOCIO_DIV\"]"));
		
		element.click();
		
		element = browser.findElement(By.xpath("//*[@id=\"COD_UNNEGOCIO_3\"]"));
		
		element.click();
		
		element = browser.findElement(By.xpath("//*[@id=\"btn_UNNEGOCIO_Aplicar\"]"));
		
		element.click();
		
		element = browser.findElement(By.xpath("//*[@id=\"COD_FILA_ATUAL\"]/option[4]"));
		
		element.click();
		
		element = browser.findElement(By.xpath("//*[@id=\"BTN_TEXT_btnCSV\"]"));
		
		element.click();
		
		/*
		WebElement myDynamicElement = (new WebDriverWait(browser, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		//TimeUnit.SECONDS.sleep(2);
		
        element = browser.findElement(By.name("password"));
		
        element.sendKeys("Gg13011996007");
        
		//element.findElement(By.("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		
		//*[@id="passwordNext"]
				
		
		element.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
		
		//System.out.println(browser.getPageSource());
		*/
		System.out.println(element);
		
	}
	
	private static void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guilherme\\Documents\\MEGA\\Udemy\\Curso de Angular\\material de apoio\\chromedriver.exe");
	}
	
}
	