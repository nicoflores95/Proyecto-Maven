package selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TodoValido {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
      
       System.setProperty("webdriver.gecko.driver","C:\\Geckodriver_0.18\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/ProyectoTesting/index.jsp";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTodoValido() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.id("indentificador")).click();
    driver.findElement(By.id("indentificador")).clear();
    driver.findElement(By.id("indentificador")).sendKeys("19");
    driver.findElement(By.id("monto")).clear();
    driver.findElement(By.id("monto")).sendKeys("600000");
    driver.findElement(By.name("cuotas")).clear();
    driver.findElement(By.name("cuotas")).sendKeys("30");
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.linkText("20")).click();
    driver.findElement(By.id("desgravamen")).click();
    driver.findElement(By.id("protegido")).click();
    driver.findElement(By.id("ap")).click();
    driver.findElement(By.id("rut")).clear();
    driver.findElement(By.id("rut")).sendKeys("19");
    driver.findElement(By.id("nombre")).clear();
    driver.findElement(By.id("nombre")).sendKeys("nicolas");
    driver.findElement(By.id("apellido")).clear();
    driver.findElement(By.id("apellido")).sendKeys("flores");
    driver.findElement(By.id("renta")).clear();
    driver.findElement(By.id("renta")).sendKeys("600000");
    driver.findElement(By.id("celular")).clear();
    driver.findElement(By.id("celular")).sendKeys("994573188");
    driver.findElement(By.id("telefono")).clear();
    driver.findElement(By.id("telefono")).sendKeys("26451419");
    driver.findElement(By.id("correo")).clear();
    driver.findElement(By.id("correo")).sendKeys("nico@gmail.com");
    new Select(driver.findElement(By.id("regiones"))).selectByVisibleText("Región Metropolitana de Santiago");
    new Select(driver.findElement(By.id("comunas"))).selectByVisibleText("Maipú");
    driver.findElement(By.name("submit")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
