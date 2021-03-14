import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;

import static java.lang.Thread.sleep;

public class homeworkTask2 {

@Test
    public void site2Laminate () {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");

        WebElement length = driver.findElement(By.name("calc_roomwidth"));
        length.clear();
       length.sendKeys(Keys.chord(Keys.CONTROL, "a"), "7");


        WebElement width = driver.findElement(By.name("calc_roomheight"));
        width.clear();
        width.sendKeys(Keys.chord(Keys.CONTROL, "a"), "5");

        WebElement laminateLenght = driver.findElement(By.name("calc_lamwidth"));
        laminateLenght.clear();
        laminateLenght.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1300");

        WebElement laminateWidth = driver.findElement(By.name("calc_lamheight"));
        laminateWidth.clear();
        laminateWidth.sendKeys(Keys.chord(Keys.CONTROL, "a"), "192");

       WebElement calcInpack = driver.findElement(By.name("calc_inpack"));
       calcInpack.clear();
       calcInpack.sendKeys(Keys.chord(Keys.CONTROL, "a"), "12");

    WebElement calcPrice = driver.findElement(By.name("calc_price"));
    calcPrice.clear();
    calcPrice.sendKeys(Keys.chord(Keys.CONTROL, "a"), "500");

    WebElement selectWebElement = driver.findElementByName("calc_direct");
    Select calcDirect = new Select(selectWebElement);
    calcDirect.selectByValue("toh");

    WebElement calcBtn = driver.findElement(By.className("tocalc"));
    calcBtn.click();

    // остались вопросы по:
    // "Смещение рядов:" и "Отступ от стены:" - не понимаю как там значениея поменять
    // как найти значения которые расчитываются в калькуляторе (xpath - или как то еще?)




}


}
