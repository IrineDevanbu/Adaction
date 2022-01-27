

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectlogin extends Baseclass{
	
	public selectlogin () {
		PageFactory.initElements(driver , this);
}

	@FindBy(name="radiobutton_0")
    private WebElement radiobutton;
    
    @FindBy(name="continue")
    private WebElement submit;

    
   @FindBy(name="first_name")
   private WebElement fname;
   
   @FindBy(name="last_name")
   private WebElement lname;
   
   @FindBy(name="address")
   private WebElement address;
   
   @FindBy(name="cc_num")
   private WebElement creditcard;
   
   @FindBy(name="cc_type")
   private WebElement type;
   
   @FindBy(id="cc_exp_month")
   private WebElement expirymonth;
   
   @FindBy(id="cc_exp_year")
   private WebElement expiryyear;
   
   @FindBy(name="cc_cvv")
   private WebElement ccv;
   
   @FindBy(id="book_now")
   private WebElement booknow;
   
   @FindBy(name="order_no")
   private WebElement orderno;
   
   @FindBy(name="search_hotel")
   private WebElement searchhotel;

   public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getSearchhotel() {
		return searchhotel;
	}
	   

	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
