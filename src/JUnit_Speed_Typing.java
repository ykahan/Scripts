import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class JUnit_Speed_Typing {
	private static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		boolean maximize = true;
		driver = Setup.getChromeDriver(maximize);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.speedtypingonline.com/typing-test");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
//		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.speedtypingonline.com/typing-test");
		WebElement inputsDiv = driver.findElement(By.id("blockDivContainer"));
		WebElement timer = driver.findElement(By.id("timer"));
		String time = timer.getText();
		boolean timeLeft = true;
		while (timeLeft) {
			for (int i = 0; i < 4; i++) {
				String xpath = "//div[@id ='blockLine" + i + "']";//span";
//				List<WebElement> spans = driver.findElements(By.xpath(xpath));
				WebElement div = driver.findElement(By.xpath(xpath));
				StringBuilder sb = new StringBuilder();
//				String text = "";
//				for (int inner = 0; inner < spans.size(); inner++) {
//					sb.append(spans.get(inner).getText());
////					text += spans.get(inner).getText();
//				}
				sb.append(div.getText());
//				String text = sb.toString();
				inputsDiv.sendKeys(sb.toString());
//				System.out.println("\"" + sb.toString() + "\"");
//				System.out.println("===========");
			}
			time = timer.getText();
			timeLeft = !time.contains("00:00");
		}
	}

}
