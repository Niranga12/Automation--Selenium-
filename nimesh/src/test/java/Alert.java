import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert {
    WebDriver driver;

    @BeforeMethod
    public void TestLeaf() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");
    }
    @Test
    public void AlertTest(){
        //alert simple dialog
        //WebElement alertBox=driver.findElement(By.id("j_idt88:j_idt91"));
        //alertBox.click();
        //driver.switchTo().alert().accept();

        //alert comfirm dialog
       // WebElement comfirmBox=driver.findElement(By.id("j_idt88:j_idt93"));
        //comfirmBox.click();
        //driver.switchTo().alert().dismiss();

        //alert prompt dialog
        WebElement promptBOX=driver.findElement(By.id("j_idt88:j_idt104"));
        promptBOX.click();
        org.openqa.selenium.Alert alert1=driver.switchTo().alert();
        String alertText=alert1.getText();
        System.out.println("Alert Text is"+alertText);
        alert1.sendKeys("my name is nimesh");


    }


}

