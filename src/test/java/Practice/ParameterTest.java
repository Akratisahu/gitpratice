package Practice;

import org.testng.annotations.Test;
public class ParameterTest {
	@Test
	public void test() {
		String Url=System.getProperty("url");//same u can pass in parameter which is present in left side
		String Env=System.getProperty("Env");
		String browser=System.getProperty("browser");
		String Username=System.getProperty("username");
		String Password=System.getProperty("Password");
		System.out.println(Url);
		System.out.println(Env);
		System.out.println(browser);
		System.out.println(Username);
		System.out.println(Password);
	}
}
