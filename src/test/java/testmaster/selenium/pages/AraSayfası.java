package testmaster.selenium.pages;

import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class AraSayfası extends Methods {
    public void sarkıArama(){
        clickElement(By.cssSelector("input[data-testid='search-input']"));
        waitBySeconds(5);
        clickElement(By.xpath("//div[@id=\"onetrust-close-btn-container\"]/button"));
        sendKeys(By.cssSelector("input[data-testid='search-input']"),"Daft Punk");
        waitBySeconds(3);
        clickElement(By.xpath("(//button[@role=\"checkbox\"])[3]"));
        waitBySeconds(3);
    }
}
