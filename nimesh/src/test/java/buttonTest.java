import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class buttonTest {
    WebDriver driver;

    @BeforeMethod
    public void openlinkTestpage() {
        driver = new ChromeDriver();
        Dimension newSize=new Dimension(800,600);
        driver.manage().window().setSize(newSize);
        //driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01tq3eetkatv2r12muckgdshztl8260064.node0");

    }

    @Test
    public void Butttontest() {
        //click & confirm title
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]")).click();
        String expectedtitle = "Dashboard";
        String actualtitle = driver.getTitle();
        if (expectedtitle.equals(actualtitle)) {
            System.out.println("Actual title same to expected title");
        } else {
            System.out.println("Actual title not same to expected title");

        }
        driver.navigate().back();
        WebElement posifion=driver.findElement(By.id("j_idt88:j_idt94"));
        Point xypoint=posifion.getLocation();
        int x=xypoint.getX();
        int y=xypoint.getY();
        System.out.println("X posifion is:"+ x +"y posifion is"+y);

        //find the save button colour
        WebElement Colour =driver.findElement(By.id("j_idt88:j_idt96"));
        String Bcolor=Colour.getCssValue("    background-color");
        System.out.println("Button colour is"+Bcolor);

        //find the hight & width of this button
        WebElement Size=driver.findElement(By.id("j_idt88:j_idt98"));
        int hight=Size.getSize().getHeight();
        int width=Size.getSize().getWidth();
        System.out.println("Height"+hight +"width"+width);


    }

}

