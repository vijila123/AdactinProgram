package com.browser.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJILA\\eclipse-workspace\\AAAAAAAAA\\Driver\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flysas.com/en/");
		String s=driver.getCurrentUrl();
		System.out.println(s);
		String l=driver.getTitle();
		System.out.println(l);
		
		/*WebElement clo=driver.findElement(By.xpath("//span[@class='icon-close-black']"));
		clo.click();*/
		
	
		WebElement loca=driver.findElement(By.id("link_SG"));
		loca.click();
		/*Select s1=new Select(loca);
		s1.selectByIndex(14);*/
		
		WebElement lan=driver.findElement(By.id("market-language"));
		Select s2=new Select(lan);
		s2.selectByVisibleText("English");
		
		WebElement airport=driver.findElement(By.id("market-airport"));
		Select s3=new Select(airport);
		s3.selectByValue("singapore");
		
		WebElement change=driver.findElement(By.xpath("//button[@class='btn primary medium large-12 medium-12 mrgn-b-20 pull-left']"));
		change.click();
		
		//xpath using text
		WebElement text1=driver.findElement(By.xpath("//h2[@class='bg-deep-blue text-white']"));
		String a=text1.getText();
		System.out.println(a);
		
		//xpath using containsText
		WebElement text2=driver.findElement(By.xpath("//td[contains(text(),' flexible ')]"));
		String b=text2.getText();
		System.out.println(b);
		
		
		
		WebElement log=driver.findElement(By.id("cutomer-not-logged"));
		log.click();
		
		//click register using locator(id)
		WebElement mail=driver.findElement(By.id("joinNow"));
		mail.click();
		
		WebElement password=driver.findElement(By.id("FirstName"));
		password.sendKeys("Vijila");
		
		WebElement Reg=driver.findElement(By.id("LastName"));
		Reg.sendKeys("V");
		
		WebElement reg1=driver.findElement(By.id("email"));
		reg1.sendKeys("vijilavigneshwar@gmail.com");
		
		WebElement Reg2=driver.findElement(By.id("Phone"));
		Reg2.sendKeys("9003041054");
		
		WebElement next=driver.findElement(By.id("btnNewRegister1"));
		next.click();
		
		WebElement Date=driver.findElement(By.id("noDateOfBirth"));
		Date.sendKeys("25/12/1993");
			

		WebElement gen=driver.findElement(By.id("gender1"));
		Select s4=new Select(gen);
		s4.selectByIndex(1);
		
		WebElement coun=driver.findElement(By.id("country"));
		coun.sendKeys("India");
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Vijila@2020");
		
		WebElement next1=driver.findElement(By.id("btnNewRegister2"));
		next1.click();
		


	}

}
