package test;

import static org.junit.Assert.*;				
import org.junit.Test;

public class TestString {
    @Test		
    public void testAssert(){					
        		
        //Variable declaration		
        String string1="USICT";					
        String string2="USICT";					
        String string3="GGSIPU";					
        String string4="GGSIPU";					
        String string5=null;					
        int variable1=-1;					
        int	variable2=2;					
        int[] Array1 = { 100, 200, 300 };					
        int[] Array2 = { 100, 200, 300 };					
        		
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(Array1, Array2);					
    }		
}	

