package Codingpractice10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChatbotTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qachatbot.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@id='userInput']"));
        element.sendKeys("Hi");
        WebElement element1= driver.findElement(By.xpath("//button[@id='sendMsgBtn']"));
        element1.click();
        WebElement element2=driver.findElement(By.xpath("//input[@id='userInput']"));
        element2.sendKeys("GoodMorning");
        WebElement element3= driver.findElement(By.xpath("//button[@id='sendMsgBtn']"));
        element3.click();
        WebElement element4=driver.findElement(By.xpath("//input[@id='userInput']"));
        element4.sendKeys("Help");
        WebElement element5= driver.findElement(By.xpath("//button[@id='sendMsgBtn']"));
        element5.click();
        List<WebElement> elementList=driver.findElements(By.xpath("//div[@id='chatContainer']/descendant::span"));
        for(int i=0;i<elementList.size();i++){
            System.out.println(elementList.get(i).getText());
        }
    }

}
