package com.assignmentwebdriver;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import org.junit.Test;

public class Prog11 
{
	@Test
    public void testAssertEquals() 
	{
        String expected = "Hello";
        String actual = "Hello";
        assertEquals(expected, actual);
    }

    @Test
    public void testAssertArrayEquals() 
    {
        int[] expected = {1, 2, 3, 4};
        int[] actual = {1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAssertTrue() 
    {
        assertTrue(5 > 3);
    }

    @Test
    public void testAssertFalse() 
    {
        assertFalse(1 < 2);
    }

    @Test
    public void testAssertNull() 
    {
        String str = null;
        assertNull(str);
    }

    @Test
    public void testAssertNotNull() 
    {
        String str = "Hello";
        assertNotNull(str);
    }

    @Test
    public void testAssertSame() 
    {
        Integer num1 = 5;
        Integer num2 = num1;
        assertSame(num1, num2);
    }

    @Test
    public void testAssertNotSame() 
    {
        Integer num1 = new Integer(5);
        Integer num2 = new Integer(5);
        assertNotSame(num1, num2);
    }
}

