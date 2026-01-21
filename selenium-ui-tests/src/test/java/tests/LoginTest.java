package tests;

import base.BaseTest;
import pages.InventoryPage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.EnvUtils;


public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void loginConCredencialesValidas() {

        LoginPage loginPage = new LoginPage(driver);
        String username = EnvUtils.getEnv("SAUCE_USERNAME");
        String password = EnvUtils.getEnv("SAUCE_PASSWORD");

        loginPage.login(username, password);


        InventoryPage inventoryPage = new InventoryPage(driver);

        Assert.assertTrue(
                inventoryPage.isInventoryVisible(),
                "El inventario no se muestra después del login"
        );

        Assert.assertEquals(
                inventoryPage.getPageTitle(),
                "Products",
                "El título de la página no es el esperado"
        );
    }

    @Test(priority = 2)
    public void loginConCredencialesInvalidas() {

        LoginPage loginPage = new LoginPage(driver);
        String username = EnvUtils.getEnv("SAUCE_INVALID_USERNAME");
        String password = EnvUtils.getEnv("SAUCE_INVALID_PASSWORD");

        loginPage.login(username, password);


        Assert.assertEquals(
                loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service",
                "Mensaje de error incorrecto"
        );
    }

    @Test(priority = 3)
    public void loginConUsuarioBloqueado() {

        LoginPage loginPage = new LoginPage(driver);
        String username = EnvUtils.getEnv("SAUCE_LOCKED_USERNAME");
        String password = EnvUtils.getEnv("SAUCE_PASSWORD");

        loginPage.login(username, password);


        Assert.assertEquals(
                loginPage.getErrorMessage(),
                "Epic sadface: Sorry, this user has been locked out.",
                "Mensaje de usuario bloqueado incorrecto"
        );
    }
}
