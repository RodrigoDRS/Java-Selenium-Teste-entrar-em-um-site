package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Vector;

public class basePage {
    protected WebDriver browser;

    public basePage(WebDriver browser) {


        this.browser = browser;
    }

    public String takeHotelName() {
        return browser.findElement(By.xpath("//section[@id=\"js_item_list_section\"]/ol[1]/li[2]")).findElement(By.xpath("//span[@class=\"item-link name__copytext\"]")).getText();

    }

    public String takeHotelStars() {
        return browser.findElement(By.xpath("//section[@id=\"js_item_list_section\"]/ol[1]/li[2]")).findElement(By.xpath("//meta[@itemprop=\"ratingValue\"]")).getText();

    }

    public String takeHotelPartner() {
        return browser.findElement(By.xpath("//section[@id=\"js_item_list_section\"]/ol[1]/li[2]")).findElement(By.xpath("//span[@data-qa=\"recommended-price-partner\"]")).getText();

    }

    public String takeHotelPrice() {
        return browser.findElement(By.xpath("//section[@id=\"js_item_list_section\"]/ol[1]/li[2]")).findElement(By.xpath("//strong[@data-qa=\"recommended-price\"]")).getText();

    }

    public String takeHotelRoom() {
        return browser.findElement(By.xpath("//section[@id=\"js_item_list_section\"]/ol[1]/li[2]")).findElement(By.className("unordered-list m-0")).getText();

    }
}