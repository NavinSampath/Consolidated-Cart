package ElementObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.base;

public class GamingElements extends base {
	 Actions ac = new Actions(driver);
	 JavascriptExecutor js = (JavascriptExecutor) driver ;
	 
	 @FindBy(xpath ="//iframe[@name='yie-iframe-2fe77361-7691-5685-be7d-712c26886376-f6382748-8ec3-4bfe-9c0f-2333debb4fcd']")
	 public WebElement logigpopiframe;
	 
	 @FindBy(xpath = "//*[@id=\"element-63776\"]")
	 public WebElement logigpopiclose;
	 
	 @FindBy(xpath ="//ul[@class='other-brands brand-nav-left js-brand-nav-left']//li[1]//a[1]")
	 public WebElement logitechbtn;
	 
	 @FindBy(xpath = "//ul[@class='other-brands brand-nav-left js-brand-nav-left']//li[2]//a[1]")
	 public WebElement jaybirdbtn ;
	 
	@FindBy(xpath = "//ul[@class='other-brands brand-nav-left js-brand-nav-left']//li[3]//a[1]")
	public WebElement uebtn ;
			 
	@FindBy(xpath = "//ul[@class='other-brands brand-nav-left js-brand-nav-left']//li[4]//a[1]")
	public WebElement astro ;

	@FindBy (xpath = "//button[@id='menu']")
	public WebElement harmburg ;
	
	@FindBy(xpath= "//li[@class='nav-category current selected']//a")
	public WebElement products ;
	
	@FindBy(xpath = " //div[@class='blade blade-0 selected']//li[1]//a[1]")
	public WebElement gamingmice ;
	
	@FindBy(xpath = "//div[@class='product-grid-wrapper']//div[2]//a[1]//div[1]//div[1]//span[1]")
	public  WebElement G604;
	
	@FindBy(xpath = "//div[@class='product-details product-info-banner']//span[contains(text(),'Add To Cart')]")
	public WebElement Atc ;
	
	@FindBy(xpath= "/html[1]/body[1]/header[1]/nav[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement astroproducts;
	
	@FindBy(xpath= " //div[contains(@class,'subnav js-subnav has-list-links open')]//div[contains(@class,'nav-items')]//div[1]//a[1]")
	public WebElement astroheadsets;
	
	@FindBy(xpath= "//section[contains(@class,'plp js-plp')]//a[1]")
	public WebElement astropro;
	
	@FindBy (xpath = "//div[@class='select-ctn js-select-ctn primary']//select")
	public WebElement dropdown;
	
	@FindBy (xpath ="//a[contains(@class,'btn-primary add-to-cart js-add-to-cart')]")
	public WebElement astroatc;
	
	
	@FindBy (xpath ="//a[@class='primary-top-link js-primary-top-link'][contains(text(),'Shop')]")
	public WebElement jayshop;
	
	@FindBy (xpath ="//li[@class='category-item pushed']//a//img")
	public WebElement jayvista;
	
	@FindBy (xpath ="//a[@class='btn-add-to-cart js-add-to-cart']")
	public WebElement jayatc;
	
	@FindBy(xpath = "//span[@class='hamburger']")
	public WebElement ueharmburger;
	
	@FindBy(xpath = "//div[contains(@class,'product-list hidden-xs hidden-sm row')]//div[1]//a[1]//img[1]")
	public WebElement uemegablast;
	
	@FindBy(xpath = "//div[@class='secondary-nav-cta']//div[@class='component-cta-button']")
	public WebElement uebuynow ;
	
	
	
	@FindBy(xpath = "//a[contains(@class,'add-to-cart-btn btn btn-primary-inverted')]//span[contains(text(),'Add to cart')]")
	public WebElement ueatc;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/a[1]/span[1]")
	public WebElement ueatc1;
	
	@FindBy(xpath = "//a[@class='close-product-modal hidden-xs']")
	public WebElement close;
	
	
	@FindBy (xpath = "//span[@class='close']")
	public WebElement logipopclose;
	
	@FindBy(xpath = "//a[contains(text(),'PRODUCTS')]")
	public WebElement logipro;
	
	@FindBy(xpath = "//div[5]//section[1]//div[1]//div[1]//section[1]//figure[1]//ul[1]//li[1]//a[1]")
	public WebElement logimice;
	
	@FindBy(xpath = "//div[contains(@class,'products-and-filter container')]//div[1]//div[1]//div[1]//a[1]//img[1]")
			public WebElement logimx;
	
	@FindBy(xpath = "//span[contains(text(),'Buy Now')]")
			public WebElement logibuy;
	
	@FindBy(xpath = "//a[@class='link-button js-addToCartBtn btn-apollo ciano secondary inverse']//span[contains(text(),'Add To Cart')]")
	public WebElement logiatc;
	
	
	Set<String> tabs ;
	ArrayList<String> tabs1 ;
	String current ;
	WebDriverWait wb =new WebDriverWait(driver, 1000000);
	
	public GamingElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openingallpartnertabs() throws InterruptedException
	{
		driver.get("https://www.logitechg.com/en-us");
		current = driver.getWindowHandle();
		driver.switchTo().frame(logigpopiframe);
		//wb.until(ExpectedConditions.visibilityOf(logigpopiclose));
		logipopclose.click();
		driver.switchTo().defaultContent();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		logitechbtn.sendKeys(selectLinkOpeninNewTab);
		driver.switchTo().window(current);
		jaybirdbtn.click();
		driver.switchTo().window(current);
		uebtn.click();
		driver.switchTo().window(current);
		astro.click();
		driver.switchTo().window(current);
		tabs = driver.getWindowHandles();
		tabs1 =  new ArrayList<String>(tabs);
		driver.switchTo().window(tabs1.get(4));
		driver.get("https://www.astrogaming.com/en-us");
		driver.switchTo().window(current);
		driver.switchTo().window(tabs1.get(3));
		driver.get("https://www.ultimateears.com/en-us");
		driver.switchTo().window(current);
	}
	
	public void addingproductsinlogitechg()
	{
		
		harmburg.click();
		ac.moveToElement(products).moveToElement(gamingmice).click().build().perform();
		js.executeScript("arguments[0].scrollIntoView();", G604);
		G604.click();
		Atc.click();
		
	}
	
	public void addingproductsinastro() throws InterruptedException
	{
		driver.switchTo().window(tabs1.get(4));
		ac.moveToElement(astroproducts).perform();
		ac.moveToElement(astroheadsets).click().build().perform();
		js.executeScript("arguments[0].scrollIntoView();", astropro);
		astropro.click();
		Select sc = new Select(dropdown);
		sc.selectByIndex(3);
		wb.until(ExpectedConditions.visibilityOf(astroatc));
		astroatc.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}
	
	public void addingproductsinjaybird() throws InterruptedException
	{
		driver.switchTo().window(tabs1.get(2));
		ac.moveToElement(jayshop).perform();
		ac.moveToElement(jayvista).click().build().perform();
		js.executeScript("arguments[0].scrollIntoView();", jayatc);
		jayatc.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}
	
	public void addingproductsinue() throws InterruptedException
	{
		driver.switchTo().window(tabs1.get(3));
		ueharmburger.click();
		ac.moveToElement(uemegablast).click().build().perform();
		uebuynow.click();
		Thread.sleep(10000);
		ueatc1.click();
		Thread.sleep(10000);
		driver.navigate().back();
		
	}
	
	public void addingproductsinlogi() throws InterruptedException
	{
		driver.switchTo().window(tabs1.get(1));
		wb.until(ExpectedConditions.visibilityOf(logipopclose));
		logipopclose.click();
		ac.moveToElement(logipro).moveToElement(logimice).click().build().perform();
		logimx.click();
		Thread.sleep(3000);
		logibuy.click();
		Thread.sleep(3000);
		logiatc.click();
		driver.navigate().back();
	}
	
}
