

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Setup {
	private static void setBrowserSizePosition(WebDriver webDriver) {
		Dimension targetSize = new Dimension(1200, 800);
		webDriver.manage().window().setSize(targetSize);
		Point targetPosition = new Point(300, 0);
		webDriver.manage().window().setPosition(targetPosition);
	}

	public static WebDriver getChromeDriver(boolean maximize) {
		getChromePropertyAndPath();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		WebDriver webDriver = new ChromeDriver(options);
		WebDriver webDriver = new ChromeDriver();
//		System.out.println("Chrome set to Incognito mode\n\n");
		if(maximize) webDriver.manage().window().maximize();
		else setBrowserSizePosition(webDriver);

		return webDriver;
	}

	private static void getChromePropertyAndPath() {
		String chromeProperty = Repo.getChromeProperty();
		String chromePath = Repo.getChromePath();
		System.setProperty(chromeProperty, chromePath);
	}
}
