

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends Baseclass {

	public login() {
		PageFactory.initElements(driver, this);
}

	@FindBy(id="username")
    private WebElement name;
	
	@FindBy(id="password")
	private WebElement password;
	
    @FindBy(id="login")	
    private WebElement login;
    
    @FindBy(name="location")
    private WebElement location;
    
    @FindBy(name="hotels")
    private WebElement hotel;
    
    @FindBy(name="room_type")
    private WebElement roomtype;
    
    @FindBy(name="room_nos")
	private WebElement numrooms;
    
    @FindBy(name="datepick_in")
    private WebElement checkin;
    
    @FindBy(name="datepick_out")
    private WebElement checkout;
    
    @FindBy(name="adult_room")
    private WebElement adultroom;
    
    @FindBy(name="child_room")
    private WebElement childroom;
    
    @FindBy(name="Submit")
    private WebElement search;
    
    
public WebElement getName() {
	return name;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getNumrooms() {
	return numrooms;
}

public WebElement getCheckin() {
	return checkin;
}

public WebElement getCheckout() {
	return checkout;
}

public WebElement getAdultroom() {
	return adultroom;
}

public WebElement getChildroom() {
	return childroom;
}

public WebElement getSearch() {
	return search;
}

}