package xpath;

public class AllXpath 
{
	  // amazon
	public static final String signin = "//*[text() = 'Hello, sign in']";
	public static final String uid = "//*[@id=\"ap_email\"]";
	public static final String cntbtn = "//*[@id=\"continue\"]";
	public static final String err1 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";
	public static final String pwd = "//*[@id=\"ap_password\"]";
	public static final String submit = "//*[@id=\"signInSubmit\"]";
	public static final String err2 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";

	// facebook
	public static final String fuid = "//*[@id=\"email\"]";
	public static final String fpwd = "//*[@id=\"pass\"]";
	public static final String fbtn = "//*[@type = 'submit']";
}
