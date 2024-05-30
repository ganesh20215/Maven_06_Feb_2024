package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test(groups = "smoke")
    public void verifySoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement userNameTextBox = driver.findElement(By.id("login1"));
        softAssert.assertEquals(title, "rediffmail", "Rediffmail title should be match");
        softAssert.assertTrue(userNameTextBox.isDisplayed(), "username text box should be displayed.");
        softAssert.assertAll();
        driver.close();
    }
}
