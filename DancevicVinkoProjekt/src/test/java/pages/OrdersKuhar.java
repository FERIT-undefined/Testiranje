package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersKuhar {

    @FindBy(xpath ="/html/body/div/div/div/div/div[1]/div[2]/button")
    private WebElement LogoutButton;

    @FindBy(xpath ="/html/body/div/div/div/div/div[2]/div[2]/div[1]/div[4]/button")
    private WebElement ChangeButton;

    @FindBy(xpath ="/html/body/div/div/div/div[3]/div/div/button[1]")
    private WebElement ConfirmChangeButton;

    public void Logout() {
        LogoutButton.click();
    }
    public void ChangeStatus() {
        ChangeButton.click();
    }
    public void ConfirmChangeStatus() {
        ConfirmChangeButton.click();
    }

}
