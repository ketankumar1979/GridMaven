package griddemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class KetanKiran {

@Test
    public  void main ()throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
   // DesiredCapabilities cap = DesiredCapabilities.chrome();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WIN10);
        URL url = new URL("http://192.168.0.7:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url,caps);
        //driver = new RemoteWebDriver(new URL(nodeurl),caps);
        //ChromeOptions options = new ChromeOptions();
        //options.merge(caps);
        //String huburl = "http://192.168.0.7:7070/wd/hub";
       // WebDriver driver = new RemoteWebDriver(new URL(huburl),options);

        // WebDriver driver = new RemoteWebDriver(url, caps);
        //driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

    //driver.switchTo().frame(0);
   // WebElement fromelement = driver.findElement(By.id("draggable"));
    //WebElement fromelement = driver.findElement(By.id("draggable"));
   // WebElement toelement = driver.findElement(By.id("droppable"));
   // Actions action = new Actions(driver);
    //Actions action = new Actions(driver);
    // action.dragAndDrop(fromelement,toelement).build().perform();
   // action.clickAndHold(fromelement).moveToElement(toelement).release().build().perform();


}
}


