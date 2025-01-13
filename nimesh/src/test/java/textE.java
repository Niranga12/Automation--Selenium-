import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class textE {

    WebDriver driver;
    @BeforeMethod
    public void openlinkTestpage(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01vin87mw34e3019r1chb7pmtay8249271.node0");
    }
    @Test
    public void textboxtest(){
        //type name
        WebElement name=driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Nimesh");

        //type country
        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Lanka");

        //verify
        boolean enabled =driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("is......"+enabled);

        //clean type text//*[@id="j_idt88:j_idt95"]
        WebElement clean=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
        clean.clear();

        //retrive
        WebElement retrieve =driver.findElement(By.id("j_idt88:j_idt97"));
        String value=retrieve.getAttribute("value");
        System.out.println(value);

        //tab
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("nnnnnn"+ Keys.TAB+" Confirm control moved to next element.\n");


    }

}





