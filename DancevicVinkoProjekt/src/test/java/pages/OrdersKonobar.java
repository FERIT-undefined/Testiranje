package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersKonobar {

    @FindBy(xpath ="/html/body/div/div/div/div/div[1]/div[2]/button")
    private WebElement LogoutButton;

    @FindBy(xpath = "/html/body/div/div/nav/div[2]/a[1]")
    private WebElement OrdersButton;

    @FindBy(xpath = "/html/body/div/div/nav/div[2]/a[2]")
    private WebElement MenuButton;

    @FindBy(xpath = "/html/body/div/div/nav/div[2]/a[3]")
    private WebElement TablesButton;

    @FindBy(xpath = "/html/body/div/div/div/div/button")
    private WebElement DoneButton;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/div/button[2]")
    private WebElement ConfirmDoneButton;

    @FindBy(xpath = " /html/body/div/div/div/div/div[3]/div[3]")
    private WebElement FinishTable;

    @FindBy(xpath = "/html/body/print-preview-app//print-preview-sidebar//print-preview-button-strip//div/cr-button[2]/html/body/print-preview-app//print-preview-sidebar//print-preview-button-strip//div/cr-button[2]")
    private WebElement ClosePrint;

    @FindBy(xpath = "  /html/body/div/div/div/div[3]/div/div[1]/div[1]/button")
    private WebElement CloseFinish;

    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/div[1]/div[2]/button")
    private WebElement PrintFinish;

    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/div[1]/div[3]/button")
    private WebElement ConfirmFinish;

    @FindBy(xpath = "  /html/body/div/div/div/div/div[2]/div[5]")
    private WebElement TakenTable;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[1]/button")
    private WebElement CloseTTable;

    @FindBy(xpath = "  /html/body/div/div/div/div/div[2]/div[9]")
    private WebElement FreeTable;

    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/div[1]/button")
    private WebElement CloseFreeTable;

    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/div[2]/div/div/div[3]/div[8]/div/button[1]")
    private WebElement AddMealButton;

    @FindBy(xpath = "  /html/body/div/div/div/div[3]/div/div[2]/div/div/div[3]/div[8]/div/button[2]")
    private WebElement SubMealButton;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[2]/div/div/div[3]/div[8]/button")
    private WebElement ConfMealButton;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[2]/button")
    private WebElement ConfButton;

    public void Menu() {
        MenuButton.click();
    }
    public void ConfirmOrder() {
        ConfButton.click();
    }
    public void ConfirmMealOrder() {
        ConfMealButton.click();
    }
    public void AddMealOrder() {
        AddMealButton.click();
    }
    public void SubMealOrder() {
        SubMealButton.click();
    }

    public void ChooseTakenTable() {
        TakenTable.click();
    }
    public void ChooseTable() {
        FreeTable.click();
    }
    public void CloseTakenTable() {
        CloseTTable.click();
    }
    public void CloseTable() {
        CloseFreeTable.click();
    }
    public void Orders() {
        OrdersButton.click();
    }
    public void Logout() {
        LogoutButton.click();
    }
    public void Tables() {
        TablesButton.click();
    }
    public void SaveDone() {
        DoneButton.click();
    }
    public void ConfirmSaveDone() {
        ConfirmDoneButton.click();
    }
    public void ClosePrintFinishTable() {
        ClosePrint.click();
    }
    public void FinishTables() {
        FinishTable.click();
    }
    public void CloseFinishTable() {
        CloseFinish.click();
    }
    public void PrintFinishTable() {
        PrintFinish.click();
    }
    public void ConfirmFinishTable() {
        ConfirmFinish.click();
    }
}
