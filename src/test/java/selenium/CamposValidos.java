package selenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CamposValidos {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
      
    System.setProperty("webdriver.gecko.driver","C:\\Geckodriver_0.18\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/ProyectoTesting/index.jsp";
    driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
  }

  @Test
  public void testCamposValidos() throws Exception {
    driver.get(baseUrl);
    
    driver.findElement(By.id("indentificador")).click();
    driver.findElement(By.id("indentificador")).clear();
    driver.findElement(By.id("indentificador")).sendKeys("19");
    driver.findElement(By.id("monto")).clear();
    driver.findElement(By.id("monto")).sendKeys("600000");
    driver.findElement(By.name("cuotas")).clear();
    driver.findElement(By.name("cuotas")).sendKeys("12");
    driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
    driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
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
    new Select(driver.findElement(By.id("comunas"))).selectByVisibleText("Macul");
    driver.findElement(By.name("submit")).click();

  }
  
  @Test
  public void testValidarRut() throws IOException, MalformedURLException, InterruptedException{
      
      driver.get(baseUrl);
      driver.findElement(By.id("indentificador")).sendKeys("3");
      driver.findElement(By.id("monto")).sendKeys("600000");
      driver.findElement(By.name("cuotas")).sendKeys("12");
      driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
      driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
      driver.findElement(By.id("ap")).click();     
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("RUT INVALIDO", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
  }
  
  @Test
  public void testValidarMonto() throws IOException, MalformedURLException, InterruptedException{
      
      driver.get(baseUrl);
      driver.findElement(By.id("indentificador")).sendKeys("19");
      driver.findElement(By.id("monto")).sendKeys("400000");
      driver.findElement(By.name("cuotas")).sendKeys("12");
      driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
      driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
      driver.findElement(By.id("ap")).click();     
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("MONTO INVALIDO", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
  }
  
    @Test
  public void testValidarCuotas() throws IOException, MalformedURLException, InterruptedException{
      
      driver.get(baseUrl);
      driver.findElement(By.id("indentificador")).sendKeys("19");
      driver.findElement(By.id("monto")).sendKeys("600000");
      driver.findElement(By.name("cuotas")).sendKeys("11");
      driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
      driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
      driver.findElement(By.id("ap")).click();     
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("CUOTA INVALIDA", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
  }
  
      @Test
  public void testValidarNombre() throws IOException, MalformedURLException, InterruptedException{
      
    driver.get(baseUrl);
    
    driver.findElement(By.id("indentificador")).click();
    driver.findElement(By.id("indentificador")).clear();
    driver.findElement(By.id("indentificador")).sendKeys("19");
    driver.findElement(By.id("monto")).clear();
    driver.findElement(By.id("monto")).sendKeys("600000");
    driver.findElement(By.name("cuotas")).clear();
    driver.findElement(By.name("cuotas")).sendKeys("12");
    driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
    driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
    driver.findElement(By.id("ap")).click();
    driver.findElement(By.id("rut")).clear();
    driver.findElement(By.id("rut")).sendKeys("19");
    driver.findElement(By.id("nombre")).clear();
    driver.findElement(By.id("nombre")).sendKeys("123");
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
    new Select(driver.findElement(By.id("comunas"))).selectByVisibleText("Macul");
    driver.findElement(By.name("submit")).click();    
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("NOMBRE INVALIDO", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
  }
  
        @Test
  public void testValidarRenta() throws IOException, MalformedURLException, InterruptedException{
      
    driver.get(baseUrl);
    
    driver.findElement(By.id("indentificador")).click();
    driver.findElement(By.id("indentificador")).clear();
    driver.findElement(By.id("indentificador")).sendKeys("19");
    driver.findElement(By.id("monto")).clear();
    driver.findElement(By.id("monto")).sendKeys("600000");
    driver.findElement(By.name("cuotas")).clear();
    driver.findElement(By.name("cuotas")).sendKeys("12");
    driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
    driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
    driver.findElement(By.id("ap")).click();
    driver.findElement(By.id("rut")).clear();
    driver.findElement(By.id("rut")).sendKeys("19");
    driver.findElement(By.id("nombre")).clear();
    driver.findElement(By.id("nombre")).sendKeys("nicolas");
    driver.findElement(By.id("apellido")).clear();
    driver.findElement(By.id("apellido")).sendKeys("flores");
    driver.findElement(By.id("renta")).clear();
    driver.findElement(By.id("renta")).sendKeys("200000");
    driver.findElement(By.id("celular")).clear();
    driver.findElement(By.id("celular")).sendKeys("994573188");
    driver.findElement(By.id("telefono")).clear();
    driver.findElement(By.id("telefono")).sendKeys("26451419");
    driver.findElement(By.id("correo")).clear();
    driver.findElement(By.id("correo")).sendKeys("nico@gmail.com");
    new Select(driver.findElement(By.id("regiones"))).selectByVisibleText("Región Metropolitana de Santiago");
    new Select(driver.findElement(By.id("comunas"))).selectByVisibleText("Macul");
    driver.findElement(By.name("submit")).click();    
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("RENTA INVALIDO", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
  }

          @Test
  public void testValidarCelular() throws IOException, MalformedURLException, InterruptedException{
      
    driver.get(baseUrl);
    
    driver.findElement(By.id("indentificador")).click();
    driver.findElement(By.id("indentificador")).clear();
    driver.findElement(By.id("indentificador")).sendKeys("19");
    driver.findElement(By.id("monto")).clear();
    driver.findElement(By.id("monto")).sendKeys("600000");
    driver.findElement(By.name("cuotas")).clear();
    driver.findElement(By.name("cuotas")).sendKeys("12");
    driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
    driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
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
    driver.findElement(By.id("celular")).sendKeys("94573188");
    driver.findElement(By.id("telefono")).clear();
    driver.findElement(By.id("telefono")).sendKeys("26451419");
    driver.findElement(By.id("correo")).clear();
    driver.findElement(By.id("correo")).sendKeys("nico@gmail.com");
    new Select(driver.findElement(By.id("regiones"))).selectByVisibleText("Región Metropolitana de Santiago");
    new Select(driver.findElement(By.id("comunas"))).selectByVisibleText("Macul");
    driver.findElement(By.name("submit")).click();    
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("CELULAR INVALIDO", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
  }
  
            @Test
  public void testValidarTelefono() throws IOException, MalformedURLException, InterruptedException{
      
    driver.get(baseUrl);
    
    driver.findElement(By.id("indentificador")).click();
    driver.findElement(By.id("indentificador")).clear();
    driver.findElement(By.id("indentificador")).sendKeys("19");
    driver.findElement(By.id("monto")).clear();
    driver.findElement(By.id("monto")).sendKeys("600000");
    driver.findElement(By.name("cuotas")).clear();
    driver.findElement(By.name("cuotas")).sendKeys("12");
    driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
    driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
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
    driver.findElement(By.id("telefono")).sendKeys("6451419");
    driver.findElement(By.id("correo")).clear();
    driver.findElement(By.id("correo")).sendKeys("nico@gmail.com");
    new Select(driver.findElement(By.id("regiones"))).selectByVisibleText("Región Metropolitana de Santiago");
    new Select(driver.findElement(By.id("comunas"))).selectByVisibleText("Macul");
    driver.findElement(By.name("submit")).click();    
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("TELEFONO INVALIDO", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
  }
  
              @Test
  public void testValidarCorreo() throws IOException, MalformedURLException, InterruptedException{
      
    driver.get(baseUrl);
    driver.findElement(By.id("indentificador")).click();
    driver.findElement(By.id("indentificador")).clear();
    driver.findElement(By.id("indentificador")).sendKeys("19");
    driver.findElement(By.id("monto")).clear();
    driver.findElement(By.id("monto")).sendKeys("600000");
    driver.findElement(By.name("cuotas")).clear();
    driver.findElement(By.name("cuotas")).sendKeys("12");
    driver.findElement(By.id("datepicker")).sendKeys("29/12/2018");
    driver.findElement(By.xpath("//html/body/div[1]/form/div/label[2]")).click();
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
    driver.findElement(By.id("correo")).sendKeys("nicogmail.com");
    new Select(driver.findElement(By.id("regiones"))).selectByVisibleText("Región Metropolitana de Santiago");
    new Select(driver.findElement(By.id("comunas"))).selectByVisibleText("Macul");
    driver.findElement(By.name("submit")).click();    
     Alert alert = driver.switchTo().alert();

      try{

          assertEquals("CORREO INVALIDO", closeAlertAndGetItsText());
          
      }catch(Error e){
          
          fail("ERROR, TXT NO IGUALES O NO HAY ALERTA");
      }
     
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
  
  private WebElement getElemento(WebDriver webDriver, String tipo, String dato) throws MalformedURLException, IOException, InterruptedException {
        WebElement elemento = null; //Localizador
        WebDriverWait wait = null;
        try {
            switch (tipo) {
                case "ID":
                    wait = new WebDriverWait(webDriver, 30);
                    elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(dato)));
                    break;
                case "NAME":
                    wait = new WebDriverWait(webDriver, 30);
                    elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(dato)));
                    break;
                case "XPATH":
                    wait = new WebDriverWait(webDriver, 30);
                    elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dato)));
                    break;
                case "id1":
                    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[style='overflow: visible; height: 500px; width: 600px;']")));
                    wait = new WebDriverWait(webDriver, 30);
                    elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(dato)));
                    break;
               
                case "CSS":
                    wait = new WebDriverWait(webDriver, 30);
                    elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(dato)));
                    break;
                   
            }
        } catch (TimeoutException ex) {
            System.out.println("Error: se ha producido una demora mayor a la esperada (30seg)" + " " + dato);
            //driver.close();
            return null;
        }
        return elemento;
    }
}
