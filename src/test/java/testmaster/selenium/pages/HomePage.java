package testmaster.selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class HomePage extends Methods{

    Methods methods;

    public HomePage(){

        methods = new Methods();
    }

    public boolean loginControl(){

        Assertions.assertTrue(isElementVisible(By.xpath("//button[@data-testid=\"user-widget-link\"]"),30));
        return true;

    }
    public void calmaListesiCreate(){
        clickElement(By.xpath("//button[@data-testid=\"create-playlist-button\"]"));
        waitBySeconds(3);
    }
}
