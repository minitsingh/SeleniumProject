package pac1;

import org.testng.annotations.Test;

public class ConatctTest {
	
	@Test
	public void createConatctTest()
	{
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("execute conatct test");
	}
	@Test
	public void modifyConatctTest()
	{
		System.out.println("execute modifyConatctTest");
	}
	
	@Test
	public void deleteConatctTest()
	{
		System.out.println("execute deleteConatctTest");
	}


}
