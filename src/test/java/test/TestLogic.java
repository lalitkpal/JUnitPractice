package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax()
	{
		//assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
		assertEquals(3,Calculation.findMax(new int[]{1,3,4,2}));

		
	}
}
