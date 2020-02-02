public class Repo {

	private static String firefoxProperty = "webdriver.gecko.driver";
	private static String firefoxPath = "C:\\Users\\USER\\Java_Workspace_Yehoshua\\Selenium Dependencies\\geckodriver.exe";
	private static String chromeProperty = "webdriver.chrome.driver";
	private static String chromePath = "C:\\Users\\USER\\Java_Workspace_Yehoshua\\Selenium Dependencies\\chromedriver.exe";
	private static String edgeProperty = "webdriver.edge.driver";
//	private static String edgePath = "C:\\Users\\USER\\Java_Workspace_Yehoshua\\Selenium Dependencies\\MicrosoftWebDriver.exe";
	private static String edgePath = "C:\\Users\\USER\\Java_Workspace_Yehoshua\\Selenium Dependencies\\MicrosoftWebDriver - Shortcut";

	public static String getFirefoxProperty() {
		return firefoxProperty;
	}

	public static String getFirefoxPath() {
		return firefoxPath;
	}

	public static String getChromeProperty() {
		return chromeProperty;
	}

	public static String getChromePath() {
		return chromePath;
	}

	public static String getEdgeProperty() {
		return edgeProperty;
	}

	public static String getEdgePath() {
		return "C:\\Windows\\system32\\MicrosoftWebDriver.exe";
//		return edgePath;
	}
}
