package actors;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.model.domain.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class User {

    // Metodo para crear un actor con habilidades básicas
    public static Actor llamado(String nombre, WebDriver driver) {
        Actor actor = new Actor(nombre);
        actor.can(BrowseTheWeb.with(driver));  // Habilidad para navegar en la web
        return actor;
    }

    // Metodo adicional para crear un actor con WebDriver configurado
    public static Actor nuevoActorConWebDriver(String nombre) {
        WebDriver driver = new ChromeDriver();  // Creando un driver para pruebas
        return llamado(nombre, driver);
    }
}
