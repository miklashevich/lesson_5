import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static java.lang.Thread.sleep;

public class homeWork {

    @Test
    public void laminateSmokeTest2() throws InterruptedException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://calc.by/building-calculators/laminate.html");

        WebElement length = driver.findElement(By.id("ln_room_id"));
        length.clear();
        length.sendKeys("500");
        WebElement width = driver.findElement(By.id("wd_room_id"));
        width.clear();
        width.sendKeys("400");
        WebElement laminateLength = driver.findElement(By.id("ln_lam_id"));
        laminateLength.clear();
        laminateLength.sendKeys("2000");
        WebElement laminateWidth = driver.findElementById("wd_lam_id");
        laminateWidth.clear();
        laminateWidth.sendKeys("200");

        WebElement selectWebElement = driver.findElementById("laying_method_laminate");
        Select layingMethodLaminate = new Select(selectWebElement);
        //layingMethodLaminate.selectByIndex(0);
        //layingMethodLaminate.selectByValue("1");
        layingMethodLaminate.selectByVisibleText("с использованием отрезанного элемента");

        List<WebElement> list = driver.findElements(By.name("direction-laminate"));

        for (WebElement option : list) {
            if (option.getAttribute("value").equals("1")) {
                option.click();
            }
        }

        WebElement calcLam = driver.findElement(By.linkText("Рассчитать"));
        calcLam.click();
        sleep(2000);
        WebElement amount = driver.findElement(By.xpath("//span[text() = '53']"));
        String amountText = amount.getText();
        WebElement amountpack = driver.findElement(By.xpath("//span[text() = '7']"));
        String amountpackText = amountpack.getText();

        sleep(1000);
        Assert.assertEquals(amountText, "53");
        Assert.assertEquals(amountpackText, "7");

        driver.quit();
    }
}
