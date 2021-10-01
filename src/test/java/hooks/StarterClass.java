package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import utils.Common;
import webPages.AmazonHomePage;

import java.io.IOException;
import java.util.Properties;




public  class StarterClass extends Common {
    public static AmazonHomePage amazonHomePage;
    String PropertiesFilePath = "config.properties";
    public static Properties prop;
    {
        try {
            prop = loadProperties(PropertiesFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    String testingEnvironment= prop.getProperty("TestingEnvironment");
    Boolean useCloudEnv= Boolean.parseBoolean(prop.getProperty("UseCloudEnv")) ;
    String cloudEnvName= prop.getProperty("CloudEnvName");
    String os= prop.getProperty("Os");
    String os_version = prop.getProperty("Os_version");
    String browserName = prop.getProperty("BrowserName");
    String browserVersion = prop.getProperty("BrowserVersion");
    String url = prop.getProperty("Url");
    long implicitlyWaitTime=Long.parseLong(prop.getProperty("ImplicitlyWaitTime").trim());
    //long implicitlyWaitTime= implicitlywaitTime.longValue();

    // Read properties from propertie file

    public static void Init() {
        amazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
    }

    @Before
    public void setUp_Init() throws IOException {

        setUp( useCloudEnv,  cloudEnvName,
                os,  os_version,  browserName,
                browserVersion, url,implicitlyWaitTime);
        Init();
    }
    //ScreenShot method
    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();

    }
}