package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.security.krb5.internal.crypto.Des;
import sun.security.krb5.internal.crypto.DesCbcCrcEType;

public class EmployeeAdmin {

    @FindBy(xpath ="/html/body/div/div/div/div/div[1]/div[2]/button")
    private WebElement LogoutButton;

    @FindBy(xpath = "/html/body/div/div/nav/div[2]/a[2]")
    private WebElement MenuButton;

    @FindBy(xpath = " /html/body/div/div/div/div/div[2]/button")
    private WebElement AddMealButton;

    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/form/div[1]/input")
    private WebElement AddMealName;

            @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[2]/input")
            private WebElement AddMealDesc;

            @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[3]/input")
            private WebElement AddMealPrice;

            @FindBy(xpath = " /html/body/div/div/div/div[3]/div/form/div[4]/select/option[1]")
            private WebElement AddMealPredjelo;
            @FindBy(xpath = "     /html/body/div/div/div/div[3]/div/form/div[4]/select/option[2]")
            private WebElement AddMealGjelo;
            @FindBy(xpath = "      /html/body/div/div/div/div[3]/div/form/div[4]/select/option[3]")
            private WebElement AddMealDesert;
            @FindBy(xpath = "     /html/body/div/div/div/div[3]/div/form/div[4]/select/option[4]")
            private WebElement AddMealGrill;

            @FindBy(xpath = "     /html/body/div/div/div/div[3]/div/form/div[5]/input")
            private WebElement AddMealPdv;
            @FindBy(xpath = " /html/body/div/div/div/div[3]/div/form/div[6]/input")
            private WebElement AddMealPopust;

            @FindBy(xpath = " /html/body/div/div/div/div[3]/div/form/div[7]/button[1]")
            private WebElement AddMealConfirm;

        @FindBy(xpath = " /html/body/div/div/div/div[3]/div/div/button[1]")
         private WebElement DeletMealConfirm;

        @FindBy(xpath = "   /html/body/div/div/div/div/div[7]/div[8]/button[1]")
        private WebElement DeleteMeal;

            @FindBy(xpath = "   /html/body/div/div/div/div/div[7]/div[8]/button[2]")
            private WebElement EditMeal;


    @FindBy(xpath = "/html/body/div/div/nav/div[2]/a[3]")
    private WebElement TrafficButton;

    @FindBy(xpath = "  /html/body/div/div/div/div/div[2]/div[2]/div[2]/button[1]")
    private WebElement GenerateTrafficButton;

    @FindBy(xpath = " /html/body/div/div/div/div/div[2]/div[2]/div[2]/a")
    private WebElement DownTrafficButton;

            @FindBy(xpath = " /html/body/div/div/div/div/div[2]/div[2]/div[2]/button")
            private WebElement PrintTrafficButton;

            @FindBy(xpath = " /html/body/div/div/div/div[3]/div/div/button")
            private WebElement CloseTrafficPrintButton;



    @FindBy(xpath = "/html/body/div/div/nav/div[2]/a[1]")
    private WebElement EmployeeButton;

    @FindBy(xpath = "/html/body/div/div/div/div/button")
    private WebElement AddEmployeeButton;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[1]/input")
    private WebElement AddEmployeeName;
    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[2]/input")
    private WebElement AddEmployeeLName;
    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[3]/input")
    private WebElement AddEmployeeEmail;
    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[4]/input")
    private WebElement AddEmployeePass;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[5]/select/option[1]")
    private WebElement AddEmployeeAdmin;
    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[5]/select/option[2]")
    private WebElement AddEmployeeKuhar;
    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[5]/select/option[3]")
    private WebElement AddEmployeeKonobar;

    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/form/div[6]/button[1]")
    private WebElement AddEmployeeConfirm;
    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/form/div[6]/button[2]")
    private WebElement AddEmployeeDecline;

    @FindBy(xpath = " /html/body/div/div/div/div/div[5]/div[5]/button[1]")
    private WebElement DeleteEmployee;
    @FindBy(xpath = " /html/body/div/div/div/div/div[5]/div[5]/button[2]")
    private WebElement EditEmployee;

    @FindBy(xpath = " /html/body/div/div/div/div[3]/div/div/button[1]")
    private WebElement DeleteEmployeeConfirm;

    public void Traffic() {
        TrafficButton.click();
    }
    public void Menu() {
        MenuButton.click();
    }
    public void AddMeal() {
        AddMealButton.click();
    }
    public void AddMealConfirm() {
        AddMealConfirm.click();
    }
    public void setName1(String Name1) {
        AddMealName.sendKeys(Name1);
    }
    public void setLName1(String Desc) {
        AddMealDesc.sendKeys(Desc);
    }
    public void setPrice(String Price) {
        AddMealPrice.sendKeys(Price);
    }
    public void setRoleMeal() {
        AddMealGjelo.click();
    }

    public void setPdv(String LName1) {
        AddMealPdv.sendKeys(LName1);
    }
    public void setPopust(String LName1) {
        AddMealPopust.sendKeys(LName1);
    }

    public void Logout() {
        LogoutButton.click();
    }
    public void Employee() {
        EmployeeButton.click();
    }
    public void AddEmployee() {
        AddEmployeeButton.click();
    }

    public void Confirm() {
        AddEmployeeConfirm.click();
    }
    public void Decline() {
        AddEmployeeDecline.click();
    }
    public void setName(String Name) {
        AddEmployeeName.sendKeys(Name);
    }
    public void setLName(String LName) {
        AddEmployeeLName.sendKeys(LName);
    }
    public void setEmail(String Email) {
        AddEmployeeEmail.sendKeys(Email);
    }
    public void setPass(String Pass) {
        AddEmployeePass.sendKeys(Pass);
    }
    public void setRole() {
        AddEmployeeKuhar.click();
    }

    public void Delete() {
        DeleteEmployee.click();
    }

    public void Edit() {
        EditEmployee.click();
    }

    public void DeleteConfirm() {
        DeleteEmployeeConfirm.click();
    }
    public void DeleteMeal() {
        DeleteMeal.click();
    }

    public void EditMeal() {
        EditMeal.click();
    }

    public void DeleteMealCon() {
        DeletMealConfirm.click();
    }

    public void GenerateTraffic() {
        GenerateTrafficButton.click();
    }
    public void DownTraffic() {
        DownTrafficButton.click();
    }
    public void PrintTraffic() {
        PrintTrafficButton.click();
    }
    public void ClosePrintTraffic() {
        CloseTrafficPrintButton.click();
    }
}
