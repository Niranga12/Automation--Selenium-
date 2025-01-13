

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class linkExample {

    WebDriver driver;
    @BeforeMethod
    public void openlinkTestpage(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");
    }



    @Test
    public void linktest(){
        //1.go to dashboard
        WebElement homelink =driver.findElement(By.linkText("Go to Dashboard"));
        homelink.click();
        driver.navigate().back();

        //2
        WebElement wheretogo = driver.findElement(By.partialLinkText("Find the URL without "));
        String path =wheretogo.getAttribute("href");
        System.out.printf("go to:"+path);

        //3
        WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
        brokenlink.click();

        String title=driver.getTitle();
        if (title.contains("404")){
            System.out.printf("the linkbroken ");
        }
        else {
            System.out.printf("not broken");
        }driver.navigate().back();
        //driver.quit();

        //4
        WebElement homelink1 =driver.findElement(By.linkText("Go to Dashboard"));
        homelink1.click();
        driver.navigate().back();

        //5
        List<WebElement>countpagelink= driver.findElements(By.tagName("a"));
        int count =countpagelink.size();
        System.out.printf("countpagelink:"+count);

        //6
        WebElement layouteliment=driver.findElement(By.className("layout-main-content"));
        List<WebElement>countlolink=layouteliment.findElements(By.tagName("a"));
        System.out.printf("cololink:"+countlolink.size());








    }
}
