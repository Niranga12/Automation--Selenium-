import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class buttonTest {
    WebDriver driver;

    @BeforeMethod
    public void openlinkTestpage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01tq3eetkatv2r12muckgdshztl8260064.node0");

    }
    @Test
    public void textboxtest(){
        //click & confirm title
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]")).click();
        String expectedtitle  ="//*[@id=\"j_idt88:j_idt90\"]"

    }
}