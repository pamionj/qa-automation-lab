package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class InventoryPage {

    private final WebDriver driver;
    private final WaitUtils wait;

    private final By title = By.className("title");
    private final By inventoryContainer = By.id("inventory_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    public boolean isInventoryVisible() {
        return wait.waitForVisibility(inventoryContainer).isDisplayed();
    }

    public String getPageTitle() {
        return wait.waitForVisibility(title).getText();
    }
}
