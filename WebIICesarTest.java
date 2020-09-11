import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.trivagoMainPage;
import suport.Web;

public class WebIICesarTest {
    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome();

    }
    @Test
    public void hotelInformation(){
        new trivagoMainPage(browser)
                .typeSearch("Natal")
                .clickSearch()
                .closeDate()
                .clickRoomChoice()
                .removeGuest()
                .confirmRemoveGuest()
                .selectOrder("Distância e sugestões")
                .pressInfo()
                .pressConvenience();

        String hotelName = new trivagoMainPage(browser)
                .takeHotelName();
        String hotelStars = new trivagoMainPage(browser)
                .takeHotelStars();
        String hotelPartner = new trivagoMainPage(browser)
                .takeHotelPartner();
        String hotelPrice = new trivagoMainPage(browser)
                .takeHotelPrice();
        String hotelRoom = new trivagoMainPage(browser)
                .takeHotelRoom();

        System.out.println("Nome: "+hotelName+ " Estrelas: "+hotelStars);
        System.out.println("Oferta da empresa: "+hotelPartner+ " Preço: "+hotelPrice);
        System.out.println("Comodidades do quarto: "+hotelRoom);


    }
    @After
    public void tearDown(){
        //browser.quit();
    }

}
