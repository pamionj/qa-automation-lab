package tests;

import base.BaseTest;
import pages.InventoryPage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void loginConCredencialesValidas() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        Assert.assertTrue(
                inventoryPage.isInventoryDisplayed(),
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
        loginPage.login("usuario_invalido", "password_invalida");

        Assert.assertTrue(
                loginPage.isErrorDisplayed(),
                "No se muestra mensaje de error con credenciales inválidas"
        );

        Assert.assertEquals(
                loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service",
                "Mensaje de error incorrecto"
        );
    }

    @Test(priority = 3)
    public void loginConUsuarioBloqueado() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "secret_sauce");

        Assert.assertTrue(
                loginPage.isErrorDisplayed(),
                "No se muestra mensaje de usuario bloqueado"
        );

        Assert.assertEquals(
                loginPage.getErrorMessage(),
                "Epic sadface: Sorry, this user has been locked out.",
                "Mensaje de usuario bloqueado incorrecto"
        );
    }
}
