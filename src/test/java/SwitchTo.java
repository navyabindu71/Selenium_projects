import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SwitchTo {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//p[@class=\"fc-button-label\"]")).click();
        WebElement button= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        button.click();
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        WebElement link= driver.findElement(By.cssSelector("a[href='#CancelTab']"));
        link.click();
        WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();
        driver.switchTo().alert().dismiss();
        button1.click();
        driver.switchTo().alert().accept();
        WebElement link1= driver.findElement(By.cssSelector("a[href='#Textbox']"));
        link1.click();
        WebElement button2= driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        button2.click();
        Alert prompt= driver.switchTo().alert();
        prompt.sendKeys("Navya");
        prompt.accept();


    }
}
