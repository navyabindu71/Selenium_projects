import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
    WebElement address= driver.findElement(By.className("form-control ng-pristine ng-valid ng-touched"));
    address.sendKeys("10 lower street, CA, CA11 022");

}
}
