import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class dropDownTest {
    WebDriver driver;
    @BeforeMethod
    public void dropdownTestpage(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/select.xhtml");
    }
    @Test
    public void dropdown() throws InterruptedException {
        //1.1 way of select value of in basic dropdown
        WebElement dropdowwn = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(dropdowwn);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");
        Thread.sleep(3000);

        //1.2 get the number of dropdown options
        List<WebElement> listOfoption = select.getOptions();
        int size = listOfoption.size();
        System.out.println("number of element" + size);

        for (WebElement element : listOfoption) {
            System.out.println(element.getText());

        }

        //1.3 using sendkeys get select dropdown value
        dropdowwn.sendKeys("Puppeteer");

        //1.4 selecting value in a boostrapt dropdown
        WebElement webeliment2 = driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        webeliment2.click();
        List<WebElement> listofwebeliment2 = driver.findElements(By.xpath("//ul[@id=\"j_idt87:country_items\"]"));
        for (WebElement element : listofwebeliment2) {
            String dropdownvalue = element.getText();
            if (dropdownvalue.equals("USA")) {
                element.click();
                break;


            }


        }


    }}























