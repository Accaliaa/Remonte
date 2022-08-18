package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    static WebDriver driver;

    @Before
    public void before() {
        String webdriv = ("C:\\Users\\zdasser\\Tools\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", webdriv);
        driver = new ChromeDriver();
    }

    @Given("connected to URL")
    public void connectedToURL() throws InterruptedException {
        driver.get("https://www.avito.ma/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Se connecter']")).click();
    }

    @Then("login page appears")
    public void login_page_appears() {
        System.out.println("Login page appeared");
    }

    @Given("login page opened")
    public void login_page_opened() {
        System.out.println("on page");
    }

    @When("I fill in my {string}")
    public void i_fill_in_my(String email) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("E-mail")).sendKeys(email);
    }

    @And("I fill in my password {string}")
    public void iFillInMyPassword(String pwd) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("Mot de passe")).sendKeys(pwd);
    }

    @When("I click on connect button")
    public void i_click_on_connect_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Se connecter']")).click();
    }

    @Then("Pop up appears")
    public void pop_up_appears() throws InterruptedException {
        Thread.sleep(3000);
        String titre = driver.findElement(By.xpath("//h2[contains(text(),'Oops')]")).getText();
        Assert.assertEquals(titre, "Oops...");
    }

    @After
    public void after() {
        driver.close();
    }
}



