//package com.AmazonPrimePack;
package AmazonPrimePack;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import AmazonPrimePack.util.loggerUtiljava;




public class AmazonPrimesClass {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        

    	Logger logger = loggerUtiljava.getLoggerUtil();
        System.setProperty("webdriver.gecko.driver","C:\\Users\\suman_priya\\Work Space\\Jar files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        
        String url= ("https://www.amazon.com");
        //Thread.sleep(600);
        String expectedTitle = "Amazon";
        driver.get(url);
        Thread.sleep(600);
        if (driver.getTitle().equals(expectedTitle));
        logger.info("Amazon page title is : " +driver.getTitle());
        
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[1]")).click();
        driver.findElement(By.id("ap_email")).sendKeys("supriya098@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("supriya098");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
        Thread.sleep(600);
        //Deals in books
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[8]/a")).click();
        Thread.sleep(600);
        //Arts & photography
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[2]/div/ul[2]/ul/div/li[1]/span/a/span")).click();
        
        //String expectedBookTitle ="Suzuki Violin School, Vol 3: Violin Part";
        //if (driver.getTitle().equals(expectedBookTitle));
        //System.out.println("Book Title is  : " + driver.getTitle());
        
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a/span")).click(); 
        //paperback
        driver.findElement(By.xpath("//*[@id=\"a-autoid-7-announce\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        
        Thread.sleep(500);
        
        //cart
        driver.findElement(By.xpath("//*[@id=\"hlb-view-cart-announce\"]")).click();
        Thread.sleep(500);
        //proceed to check out out
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/div/div[1]/div[1]/form/div[3]/div[2]/div/div[3]/span/span/input")).click();
        //Thread.sleep(500);
        //String expectedShippingTitlePage ="Select a shipping address";
        //if (driver.getTitle().equals(expectedShippingTitlePage));
        //System.out.println("Shipping Address Title Page is  : " + driver.getTitle());
        Thread.sleep(500);
        //deliver to this address
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div/div[1]/div[2]/span/a")).click();
       
        driver.findElement(By.xpath(" /html/body/div[5]/div/div/div[2]/div[1]/form/div[1]/div[2]/div/span[1]/span/input")).click();
        
        String expectedPaymentMethod = "Select a payment method";
        if (driver.getTitle().equals(expectedPaymentMethod));
        logger.info("Payment Title is  : " + driver.getTitle());
        
        
       driver.close();
                              
           

    }

}

	
	
