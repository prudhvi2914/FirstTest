package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class SnakeTest {
	Snake peter;
	Snake takis;

	@Before
	public void setUp() throws Exception {
		
		

		 peter = new Snake("Peter",10,"coffee");

		Snake takis = new Snake("Takis",80,"vegetables");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public boolean isHealthy() throws InterruptedException  {
		 
	Boolean healthyFood = takis.isHealthy();

	

		assertEquals(true, healthyFood);	
	
	}
//		
		
		
		
}
	
	

	@Test
	public void fitsInCage() throws InterruptedException  {
		
if (cagelength <= Snakelength || caselength >= Snakelength ) {
	
	retun true;
	
	
}else {
	
	
}
		
		
	}
	
	
}
