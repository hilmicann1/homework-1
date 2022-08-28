package testmaster.selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class CalmaListesi extends Methods {

    public void calmaListesiİcerisi(){
        Assertions.assertTrue(isElementVisible(By.xpath("(//h1[@dir=\"auto\"])[1]"),30));
        clickElement(By.xpath("(//h1[@dir=\"auto\"])[1]"));
        waitBySeconds(3);
        sendKeys(By.xpath("//input[@data-testid=\"playlist-edit-details-name-input\"]"),"Spotify Listem");
        waitBySeconds(3);
        clickElement(By.xpath("//button[@data-testid=\"playlist-edit-details-save-button\"]"));
        waitBySeconds(3);
        Assertions.assertTrue(isElementVisible(By.xpath("//button[@aria-label=\"Spotify Listem – Ayrıntıları düzenler\"]"),30));
        clickElement(By.xpath("(//a[@class=\"link-subtle ATUzFKub89lzvkmvhpyE\"])[2]"));
        waitBySeconds(3);
    }

    public  void calmaListesineEkleme(){

        hoverElement(By.xpath("(//button[@data-testid=\"more-button\"])[1]"));
        clickElement(By.xpath("(//button[@data-testid=\"more-button\"])[1]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[4]"));
        waitBySeconds(3);
        clickElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[5]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//button[@data-testid=\"more-button\"])[2]"));
        clickElement(By.xpath("(//button[@data-testid=\"more-button\"])[2]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[4]"));
        waitBySeconds(3);
        clickElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[5]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//button[@data-testid=\"more-button\"])[3]"));
        clickElement(By.xpath("(//button[@data-testid=\"more-button\"])[3]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//button[@class='wC9sIed7pfp47wZbmU6m'])[4]"));
        waitBySeconds(3);
        clickElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[5]"));
        waitBySeconds(3);

    }

    public void sarkiCalma(){
        clickElement(By.xpath("(//div[@class=\"AINMAUImkAYJd4ertQxy\"])[1]"));
        hoverElement(By.xpath("(//span[@class=\"Type__TypeElement-goli3j-0 jsusuc VrRwdIZO0sRX1lsWxJBe\"])[2]"));
        clickElement(By.xpath("(//button[@class=\"RfidWIoz8FON2WhFoItU\"])[2]"));
        waitBySeconds(10);
        clickElement(By.cssSelector("button[class=\"vnCew8qzJq3cVGlYFXRI\"]"));

    }

    public void silmeIslemleri(){
        clickElement(By.xpath("(//button[@class=\"T0anrkk_QA4IAQL29get mYN_ST1TsDdC6q1k1_xs\"])[3]"));
        hoverElement(By.xpath("        hoverElement(By.xpath(\"\"));\n"));
        clickElement(By.xpath("        hoverElement(By.xpath(\"\"));\n"));
        waitBySeconds(5);
        clickElement(By.xpath("(//button[@class=\"T0anrkk_QA4IAQL29get\"])"));
        clickElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[3]"));
        waitBySeconds(10);
        clickElement(By.xpath("(//button[@class=\"Button-qlcn5g-0 hgTVhT\"])[2]"));


    }
}
