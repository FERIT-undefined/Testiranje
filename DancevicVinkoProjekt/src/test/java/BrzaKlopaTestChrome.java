import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeeAdmin;
import pages.LoginPage;
import pages.OrdersKonobar;
import pages.OrdersKuhar;

import java.util.concurrent.TimeUnit;

public class BrzaKlopaTestChrome {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTest() {
        driver = Browsers.startBrowser(Inputs.CHROME_TEST, Inputs.BASE_URL);
    }

    @Test(description = "Prijava i odjava korisnika")
    public void Test1() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME2, Inputs.LOGIN_PASSWORD2);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        OrdersKuhar OrdPage = PageFactory.initElements(driver, OrdersKuhar.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdPage.Logout();
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME1, Inputs.LOGIN_PASSWORD1);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        EmployeeAdmin EmpPage = PageFactory.initElements(driver, EmployeeAdmin.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        EmpPage.Menu();
        Thread.sleep(5000);
        EmpPage.Employee();
        Thread.sleep(5000);
        EmpPage.Traffic();
        Thread.sleep(5000);
        EmpPage.Logout();
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME, Inputs.LOGIN_PASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        OrdersKonobar OrdersPage = PageFactory.initElements(driver, OrdersKonobar.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdersPage.Menu();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdersPage.Orders();
        Thread.sleep(5000);
        OrdersPage.Tables();
        Thread.sleep(5000);
        OrdersPage.Logout();
        Thread.sleep(5000);

    }

    public String Name = "Vinko";
    public String LName = "Test";
    public String Email = "vinko@test.com";
    public String Pass = "Vinko123";

    @Test(description = "Generiranje, stvaranje, uređivanje i brisanje zaposlenika")
    public void Test2() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME1, Inputs.LOGIN_PASSWORD1);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        EmployeeAdmin EmpPage = PageFactory.initElements(driver, EmployeeAdmin.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        EmpPage.Employee();
        Thread.sleep(5000);
        EmpPage.AddEmployee();
        Thread.sleep(5000);

        EmpPage.setName(Name);
        //Thread.sleep(5000);
        EmpPage.setLName(LName);
        //Thread.sleep(5000);
        EmpPage.setEmail(Email);
        //Thread.sleep(5000);
        EmpPage.setPass(Pass);
       // Thread.sleep(5000);
        EmpPage.setRole();
        Thread.sleep(5000);

        EmpPage.Confirm();
        EmpPage.Employee();
        Thread.sleep(5000);

        EmpPage.Edit();
        Thread.sleep(5000);
        EmpPage.Confirm();
        EmpPage.Employee();
        Thread.sleep(5000);

        EmpPage.Delete();
        Thread.sleep(5000);
        EmpPage.DeleteConfirm();
        EmpPage.Employee();
        Thread.sleep(5000);

        EmpPage.Logout();
        Thread.sleep(5000);


    }

    public String Name1 = "Juha";
    public String Desc = "Testna juha";
    public String Value = "29";
    public String Pdv = "21";
    public String Popust = "3";

    @Test(description = "Generiranje, stvaranje, uređivanje, pretraživanje i brisanje jela")
    public void Test3() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME1, Inputs.LOGIN_PASSWORD1);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        EmployeeAdmin EmpPage = PageFactory.initElements(driver, EmployeeAdmin.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        EmpPage.Menu();
        Thread.sleep(5000);
        EmpPage.AddMeal();
        Thread.sleep(5000);

        EmpPage.setName1(Name1);
        //Thread.sleep(5000);
        EmpPage.setLName1(Desc);
        //Thread.sleep(5000);
        //EmpPage.setPrice(Value);
        //Thread.sleep(5000);
        //EmpPage.setPdv(Pdv);
        // Thread.sleep(5000);
        //EmpPage.setPdv(Popust);
        // Thread.sleep(5000);
        EmpPage.setRoleMeal();
        Thread.sleep(5000);

        EmpPage.AddMealConfirm();
        EmpPage.Menu();
        Thread.sleep(5000);

        EmpPage.EditMeal();
        Thread.sleep(5000);
        EmpPage.AddMealConfirm();
        EmpPage.Menu();
        Thread.sleep(5000);

        EmpPage.DeleteMeal();
        Thread.sleep(5000);
        EmpPage.DeleteMealCon();
        EmpPage.Menu();
        Thread.sleep(5000);

        EmpPage.Logout();
        Thread.sleep(5000);


    }

    @Test(description = " Generiranje, preuzimanje i ispis prometa")
    public void Test4() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME1, Inputs.LOGIN_PASSWORD1);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        EmployeeAdmin EmpPage = PageFactory.initElements(driver, EmployeeAdmin.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        EmpPage.Traffic();
        Thread.sleep(5000);
        EmpPage.GenerateTraffic();
        Thread.sleep(5000);
        EmpPage.DownTraffic();
        Thread.sleep(5000);
        EmpPage.PrintTraffic();
        Thread.sleep(5000);
        EmpPage.ClosePrintTraffic();
        Thread.sleep(5000);

        EmpPage.Logout();
        Thread.sleep(5000);


    }



    @Test(description = " Generiranje, promjena i zaključivanje narudžbi")
    public void Test5() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME, Inputs.LOGIN_PASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        OrdersKonobar OrdPage = PageFactory.initElements(driver, OrdersKonobar.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdPage.Orders();
        Thread.sleep(5000);
/*
        OrdPage.SaveDone();
        Thread.sleep(5000);
        OrdPage.ConfirmSaveDone();
        Thread.sleep(5000);
*/
        OrdPage.FinishTables();
        Thread.sleep(5000);
        OrdPage.CloseFinishTable();
        Thread.sleep(5000);

/*
        OrdPage.FinishTables();
        Thread.sleep(5000);
        OrdPage.PrintFinishTable();
        Thread.sleep(5000);
        OrdPage.ClosePrintFinishTable();
        Thread.sleep(5000);

        OrdPage.FinishTables();
        Thread.sleep(5000);
        OrdPage.ConfirmFinishTable();
        Thread.sleep(5000);
*/

        OrdPage.Logout();
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME2, Inputs.LOGIN_PASSWORD2);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        OrdersKuhar OrderePage = PageFactory.initElements(driver, OrdersKuhar.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrderePage.ChangeStatus();
        Thread.sleep(5000);
        OrderePage.ConfirmChangeStatus();

        OrderePage.Logout();
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME, Inputs.LOGIN_PASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdPage.Orders();
        Thread.sleep(5000);

        OrdPage.Logout();
        Thread.sleep(5000);
    }



    @Test(description = " Generiranje i odabir stolova")
    public void Test6() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME, Inputs.LOGIN_PASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        OrdersKonobar OrdPage = PageFactory.initElements(driver, OrdersKonobar.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdPage.Tables();
        Thread.sleep(5000);

        OrdPage.ChooseTakenTable();
        Thread.sleep(5000);
        OrdPage.CloseTakenTable();
        Thread.sleep(5000);
        OrdPage.ChooseTable();
        Thread.sleep(5000);
        OrdPage.CloseTable();


        OrdPage.Logout();
        Thread.sleep(5000);
    }




    @Test(description = " Stvaranje, brisanje i potvrda narudžbi")
    public void Test7() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME, Inputs.LOGIN_PASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        OrdersKonobar OrdPage = PageFactory.initElements(driver, OrdersKonobar.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdPage.Tables();
        Thread.sleep(5000);

        OrdPage.ChooseTable();
        Thread.sleep(5000);

        OrdPage.AddMealOrder();
        Thread.sleep(5000);
        OrdPage.AddMealOrder();
        Thread.sleep(5000);
        OrdPage.SubMealOrder();
        Thread.sleep(5000);
        OrdPage.ConfirmMealOrder();
        Thread.sleep(5000);
        OrdPage.ConfirmOrder();
        Thread.sleep(5000);
        OrdPage.Orders();
        Thread.sleep(5000);

        OrdPage.Logout();
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME2, Inputs.LOGIN_PASSWORD2);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        OrdersKuhar OrderePage = PageFactory.initElements(driver, OrdersKuhar.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrderePage.ChangeStatus();
        Thread.sleep(5000);
        OrderePage.ConfirmChangeStatus();

        OrderePage.Logout();
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.writeLoginInfo(Inputs.LOGIN_NAME, Inputs.LOGIN_PASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        OrdPage.Orders();
        Thread.sleep(5000);

        OrdPage.Logout();
        Thread.sleep(5000);
    }


    @AfterMethod
    public void teardownTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
