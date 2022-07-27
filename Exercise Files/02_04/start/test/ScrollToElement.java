import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oksana_Bulyk\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.ById("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Oksana NU");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("12/23/2000");


        driver.quit();
    }
}
