

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators;

public class adactin extends Baseclass {
	public static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
    browserlaunch();
      System.out.println("Beforeclass......");
		
	}
	@AfterClass
    public static void afterclass() {
quits();
System.out.println("after.......");
	}
	@Before
	public void before() {
//Date d=new Date();
System.out.println("test start"+new Date());
System.out.println("Before.......");
	}
	
	@After
	public void after() {
System.out.println("test ends"+new Date());
System.out.println("After.......");
	}
	
	@Test
	 public void test1() {
		urllaunch("https://adactinhotelapp.com/");
		wait(20);
		login l=new login();
		//sendkeys(l.getname(),"irine")
		sendkeys(l.getName(), "steffydeva");
		sendkeys(l.getPassword(), "123456");
		clicks(l.getLogin());
	}
	
	@Test
	public void test2() {
      // geturl();
       login l=new login();
       //  WebElement loc = l.getLocation();

         Select s1=new Select (l.getLocation());
         s1.selectByIndex(5);
         
         Select s2=new Select(l.getHotel());
         s2.selectByValue("Hotel Creek");
         
         Select s3=new Select(l.getRoomtype());
         s3.selectByVisibleText("Super Deluxe");
         
         Select s4= new Select(l.getNumrooms());
         s4.selectByValue("1");
         
         //for date we need to enter by user so send keys
         
         sendkeys(l.getCheckin(), "06/01/2022");
         sendkeys(l.getCheckout(), "10/01/2022");
         
         Select s5=new Select(l.getAdultroom());
         s5.selectByValue("1");
         
         Select s6=new Select(l.getChildroom());
         s6.selectByValue("0");
         
         clicks(l.getSearch());
     System.out.println("test2");      
	}
	
	@Test
	public  void test3() {
  //  geturl();
	selectlogin sl=new selectlogin();
	clicks(sl.getRadiobutton());
	clicks(sl.getSubmit());
	System.out.println("test3");
		
	}
	
	@Test
	public  void test4() {
//geturl();
selectlogin sl1=new selectlogin();
     sendkeys(sl1.getFname(), "irine");
     sendkeys(sl1.getLname(), "deva");
     sendkeys(sl1.getAddress(), "No123,kk nagar");
     sendkeys(sl1.getCreditcard(), "1112 2223 3334 4445");
     Select s =new Select(sl1.getType());
     s.selectByValue("VISA");
     Select s2=new Select(sl1.getExpirymonth());
     s2.selectByValue("12");
     Select s3 = new Select(sl1.getExpiryyear());
     s3.selectByValue("2022");
     sendkeys(sl1.getCcv(), "111");
     clicks(sl1.getBooknow());
     System.out.println("test4.....");
     
	}
	
	
	@Test
	public  void test5() {
		//geturl();
     selectlogin i=new selectlogin();
selectlogin on=new selectlogin();
//String nos = i.getOrderno().getAttribute("value");
System.out.println(i.getOrderno().getAttribute("value"));
System.out.println("test5");
}
}
