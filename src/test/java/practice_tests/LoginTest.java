package practice_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.id("inputUsername")).sendKeys("assdf");
            driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
            driver.findElement(By.id("chkboxOne")).click();
            driver.findElement(By.id("chkboxTwo")).click();
            driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("logout-btn")));
            System.out.println(driver.findElement(By.tagName("h1")).getText());
        } finally {
            driver.quit();
        }

    }
}
