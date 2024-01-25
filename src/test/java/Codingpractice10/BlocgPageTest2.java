package Codingpractice10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BlocgPageTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qabloglist.ccbp.tech/");
        driver.manage().window().maximize();
      List<WebElement> element1=driver.findElements(By.xpath("//h1[contains(text(),'My fifth post')]/preceding::h1[@class='blog-title']"));
      for(int i=0;i< element1.size();i++){
          System.out.println(element1.get(i).getText());
          }
      List<WebElement>elements = driver.findElements(By.xpath("//a[contains(text(),'Home')]/following::a[1]"));
      for(WebElement str:elements){
          str.click();
      }
      String Str=driver.getCurrentUrl();
      String str2="https://qabloglist.ccbp.tech/about";
      if(Str.equals(str2)){
          System.out.println("Navigation to About Page Successful");
      }
        List<WebElement>elements1 = driver.findElements(By.xpath("//a[contains(text(),'Home')]/following::a[2]"));
        for(WebElement el1:elements1){
            el1.click();
        }
        String Str4= driver.getCurrentUrl();
        String Str5="https://qabloglist.ccbp.tech/contact";
        if(Str4.equals(Str5)) {
            System.out.println("Navigation to Contact Page Successful");
        }
        driver.quit();
      }
    }



