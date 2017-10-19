package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestPackage {

	@Test
	public void test() {
		
		assertEquals(7, add(4,3));		
		
		//fail("Not yet implemented");
	}

	int add(int x, int y) {
		return x+y;
	}
	
}
