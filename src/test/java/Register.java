import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
    String[] languagesToSelect= {"Arabic","English","German"};
    for (String language : languagesToSelect) {
        WebElement option = driver.findElement(By.xpath("//li[@class='ng-scope']//a[text()='" + language + "']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", option);
        option.click();
            }
    WebElement outsideElement = driver.findElement(By.xpath("//label[text()='Skills']"));
    outsideElement.click();

    WebElement drop2= driver.findElement(By.id("Skills"));
    drop2.click();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", drop2);
    Select dropdown= new Select(drop2);
    dropdown.selectByValue("Excel");
    drop2.click();

    /*WebElement country=driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]/span[1]"));
    country.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    WebElement searchBox = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
    searchBox.sendKeys("India");*/
    WebElement year = driver.findElement(By.id("yearbox"));
    year.click();
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    js1.executeScript("arguments[0].scrollIntoView(true);", year);
    Select yeardropdown = new Select(year);
    yeardropdown.selectByValue("1992");

    WebElement month= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    month.click();
    Select monthdropdown=new Select(month);
    monthdropdown.selectByValue("September");

    WebElement day=driver.findElement(By.id("daybox"));
    day.click();
    Select daydropdown=new Select(day);
    daydropdown.selectByValue("14");
    driver.findElement(By.id("firstpassword")).sendKeys("Abcd@9876");
    driver.findElement(By.id("secondpassword")).sendKeys("Abcd@9876");
    driver.findElement(By.id("submitbtn")).click();
    WebElement uploadpic = driver.findElement(By.id("imagesrc"));
    uploadpic.sendKeys("D:\\rose.jpg");



}
}
