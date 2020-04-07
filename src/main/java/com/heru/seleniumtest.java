package com.heru;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumtest {
    static WebDriver webDriver;
@Before
public void setup(){
    webDriver=new ChromeDriver();
}
@Test
    public void start() throws InterruptedException {
    webDriver.get("https://www.baidu.com");

    System.out.println( webDriver.getTitle());
    WebElement element=webDriver.findElement(By.id("kw"));

    System.out.println(webDriver.getCurrentUrl());
    element.sendKeys("三国演义");
    element.sendKeys(Keys.ENTER);
   Thread.sleep(5000);
    Assert.assertEquals("三国演义_百度搜索",webDriver.getTitle());
    System.out.println("current page title is"+webDriver.getTitle());

}
@Test
public void second() throws InterruptedException {
    webDriver.get("https://www.baidu.com");
  webDriver.findElement(By.linkText("贴吧")).click();
    System.out.println(webDriver.getCurrentUrl());
    Thread.sleep(2000);
}
@After
    public void setdown(){

    webDriver.quit();
}
}
