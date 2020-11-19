package com.browser.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJILA\\eclipse-workspace\\AAAAAAAAA\\Driver\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		String s=driver.getCurrentUrl();
		System.out.println(s);
		String l=driver.getTitle();
		System.out.println(l);
		
		//xpath using text
		WebElement text1=driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		String a=text1.getText();
		System.out.println(a);
		
		//xpath using containsText
		WebElement text2=driver.findElement(By.xpath("//td[contains(text(),'Important')]"));
		String b=text2.getText();
		System.out.println(b);
		
		//locators using id
		WebElement mail=driver.findElement(By.id("username"));
		mail.sendKeys("Harishwarvijila");
		
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Viswaharishwar");
		
		
		WebElement log=driver.findElement(By.id("login"));
		log.click();
		
		WebElement loc=driver.findElement(By.name("location"));
		Select s1=new Select(loc);
		List<WebElement> dd=s1.getOptions();
		for(WebElement x:dd) {
			System.out.println(x.getAttribute("value"));
		}
		
		s1.selectByValue("Sydney");
		
		
		
	WebElement hotel=driver.findElement(By.name("hotels"));
	Select s2=new Select(hotel);
	List<WebElement> dd1=s2.getOptions();
	for(WebElement y:dd1) {
		System.out.println(y.getAttribute("value"));
	}
	
	s2.selectByIndex(2);
	

		
	WebElement room=driver.findElement(By.id("room_type"));
	Select s3=new Select(room);
	s3.selectByVisibleText("Deluxe");



	WebElement no=driver.findElement(By.id("room_nos"));
	Select s4=new Select(no);
	s4.selectByVisibleText("2 - Two");
	
	WebElement checkin=driver.findElement(By.id("datepick_in"));
	checkin.sendKeys("20/11/2020");
	
	
	WebElement checkout=driver.findElement(By.id("datepick_out"));
	checkout.sendKeys("21/11/2020");
	

	WebElement no1=driver.findElement(By.id("adult_room"));
	Select s5=new Select(no1);
	s5.selectByVisibleText("2 - Two");
	
		

	WebElement no2=driver.findElement(By.id("child_room"));
	Select s6=new Select(no2);
	s6.selectByVisibleText("1 - One");
	
	WebElement search=driver.findElement(By.id("Submit"));
	search.click();
	
	WebElement button=driver.findElement(By.id("radiobutton_0"));
	button.click();
	
	WebElement contin=driver.findElement(By.id("continue"));
	contin.click();
	
	
	WebElement FName=driver.findElement(By.id("first_name"));
	FName.sendKeys("Vijila");
	
	WebElement LName=driver.findElement(By.id("last_name"));
	LName.sendKeys("Vigneshwar");
	
	WebElement billing=driver.findElement(By.id("address"));
	billing.sendKeys("no.34, vaithi nagar, chennai");
	
	WebElement credit=driver.findElement(By.id("cc_num"));
	credit.sendKeys("9874561239874561");
	
	WebElement type=driver.findElement(By.id("cc_type"));
	Select s7=new Select(type);
	s7.selectByIndex(2);
	
	
	WebElement type1=driver.findElement(By.id("cc_exp_month"));
	Select s8=new Select(type1);
	s8.selectByIndex(11);
	
	WebElement type2=driver.findElement(By.id("cc_exp_year"));
	Select s9=new Select(type2);
	s9.selectByVisibleText("2022");
	
	WebElement creditnum=driver.findElement(By.id("cc_cvv"));
	creditnum.sendKeys("6540");
	
	WebElement book=driver.findElement(By.id("book_now"));
	book.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
