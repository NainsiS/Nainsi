package Pkg2;

import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Selenium
{
 public static void main(String[] args) 
 {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hbss\\Desktop\\chromedriver.exe");
 ChromeDriver driver= new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.manage().window().maximize();
 WebElement firstname=driver.findElementById("u_0_l");
 firstname.sendKeys("Nainsi");
 WebElement Surname=driver.findElementById("u_0_n");
 Surname.sendKeys("Sharma");
 WebElement MobileNo=driver.findElementById("u_0_q");
 MobileNo.sendKeys("2622626666");
 WebElement NewPassword=driver.findElementById("u_0_x");
 NewPassword.sendKeys("Hbss2004");
 }
}
