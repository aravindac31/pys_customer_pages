package Login;

import org.openqa.selenium.By;

public class usernameandpassword {

	private String textlocator = "//*[@test='%s']";
	
	public static String formatXpath(String xpath , String value) {
		return String.format(xpath, value);
		
	}
	
	public void username() {
		By emailornumb = By.xpath("//*[@text='Enter Email or mobile number']");
	}
	public void password() {
		By pswrd = By.xpath("//*[@text='Password']");
	}
	public void loginbtn() {
		By loginbtn = By.xpath("//*[@text='Login']");				
	}
	
	//forgot password
	public void forgotpswrd() {
		By fgtpwd = By.xpath("//*[@text='Forgot Password?']");
	}
	public void regmail() {
	By regdmail = By.xpath("//*[@text='Email or Mobile Number']");
	}
	public void send() { 
	By snd = By.xpath("//*[@text='Send']");
	}
	public void newpwrd() {
	By newpwrd = By.xpath("//*[@text='Your new password']");
	}
	public void cnfrmpwd() {
	By cnfrmpwd = By.xpath("//*[@text='Re-enter your password']");
	}
	public void otp() {
	By onetp = By.xpath("//*[@text='Enter Your otp']");
	}
	public void sbmt() {
	By sbmit = By.xpath("//*[@text='Submit']");
	}
	
	//register customer 
	
	public void fullname() {
	By flname = By.xpath("//*[@text='Full name']");
	}
	public void mobnumb() {
	By mobno = By.xpath("//*[@text='Mobile Number']");
	}
	public void pwd() {
	By pd =	By.xpath("//*[@text='Password']");	
	}
	public void cnfmpwd() {
	By cnfirmpwd =  By.xpath("//*[@text='Confirm password']");	
	}
}

