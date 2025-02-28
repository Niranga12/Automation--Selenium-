import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class windowHandle {
    WebDriver driver;
    @BeforeMethod
    public void dropdownTestpage(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");
    }
    @Test
    public void windowhandleTest() throws InterruptedException {

        String OldTab=driver.getWindowHandle();
        System.out.println("parent window"+OldTab);

       WebElement OpenButton=driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]"));
        OpenButton.click();
        Thread.sleep(3000);

        Set<String> handles=driver.getWindowHandles();
        System.out.println("handle size"+handles.size());

    }
}
