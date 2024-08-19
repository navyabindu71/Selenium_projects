import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
@Test
    public void test(){
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//p[@class=\"fc-button-label\"]")).click();

}
}
