import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//p[@class=\"fc-button-label\"]")).click();
        WebElement datefield= driver.findElement(By.id("datepicker1"));
        datefield.click();
        WebElement nextoption = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/a[2]"));
        nextoption.click();
        WebElement day=driver.findElement(By.xpath("//body[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]"));
        day.click();

        WebElement datefield2=  driver.findElement(By.id("datepicker2"));
        datefield2.click();
        datefield2.sendKeys("08/09/2022");

    }
}
