import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Type_Test_Challenge {
	static WebDriver driver;

	@Test
	public static void setUpBeforeClass() throws Exception {
		driver = Setup.getChromeDriver(false);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.speedtypingonline.com/typing-test");
		WebElement inputsDiv = (WebElement) driver.findElements(By.id("blockDivContainer"));
		String targetText = inputsDiv.getText();
		System.out.println(targetText);
		driver.quit();
	}
}
