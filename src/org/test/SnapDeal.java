package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\WindowsHandling\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("iphone 7");
		WebElement enter=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		enter.click();
		WebElement iphn=driver.findElement(By.xpath("(//p[@class='product-title '])[1]"));
		iphn.click();
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(par+"\n"+all);
		for(String x:all)
		{
			if(!x.equals(par))
			{
				driver.switchTo().window(x);
				WebElement cart=driver.findElement(By.xpath("//span[text()='add to cart']"));
				cart.click();
				WebElement chkout=driver.findElement(By.xpath("//a[@class='btn marR5']"));
				chkout.click();
			}
		}
	}

}
