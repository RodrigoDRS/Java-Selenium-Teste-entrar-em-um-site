package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trivagoMainPage extends basePage{
    public trivagoMainPage(WebDriver browser) {
        super(browser);
    }
    public trivagoMainPage typeSearch(String search){
        browser.findElement(By.xpath("//input[@placeholder=\"Insira o nome do hotel ou destino\"]")).sendKeys(search);
        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ssg-title")));

        return this;
    }
    public trivagoMainPage clickSearch(){
        browser.findElement(By.className("search-button__label")).click();

        return this;

    }
    public trivagoMainPage closeDate(){
        browser.findElement(By.xpath("//span[@class=\"icon-ic icon-contain fill-maincolor-04-light\"]")).click();

        return this;
    }
    public trivagoMainPage clickRoomChoice(){
        browser.findElement(By.xpath("//button[@class=\"dealform-button dealform-button--guests js-dealform-button-guests\"]")).click();

        return this;
    }
    public trivagoMainPage removeGuest(){
        browser.findElement(By.xpath("//button[@class=\"circle-btn circle-btn--minus\"]")).click();

        return this;
    }
    public trivagoMainPage confirmRemoveGuest(){
        browser.findElement(By.xpath("//button[@data-role=\"applyConfigBtn\"]")).click();

        return this;
    }
    public trivagoMainPage selectOrder(String type){
        WebElement fieldType = browser.findElement(By.id("mf-select-sortby"));
        new Select(fieldType).selectByVisibleText(type);

        return this;
    }
    public trivagoMainPage pressInfo(){
        browser.findElement(By.xpath("//section[@id=\"js_item_list_section\"]/ol[1]/li[2]")).findElement(By.xpath("//span[@class=\"icon-ic slideout-toggle-ic icon-contain\"]")).click();
        WebDriverWait waitConvenience = new WebDriverWait(browser, 10);
        waitConvenience.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"expand-amenities\"]/button[@type=\"button\"]")));

        return this;
    }
    public trivagoMainPage pressConvenience(){
        browser.findElement(By.xpath("//section[@id=\"js_item_list_section\"]/ol[1]/li[2]")).findElement(By.xpath("//div[@class=\"expand-amenities\"]/button[@type=\"button\"]")).click();

        return this;
    }

}
