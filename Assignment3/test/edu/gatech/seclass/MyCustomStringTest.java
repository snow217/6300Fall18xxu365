package edu.gatech.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Junit test class created for use in Georgia Tech CS6300.
 *
 * This is an test class for a simple class that represents a string, defined
 * as a sequence of characters.
 *
 * You should implement your tests in this class.  Do not change the test names.
 */

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    //Test Purpose: This is the first instructor example test.
    @Test
    public void testCountDuplicates1() {
        mycustomstring.setString("People are sleeping... Zzz.");
        assertEquals(4, mycustomstring.countDuplicates());
    }

    @Test
    public void testCountDuplicates2() {
        mycustomstring.setString("");
        assertEquals(0, mycustomstring.countDuplicates());
    }

    @Test
    public void testCountDuplicates3() {
        mycustomstring.setString("Billy has 111 apples");
        assertEquals(4, mycustomstring.countDuplicates());
    }

    @Test
    public void testCountDuplicates4() {
       mycustomstring.setString("        ");
       assertEquals(7, mycustomstring.countDuplicates());
    }

    @Test
    public void testCountDuplicates5() {
        //mycustomstring.setString(null);
        assertEquals(0, mycustomstring.countDuplicates());
    }

    @Test
    public void testCountDuplicates6() {
        mycustomstring.setString("%@&!^#(!!&$)**!)*");
        assertEquals(2, mycustomstring.countDuplicates());
    }

    //Test Purpose: This is the second instructor example test.
    @Test
    public void testAddDigits1() {
        mycustomstring.setString("1234!!! H3y, l3t'5 put 50me d161ts in this 5tr1n6!11!1");
        assertEquals("5678!!! H7y, l7t'9 put 94me d505ts in this 9tr5n0!55!5", mycustomstring.addDigits(4, true));
    }

    //Test Purpose: This the third instructor example test.
    @Test
    public void testAddDigits2() {
        mycustomstring.setString("1234!!! H3y, l3t'5 put 50me d161ts in this 5tr1n6!11!1");
        assertEquals("7890!!! H9y, l9t'1 put 16me d727ts in this 1tr7n2!77!7", mycustomstring.addDigits(4, false));
    }

    @Test
    public void testAddDigits3() {
        mycustomstring.setString("hello 90, bye 2");
        assertEquals("hello 78, bye 0", mycustomstring.addDigits(2, false));
    }

    @Test(expected = NullPointerException.class)
    public void testAddDigits4() {
        mycustomstring.setString(null);
        assertEquals(NullPointerException.class, mycustomstring.addDigits(4, false));
    }

    @Test
    public void testAddDigits5() {
        mycustomstring.setString("");
        assertEquals("", mycustomstring.addDigits(2, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDigits6() {
        mycustomstring.setString("This is when n > 9");
        assertEquals(IllegalArgumentException.class, mycustomstring.addDigits(15, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDigits7() {
        mycustomstring.setString("This is when n <= 0");
        assertEquals(IllegalArgumentException.class, mycustomstring.addDigits(-4, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDigits8() {
        mycustomstring.setString("This is when n <= 0");
        assertEquals(IllegalArgumentException.class, mycustomstring.addDigits(0, true));
    }

    @Test
    public void testAddDigits9() {
        mycustomstring.setString("      123      ");
        assertEquals("      901      ", mycustomstring.addDigits(8, true));
    }

    @Test
    public void testAddDigits10() {
        mycustomstring.setString("Yes, 12 apples + 3 bananas");
        assertEquals("Yes, 89 apples + 0 bananas", mycustomstring.addDigits(3, false));
    }

    @Test
    public void testAddDigits11() {
        mycustomstring.setString("94759302764638");
        assertEquals("83648291653527", mycustomstring.addDigits(9, true));
    }

    @Test
    public void testAddDigits12() {
        mycustomstring.setString("94759302764638");
        assertEquals("83648291653527", mycustomstring.addDigits(1, false));
    }

    //Test Purpose: This is the fourth instructor example test.
    @Test
    public void testFlipLetttersInSubstring1() {
        mycustomstring.setString("H3y, l3t'5 put 50me D161ts in this 5tr1n6!11!!");
        mycustomstring.flipLetttersInSubstring(18, 30);
        assertEquals("H3y, l3t'5 put 50ni s161tD em this 5tr1n6!11!!", mycustomstring.getString());
    }
/**
    //Test Purpose: This is an instructor example test to demonstrate testing for an exception.
    @Test(expected = NullPointerException.class)
    public void testFlipLetttersInSubstring2() {
        mycustomstring.flipLetttersInSubstring(200, 100);
    }

    @Test
    public void testFlipLetttersInSubstring3() { 
        fail("Not yet implemented");
    }

    @Test
    public void testFlipLetttersInSubstring4() {
        
        fail("Not yet implemented");
    }

    @Test
    public void testFlipLetttersInSubstring5() {
        
        fail("Not yet implemented");
    }

    @Test
    public void testFlipLetttersInSubstring6() {
        
        fail("Not yet implemented");
    }

    @Test
    public void testFlipLetttersInSubstring7() {
        
        fail("Not yet implemented");
    }

    @Test
    public void testFlipLetttersInSubstring8() {
        
        fail("Not yet implemented");
    }

    @Test
    public void testFlipLetttersInSubstring9() {
        
        fail("Not yet implemented");
    }

    @Test
    public void testFlipLetttersInSubstring10() {
        
        fail("Not yet implemented");
    }
    **/
}
