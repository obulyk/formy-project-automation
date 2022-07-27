import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oksana_Bulyk\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement uploadField =  driver.findElement(By.id("file-upload-field"));
        uploadField.sendKeys("file-up-load.png");

        //driver.quit();
    }
}
