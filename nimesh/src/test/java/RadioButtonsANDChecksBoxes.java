import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RadioButtonsANDChecksBoxes {

    WebDriver driver;
    @BeforeMethod
    public void RadioButtonsANDChecksBoxe(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void radioTest(){
        //1 find the default selecte radio button
        driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node016z20gm119vfl1b2swc7c1ium78606477.node0");

        boolean chromeRadioOption=driver.findElement(By.id("j_idt87:console2:0")).isSelected();
        boolean firefoxRadioOption=driver.findElement(By.id("j_idt87:console2:1")).isSelected();
        boolean safariRadioOption=driver.findElement(By.id("j_idt87:console2:2")).isSelected();
        boolean edgeRadioOption=driver.findElement(By.id("j_idt87:console2:3")).isSelected();

        if (chromeRadioOption){
            String chromeText=driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).getText();
            System.out.println("default selecte radio button is :"+chromeText);

        } else if (firefoxRadioOption) {
            String firefoxTest=driver.findElement(By.xpath("//label[@for='j_idt87:console2:1'")).getText();
            System.out.println("default selecte radio button is : "+firefoxTest);

        } else if (safariRadioOption) {
            String safariTest=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2'")).getText();
            System.out.println("default selecte radio button is : "+safariTest);

        } else if (edgeRadioOption) {
            String edgeTest=driver.findElement(By.xpath("//label[@for='j_idt87:console2:3'")).getText();
            System.out.println("default selecte radio button is : "+edgeTest);


        }


        //2 select the age group(if not selected)
        WebElement myAgeGroup=driver.findElement(By.id("j_idt87:age:0"));
        boolean ischeck=myAgeGroup.isSelected();
        if (ischeck!=true){
            //myAgeGroup.click();
            driver.findElement(By.xpath("//label[@for='j_idt87:age:0']")).click();

        }


    }
    @Test
    public void checksTest(){
        //select wanted checkbox and verifing those checkboxs selected status.
        driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0w3j34xrwvunpdtp6njk9z5ed8608687.node0");

        List<WebElement> checkboxList= driver.findElements(By.xpath("//table[@id='j_idt87:basic']//label"));
        for (WebElement element:checkboxList){
            if (!(element.getText().equals("others"))){

        }



    }
        for (int i=1; i<=checkboxList.size(); i++){
            boolean checkBoxStatus=driver.findElement(By.xpath("(//table[@id='j_idt87:basic']//input)["+ i +"]")).isSelected();
            System.out.println("Chechbox"+i+"selected status is:"+checkBoxStatus);
        }
        driver.quit();
        public static void main(String[] args) {

            String str = "ABCD";
            String res = "";
            //length & chartAt

            //int len=str.length();
            //for (int i=len-1;i>=0;i--){
            //   res=res+str.charAt(i);
            // }
            //System.out.println(res);

            //charatorArray
            char[] arr = str.toCharArray();
            int len = arr.length;

            for (int i = len - 1; i >= 0; i--) {
                res = res + arr[i];


            }
            System.out.println(res);
        }




}}
