package Codingpractice10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FeaturePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qafeaturesect.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//span[@class='interaction']"));
        String str=element.getText();
        System.out.println(str);
        WebElement element1= driver.findElement(By.xpath("//span[@class='interaction']/parent::p[@class='vr-features-card-description']"));
        String str1=element1.getText();
        System.out.println(str1);
        List<WebElement> element2=driver.findElements(By.xpath("//h1[text()='Interaction']/ancestor::div[position()=2]/following::p"));
        for(WebElement str7:element2){
            System.out.println(str7.getText());
        }
        List<WebElement>element3=driver.findElements(By.xpath("//p[@class='vr-features-card-description']/ancestor::div[position()=2]/preceding::p"));
        for(WebElement str7:element3){
            System.out.println(str7.getText());
        }
        driver.quit();
    }
}
