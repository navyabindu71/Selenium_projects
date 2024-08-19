import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Register {
@Test
    public void test(){
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//p[@class=\"fc-button-label\"]")).click();
    WebElement fname= driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
    fname.sendKeys("John");
    WebElement lname= driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
    lname.sendKeys("Katie");
    WebElement address= driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"));
    String add = "123 Main Street\\nApt 4B\\nNew York, NY 10001";
    address.sendKeys(add);
    driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("john.katie44@gmail.com");
    driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("7790856432");
    WebElement gender= driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
    gender.click();
    WebElement hobbie=driver.findElement(By.xpath("//input[@value=\"Movies\"]"));
    hobbie.click();
    WebElement drop1= driver.findElement(By.xpath("//div[@id='msdd']"));
    drop1.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
    /*String[] languagesToSelect= {"Arabic","English"};
    for (String language : languagesToSelect){
        WebElement option=driver.findElement(By.xpath("//li[@class='ng-scope']//a[text()='" + language + "']"));
        option.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)");*/




}
}
