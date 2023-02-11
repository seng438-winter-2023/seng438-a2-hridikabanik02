//Group 16
//Team Members: Hridika, Syed, Radia, MD


package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
	private Range exampleRange;
    private Range exampleRange2;
    private Range exampleRange3;
    private Range exampleRange4;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-2.0, 1.0);
    	exampleRange2 = new Range(-5,-1);
    	exampleRange3 = new Range(-5.0,10.0);
    	exampleRange4= new Range(5.0,10.0);;
    	
    }


    @Test
    public void centralValueShouldBeZero() {
        assertEquals("The central value of -2 and 1 should be -0.5",
        -0.5, exampleRange.getCentralValue(), .000000001d);
    }
    
  
   // Test for Negative to Positive range  
    @Test
    public void TestgetLengthNtoP() {
    	
        assertEquals("The Length value of -2 and 1 should be 3",
        3.0, exampleRange.getLength(), .000000001d);
    }
    
 // Test for Negative to Negative range  
    @Test
    public void TestgetLengthNtoN() {
    	
        assertEquals("The Length value of -5 and -1 should be 3",
        4.0, exampleRange2.getLength(), .000000001d);
        
        
    }
    
    // Test for Positive to Positive range  
    @Test
    public void TestgetLengthPtoP() {
    	
        assertEquals("The Length value of 5.0 and 10.0 should be 5",
        5.0, exampleRange4.getLength(), .000000001d);
        
        
    }
    
 
    
   
    // Tests for positive upper bound.
    
    @Test
    public void TestgetPUpperBound() {
    	
        assertEquals("The Upper value of -2 and 1 should be 1",
        1.0, exampleRange.getUpperBound(), .000000001d);
    }
    
    // Test for negative upper bound  
    
    @Test
    public void TestgetNUpperBound() {
    	
        assertEquals("The Upper value of -5 and -1  should be -1",
        -1.0, exampleRange2.getUpperBound(), .000000001d);
    }
    
    
    
    // Tests for negative lower bound
    @Test
    public void TestgetNLowerbound() {
    	
    	
    	
        assertEquals("The LowerBound value of -2 and 1 should be -2.0",
        -2.0, exampleRange.getLowerBound(), .000000001d);
    

    }
    
    
    // Tests for positive lower bound
    @Test
    public void TestgetPLowerbound() {
    	
    	
    	
        assertEquals("The LowerBound value of 5.0 and 10.0 should be 5.0",
        5.0, exampleRange4.getLowerBound(), .000000001d);
    

    }
    
    
    
    
    
    // Test for contain 
    
    // Test for within range (integer)
    @Test 
    public void TestContainsInt() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(0));
    	
    }
    
 // Test for within range (integer)
    @Test 
    public void TestContainsDouble() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(0.5));
    	
    }
    
 // Test for upper bound
    @Test 
    public void TestContainsUpperBound() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(1));
    	
    }
    
 // Test for lower bound
    @Test 
    public void TestContainsLowerBound() {
    	
    	
    	assertTrue("The value 0 must be in the range in -2 and 1", exampleRange.contains(-2));
    	
    }

 // Test for less than lower bound
    @Test 
    public void TestContainsLessThanLowerBound() {
    	
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(-4));
    	
    }
    
 // Test for more than upper bound
    @Test 
    public void TestContainsMoreThanUpperBound() {
    	
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(4));
    	
    }
    
 // Test for Positive Infinity
    @Test 
    public void TestContainsPInfinity() {
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(Double.POSITIVE_INFINITY));
    	
    }
    
 // Test for Negative Infinity
    @Test 
    public void TestContainsNInfinity() {
    	
    	assertFalse("The value 0 must be in the range in -2 and 1", exampleRange.contains(Double.NEGATIVE_INFINITY));
    	
    }
    
    
    
    // Test for constrain
    // Test for within range(decimal)
    
    @Test
    public void TestgetConstrainWithinRangeDouble() {
    	
    	
    	
        assertEquals("The Constrain value of -2.0 is -2.0",
        -2.0, exampleRange3.constrain(-2.0), .01);
        
    

    }
    
 // Test for within range(integer)
    
    @Test
    public void TestgetConstrainWithinRangeInt() {
    	
    	
    	
        assertEquals("The Constrian value -2 is ",
        -6.0, exampleRange3.constrain(-2), .000000001d);
        
    

    }
    
 // Test Constrain for  lower bound value 
    
    @Test
    public void TestgetConstrainLowerBound() {
    	
    	
    	
        assertEquals("The Constrain value -5.0 is -5.0 ",
        -5.0, exampleRange3.constrain(-5.0), .000000001d);
        
    

    }
    
// Test Constrain for upper bound value
    
    @Test
    public void TestgetConstrainUpperBound() {
    	
    	
    	
        assertEquals("The Constrian value 10.0 is 10.0 ",
        10.0, exampleRange3.constrain(10.0), .000000001d);
        
    

    }
 
// Test less than lower bound 
    
    @Test
    public void TestgetConstrainLessLowerBound() {
    	
    	
    	
        assertEquals("The Constrian value -7.0 is -5.0 ",
        -5.0, exampleRange3.constrain(-7.0), .000000001d);
        
        
    

    }
    
// Test greater than upper bound 
    
    @Test
    public void TestgetConstrainGreaterUpperBound() {
    	
    	
    	
        assertEquals("The Constrian value 20.0 is 10.0 ",
        10.0, exampleRange3.constrain(20.0), .000000001d);
        
        
    

    }
    
// Test positive infinity
    
    @Test
    public void TestgetConstrainPInfinity() {
    	
    	
    	
        assertEquals("The Constrian value +infinity is 10.0 ",
        10.0, exampleRange3.constrain(Double.POSITIVE_INFINITY), .000000001d);
        
        
    

    }
    
// Test negative infinity
    
    @Test
    public void TestgetConstrainNInfinity() {
    	
    	
    	
        assertEquals("The Constrian value -infinity is -5.0 ",
        -5.0, exampleRange3.constrain(Double.NEGATIVE_INFINITY), .000000001d);
        
        
    

    }
 
    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
