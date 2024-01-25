package Codingpractice10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CapitalsaappTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qacapitalsapp.ccbp.tech/");
        driver.manage().window().maximize();
      List<WebElement>element1=driver.findElements(By.xpath("//select[@class='capital-select']/child::option"));
      String []Str1={"New Delhi","London","Paris","Kathmandu","Helsinki"};
      String[]Actualoption=new String[element1.size()];
      for(int i=0;i<element1.size();i++){
          Actualoption[i]=element1.get(i).getText();
    }
      boolean match=java.util.Arrays.equals(Str1,Actualoption);
      if(match){
          System.out.println("All options are as expected");
      }else{
          System.out.println("Mismatch found");
      }
      driver.quit();
    }
}
