import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class jobsTutByLocators {
    @Test
    public void findLocators() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jobs.tut.by");

        WebElement cssSelector_class = driver.findElement(By.cssSelector(".supernova-navi-item_area-switcher-button "));
        Assert.assertTrue(cssSelector_class.isEnabled());
        WebElement cssSelector_class2 = driver.findElement(By.cssSelector(".supernova-dashboard-header"));
        Assert.assertTrue(cssSelector_class2.isDisplayed());

        WebElement cssSelector_class_class = driver.findElement(By.cssSelector(".bloko-column.bloko-column_s-0.bloko-column_m-0.bloko-column_l-4"));
        Assert.assertTrue(cssSelector_class_class.isEnabled());
        WebElement cssSelector_class_class2 = driver.findElement(By.cssSelector(".bloko-column.bloko-column_s-0.bloko-column_m-0.bloko-column_l-4"));
        Assert.assertTrue(cssSelector_class_class2.isEnabled());

        WebElement cssSelector_class_descendant = driver.findElement(By.cssSelector(".supernova-dashboard-stats.supernova-dashboard-stats_secondary .supernova-dashboard-stats__value"));
        Assert.assertTrue(cssSelector_class_descendant.isEnabled());
        WebElement cssSelector_class_descendant2 = driver.findElement(By.cssSelector(".supernova-dashboard-stats.supernova-dashboard-stats_secondary .supernova-dashboard-stats__text"));
        Assert.assertTrue(cssSelector_class_descendant2.isEnabled());

        WebElement cssSelector_class_div_inside = driver.findElement(By.cssSelector("div h1"));
        Assert.assertTrue(cssSelector_class_div_inside.isEnabled());
        WebElement cssSelector_class_div_inside2 = driver.findElement(By.cssSelector("div button span span"));
        Assert.assertTrue(cssSelector_class_div_inside2.isEnabled());

        WebElement cssSelector_class_div_strictly_inside = driver.findElement(By.cssSelector("div>button>span>span"));
        Assert.assertTrue(cssSelector_class_div_strictly_inside.isEnabled());
        WebElement cssSelector_class_div_strictly_inside2 = driver.findElement(By.cssSelector("div>div>a>div"));
        Assert.assertTrue(cssSelector_class_div_strictly_inside2.isEnabled());

        WebElement cssSelector_class_div_plus_element = driver.findElement(By.cssSelector("div+a"));
        Assert.assertTrue(cssSelector_class_div_plus_element.isEnabled());
        WebElement cssSelector_class_div_plus_element2 = driver.findElement(By.cssSelector("div+p"));
        Assert.assertTrue(cssSelector_class_div_plus_element2.isEnabled());

        WebElement cssSelector_class_div_tilda = driver.findElement(By.cssSelector("div~form"));
        Assert.assertTrue(cssSelector_class_div_tilda.isEnabled());
        WebElement cssSelector_class_div_plus_tilda2 = driver.findElement(By.cssSelector("div~a"));
        Assert.assertTrue(cssSelector_class_div_plus_tilda2.isEnabled());

        WebElement cssSelector_class_div_attribute = driver.findElement(By.cssSelector("[src='https://i.rabota.by/images/creditcards/grey-mastercard.svg']"));
        Assert.assertTrue(cssSelector_class_div_attribute.isEnabled());
        WebElement cssSelector_class_div_plus_attribute2 = driver.findElement(By.cssSelector("[src='https://i.rabota.by/images/creditcards/grey-belcart.svg']"));
        Assert.assertTrue(cssSelector_class_div_plus_attribute2.isEnabled());

        WebElement cssSelector_attribute_href = driver.findElement(By.cssSelector("a[href^='https://www.tut.by']"));
        Assert.assertTrue(cssSelector_attribute_href.isEnabled());
        WebElement cssSelector_attribute_href2 = driver.findElement(By.cssSelector("a[href^='https://www.inst']"));
        Assert.assertTrue(cssSelector_attribute_href2.isEnabled());

        WebElement cssSelector_attribute_tilda = driver.findElement(By.cssSelector("[class~=s-friendly]"));
        Assert.assertTrue(cssSelector_attribute_tilda.isEnabled());
        WebElement cssSelector_attribute_tilda2 = driver.findElement(By.cssSelector("[class~=supernova-overlay__navi]"));
        Assert.assertTrue(cssSelector_attribute_tilda2.isEnabled());

        WebElement cssSelector_attribute_hrefEnd = driver.findElement(By.cssSelector("a[href$='.rabotaby']"));
        Assert.assertTrue(cssSelector_attribute_hrefEnd.isEnabled());
        WebElement cssSelector_attribute_hrefEnd2 = driver.findElement(By.cssSelector("a[href$='.belarus']"));
        Assert.assertTrue(cssSelector_attribute_hrefEnd2.isEnabled());

        WebElement cssSelector_attribute_hrefContains = driver.findElement(By.cssSelector("a[href*='face']"));
        Assert.assertTrue(cssSelector_attribute_hrefContains.isEnabled());
        WebElement cssSelector_attribute_hrefContains2 = driver.findElement(By.cssSelector("a[href*='inst']"));
        Assert.assertTrue(cssSelector_attribute_hrefContains2.isEnabled());

        driver.quit();

    }

    @Test
    public void findLocatorsXpath() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jobs.tut.by");

        WebElement xpath_contains1 = driver.findElement(By.xpath("//a[contains(text(),'Реклама на сайте')]"));
        Assert.assertTrue(xpath_contains1.isDisplayed());
        WebElement xpath_contains2 = driver.findElement(By.xpath("//a[contains(text(),'Требования к ПО')]"));
        Assert.assertTrue(xpath_contains2.isDisplayed());

        WebElement xpath_class1 = driver.findElement(By.xpath("//*[@class='supernova-overlay']"));
        Assert.assertTrue(xpath_class1.isDisplayed());
        WebElement xpath_class2 = driver.findElement(By.xpath("//*[@class='supernova-dashboard-footer']"));
        Assert.assertTrue(xpath_class2.isDisplayed());

        WebElement xpath_class_move_down1 = driver.findElement(By.xpath("//*[@class='work-in-company-wrapper']//h2//a"));
        Assert.assertTrue(xpath_class_move_down1.isDisplayed());
        WebElement xpath_class_move_down2 = driver.findElement(By.xpath("//*[@class='dashboard-tiles-item__title']/span[1]"));
        Assert.assertTrue(xpath_class_move_down2.isDisplayed());

        WebElement xpath_sibling1 = driver.findElement(By.xpath("//h3[contains(text(),'Полезное')]/following-sibling::div[@class='useful-link']"));
        Assert.assertTrue(xpath_sibling1.isDisplayed());
        WebElement xpath_sibling2 = driver.findElement(By.xpath("//h2[contains(text(),'Работа в других городах')]/following-sibling::ul/li[@class='multiple-column-list-item']"));
        Assert.assertTrue(xpath_sibling2.isDisplayed());

        WebElement xpath_text1 = driver.findElement(By.xpath("//*[text()='Производственный календарь']"));
        Assert.assertTrue(xpath_text1.isDisplayed());
        WebElement xpath_text2 = driver.findElement(By.xpath("//*[text()='Кадровые агентства Беларуси']"));
        Assert.assertTrue(xpath_text2.isDisplayed());

        WebElement xpath_ancestor1 = driver.findElement(By.xpath("//form/ancestor::div[h1]"));
        Assert.assertTrue(xpath_ancestor1.isDisplayed());
        WebElement xpath_ancestor2 = driver.findElement(By.xpath("//div[@class='bloko-gap bloko-gap_top']/ancestor::div[h1]"));
        Assert.assertTrue(xpath_ancestor2.isDisplayed());

        WebElement xpath_ancestor_or_self1 = driver.findElement(By.xpath("//ancestor-or-self::div[@class='grid__columns-wrapper']"));
        Assert.assertTrue(xpath_ancestor_or_self1.isEnabled());
        WebElement xpath_ancestor_or_self2 = driver.findElement(By.xpath("//ancestor-or-self::h1[1]"));
        Assert.assertTrue(xpath_ancestor_or_self2.isDisplayed());

        WebElement xpath_child1 = driver.findElement(By.xpath("//div[@class='bloko-gap bloko-gap_top']/child::h1"));
        Assert.assertTrue(xpath_child1.isDisplayed());
        WebElement xpath_child2 = driver.findElement(By.xpath("//div/child::h2[1]"));
        Assert.assertTrue(xpath_child2.isEnabled());

        WebElement xpath_descendant1 = driver.findElement(By.xpath("//div[@class='HH-Supernova-AreaSwitcherModal-Body g-hidden']/descendant::h2"));
        Assert.assertTrue(xpath_descendant1.isEnabled());
        WebElement xpath_descendant2 = driver.findElement(By.xpath("//div[@class='bloko-column bloko-column_xs-4 bloko-column_s-4 bloko-column_m-4 bloko-column_l-4']/descendant::h2"));
        Assert.assertTrue(xpath_descendant2.isEnabled());

        WebElement xpath_following1 = driver.findElement(By.xpath("//div[@class='bloko-gap bloko-gap_top']/following::p[1]"));
        Assert.assertTrue(xpath_following1.isEnabled());
        WebElement xpath_following2 = driver.findElement(By.xpath("//div[@class='index-resume-button']/following::a[1]"));
        Assert.assertTrue(xpath_following2.isEnabled());

        WebElement xpath_preceding1 = driver.findElement(By.xpath("//div[@class='bloko-columns-wrapper']/preceding::a[1]"));
        Assert.assertTrue(xpath_preceding1.isEnabled());
        WebElement xpath_preceding2 = driver.findElement(By.xpath("//div[@class='supernova-navi-item supernova-navi-item_lvl-2 supernova-navi-item_mobile supernova-navi-item_dashboard ']/preceding::a[2]"));
        Assert.assertTrue(xpath_preceding2.isEnabled());
        driver.quit();

    }
}