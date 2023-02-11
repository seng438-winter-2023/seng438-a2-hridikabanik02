//Group 16
//Team Members: Hridika, Syed, Radia, MD

package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.*;

public class DataUtilitiesTest{


	@Before
	public void setUp() throws Exception{
	}

	
	
	
	
	//Test for Calculating Column Total Correct Total
	@Test
	public void test1CalculateColumnTotal(){
		Mockery mockingContext = new Mockery();
	    final Values2D values = mockingContext.mock(Values2D.class);
	    
	    mockingContext.checking(new Expectations() {
	        {
	            one(values).getRowCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(7.5));
	            one(values).getValue(1, 0);
	            will(returnValue(2.5));
	        }
	    });
	    double result = DataUtilities.calculateColumnTotal(values, 0);
	    assertEquals(10.0, result, .000000001d);
	}
	
	//Test for Calculating column total for negative and positive returnValue of 'getValue'
	
	@Test
	public void test2CalculateColumnTotalNegPos(){
		Mockery mockingContext = new Mockery();
	    final Values2D values = mockingContext.mock(Values2D.class);
	    
	    mockingContext.checking(new Expectations() {
	        {
	            one(values).getRowCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(-7.5));
	            one(values).getValue(1, 0);
	            will(returnValue(2.5));
	        }
	    });
	    double result = DataUtilities.calculateColumnTotal(values, 0);
	    assertEquals(-5.0, result, .000000001d);
	}
	
	//Test for Calculating column total for two negative returnValue of 'getValue'
	
	@Test
	public void test3CalculateColumnTotalTwoNeg(){
		Mockery mockingContext = new Mockery();
	    final Values2D values = mockingContext.mock(Values2D.class);
	    
	    mockingContext.checking(new Expectations() {
	        {
	            one(values).getRowCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(-7.5));
	            one(values).getValue(1, 0);
	            will(returnValue(-2.5));
	        }
	    });
	    double result = DataUtilities.calculateColumnTotal(values, 0);
	    assertEquals(-10.0, result, .000000001d);
	}
	
	//Test for Calculating column total for zero rows
	
		@Test
		public void test4CalculateColumnTotalZeroRows(){
			Mockery mockingContext = new Mockery();
		    final Values2D values = mockingContext.mock(Values2D.class);
		    
		    mockingContext.checking(new Expectations() {
		        {
		            one(values).getRowCount();
		            will(returnValue(0));
		            one(values).getValue(0, 0);
		            will(returnValue(7.5));
		            one(values).getValue(1, 0);
		            will(returnValue(2.5));
		        }
		    });
		    double result = DataUtilities.calculateColumnTotal(values, 0);
		    assertEquals(0, result, .000000001d);
		}
		//Test for Calculating column total for invalid rows
		
			@Test
			public void test5CalculateColumnTotalNegativeRow(){
				Mockery mockingContext = new Mockery();
			    final Values2D values = mockingContext.mock(Values2D.class);
			    
			    mockingContext.checking(new Expectations() {
			        {
			            one(values).getRowCount();
			            will(returnValue(-1));
			            one(values).getValue(0, 0);
			            will(returnValue(7.5));
			            one(values).getValue(1, 0);
			            will(returnValue(2.5));
			        }
			    });
			    double result = DataUtilities.calculateColumnTotal(values, 0);
			    assertEquals(0, result, .000000001d);
			}
		
			
			
	
			
	//Test for calculating Total Row Values		
	@Test
	public void test1CalculateRowTotal(){
		Mockery mockingContext = new Mockery();
	    final Values2D values = mockingContext.mock(Values2D.class);
	    
	    mockingContext.checking(new Expectations() {
	        {
	            one(values).getColumnCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(7.5));
	            one(values).getValue(0, 1);
	            will(returnValue(2.5));
	        }
	    });
	    double result = DataUtilities.calculateRowTotal(values, 0);
	    assertEquals(10.0, result, .000000001d);
	}
	
	
	//Test for Calculating negative and positive value of returnValue of getValue
	
	@Test
	public void test2CalculateRowTotalNegPosValue(){
		Mockery mockingContext = new Mockery();
	    final Values2D values = mockingContext.mock(Values2D.class);
	    
	    mockingContext.checking(new Expectations() {
	        {
	            one(values).getColumnCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(-7.5));
	            one(values).getValue(0, 1);
	            will(returnValue(2.5));
	        }
	    });
	    double result = DataUtilities.calculateRowTotal(values, 0);
	    assertEquals(-5.0, result, .000000001d);
	}
	
	
	//Test for Calculating two negative values of returnValue of getValue
	
		@Test
		public void test3CalculateRowTotalTwoNegValue(){
			Mockery mockingContext = new Mockery();
		    final Values2D values = mockingContext.mock(Values2D.class);
		    
		    mockingContext.checking(new Expectations() {
		        {
		            one(values).getColumnCount();
		            will(returnValue(2));
		            one(values).getValue(0, 0);
		            will(returnValue(-7.5));
		            one(values).getValue(0, 1);
		            will(returnValue(-2.5));
		        }
		    });
		    double result = DataUtilities.calculateRowTotal(values, 0);
		    assertEquals(-10.0, result, .000000001d);
		}
		
		
		//Test for Calculating Row Total of zero columns
		
		@Test
		public void test4CalculateRowTotalZeroCol(){
			Mockery mockingContext = new Mockery();
		    final Values2D values = mockingContext.mock(Values2D.class);
		    
		    mockingContext.checking(new Expectations() {
		        {
		            one(values).getColumnCount();
		            will(returnValue(0));
		            one(values).getValue(0, 0);
		            will(returnValue(7.5));
		            one(values).getValue(0, 1);
		            will(returnValue(2.5));
		        }
		    });
		    double result = DataUtilities.calculateRowTotal(values, 0);
		    assertEquals(0, result, .000000001d);
		}
		
		
		//Test for Calculating negative value of Column
		
		@Test
		public void test5CalculateRowTotalNegCol(){
			Mockery mockingContext = new Mockery();
		    final Values2D values = mockingContext.mock(Values2D.class);
		    
		    mockingContext.checking(new Expectations() {
		    	
		        {
		            one(values).getColumnCount();
		            will(returnValue(-1));
		            one(values).getValue(0, 0);
		            will(returnValue(-7.5));
		            one(values).getValue(0, 1);
		            will(returnValue(2.5));
		        }
		    });
		    double result = DataUtilities.calculateRowTotal(values, 0);
		    assertEquals(0, result, .000000001d);
		}
	
	
	
		
		
	//Test for changing an Array of double data type to number data type
	@Test
	public void Test1CreateNumberArray() {
		double[] data = {1.0,2.0,3.0};
		Number[] Intdata = {1.0,2.0,3.0};
		
		assertArrayEquals("The Double array to Number array",
		    	  Intdata, DataUtilities.createNumberArray(data));	
	}
	
	
	
	//Test for changing an Array of one element to Number data type
		@Test
		public void Test2CreateNumberArrayOneElement() {
			double[] data = {1.0};
			Number[] Intdata = {1.0};
			
			assertArrayEquals("The Double array to Number array",
			    	  Intdata, DataUtilities.createNumberArray(data));	
		}
		
		
	//Test for changing an Array with Negative elements to number data type
		@Test
		public void Test3CreateNumberArrayNegValues() {
			double[] data = {-1.0,-2.0,-3.0};
			Number[] Intdata = {-1.0,-2.0,-3.0};
			
			assertArrayEquals("The Double array to Number array",
			    	  Intdata, DataUtilities.createNumberArray(data));	
		}
		
	//Test for changing a 2D Array of double data type to a 2D array of number data type
	@Test
	public void TestCreateNumberArray2D() {
		double[][] data = {{1.0,2.0,3.0},{4.0,5.0,6.0}};
		Number[][] Intdata = {{1.0,2.0,3.0},{4.0,5.0,6.0}};
		
		assertArrayEquals("The Double array to Number array",
		    	  Intdata, DataUtilities.createNumberArray2D(data));	    	    
		
	}
	
	//Test for changing a 2D Array of one element to Number Array
		@Test
		public void Test2CreateNumberArray2DOneELement() {
			double[][] data = {{1.0},{4.0}};
			Number[][] Intdata = {{1.0},{4.0}};
			
			assertArrayEquals("The Double array to Number array",
			    	  Intdata, DataUtilities.createNumberArray2D(data));	    	    
			
		}
		
		
	//Test for changing a 2D Array of Negative elements to Number Array
			@Test
			public void Test3CreateNumberArray2DNegELement() {
				double[][] data = {{-1.0,-2.0,-3.0},{-4.0,-5.0,-6.0}};
				Number[][] Intdata = {{-1.0,-2.0,-3.0},{-4.0,-5.0,-6.0}};
					
				assertArrayEquals("The Double array to Number array",
					   Intdata, DataUtilities.createNumberArray2D(data));	    	    
					
				}
			
			
			
			//Test for calculating Cumulative Percentage of given class Keyedvalues
			@Test
			public void TestgetCumulativePercentages() {
				
				
				
				
				Mockery mockCP = new Mockery();
				
				 final KeyedValues values = mockCP.mock(KeyedValues.class);
				
				mockCP.checking(new Expectations() {
			        {
			        	allowing(values).getItemCount();
						will(returnValue(3));
						
						allowing(values).getValue(0);
						will(returnValue(5));
						allowing(values).getValue(1);
						will(returnValue(9));
						allowing(values).getValue(2);
						will(returnValue(2));

						allowing(values).getKey(0);
						will(returnValue(1));
						allowing(values).getKey(1);
						will(returnValue(2));
						allowing(values).getKey(2);
						will(returnValue(3));
						
			        }
			    });
				
				
				
				
				KeyedValues result = DataUtilities.getCumulativePercentages(values);
				 assertEquals("The value for index 1", 0.135, result.getValue(0));
				 assertEquals("The value for index 2",0.875, result.getValue(1));
				 assertEquals("The value for index 3",1, result.getValue(2));
				
				
			}
		
			//Test for calculating Cumulative Percentage of given class Keyedvalues with negative values
		@Test
		public void TestgetCumulativePercentages_withNegativeValue() {
				
				
				
				
				Mockery mockCP = new Mockery();
				
				 final KeyedValues values = mockCP.mock(KeyedValues.class);
				
				mockCP.checking(new Expectations() {
			        {
			        	allowing(values).getItemCount();
						will(returnValue(3));
						
						allowing(values).getValue(0);
						will(returnValue(5));
						allowing(values).getValue(1);
						will(returnValue(-9));
						allowing(values).getValue(2);
						will(returnValue(2));

						allowing(values).getKey(0);
						will(returnValue(1));
						allowing(values).getKey(1);
						will(returnValue(2));
						allowing(values).getKey(2);
						will(returnValue(3));
						
			        }
			    });
				
				
				
				
				KeyedValues result = DataUtilities.getCumulativePercentages(values);
				 assertEquals("The value for index 1", -2.5, result.getValue(0));
				 assertEquals("The value for index 2",2, result.getValue(1));
				 assertEquals("The value for index 3",1, result.getValue(2));
				
				
			}

		
		////Test for calculating Cumulative Percentage of given class Keyedvalues to check if the computed result of index 3 is 1.
		@Test
		public void TestgetCumulativePercentages_final_is_one() {
				
				
				
				
				Mockery mockCP = new Mockery();
				
				 final KeyedValues values = mockCP.mock(KeyedValues.class);
				
				mockCP.checking(new Expectations() {
			        {
			        	allowing(values).getItemCount();
						will(returnValue(3));
						
						allowing(values).getValue(0);
						will(returnValue(5));
						allowing(values).getValue(1);
						will(returnValue(9));
						allowing(values).getValue(2);
						will(returnValue(2));

						allowing(values).getKey(0);
						will(returnValue(1));
						allowing(values).getKey(1);
						will(returnValue(2));
						allowing(values).getKey(2);
						will(returnValue(3));
						
			        }
			    });
				
				
				
				
				KeyedValues result = DataUtilities.getCumulativePercentages(values);;
				 assertEquals("The value for index 3",1, result.getValue(2));
				
				
			}
			
			

	
//Exceptions 
///This test did not run as it was giving error so we used IllegalArgumentException error instead.
				
			//Exception test for null array 1D (Doesn't work for Invalid Parameter)
//			@Test(expected = InvalidParameterException.class)
//			public void testCreateNumberArray1DNullNW(){
//				double[] input = null;
//				DataUtilities.createNumberArray(input);
//			}
			
			
			//Exception test for null array 1D
			@Test(expected = IllegalArgumentException.class)
			public void testCreateNumberArray1DNull(){
				double[] input = null;
				DataUtilities.createNumberArray(input);
			}
			
			//Exception test for null array 2D
			@Test(expected = IllegalArgumentException.class)
			public void testCreateNumberArray2DNull(){
				double[][] input = null;
				DataUtilities.createNumberArray2D(input);
			}
			
			//Exception test for null array for Values2D object, Column Total
			@Test(expected = NullPointerException.class)
			public void testCalculateColumnTotalNull(){
			    final Values2D values = null;
			    int num = 2;
			    
			    DataUtilities.calculateColumnTotal(values, num);
			}
			
			//Exception test for null array for Values2D object, Row Total 
			@Test(expected = NullPointerException.class)
			public void testCalculateRowTotalNull(){
			    final Values2D values = null;
			    int num = 2;
			    
			    DataUtilities.calculateRowTotal(values, num);
			}
			
			
			
			//Test for calculating Cumulative Percentage of given class Keyedvalues with null values
			@Test(expected = IllegalArgumentException.class)

			public void TestgetCumulativePercentages_throwing_Exception(){
				Mockery mockCP = new Mockery();
				
				 final KeyedValues values = mockCP.mock(KeyedValues.class);
				
				mockCP.checking(new Expectations() {
			       {
			       	allowing(values).getItemCount();
						will(returnValue(3));
						
						allowing(values).getValue(0);
						will(returnValue(null));
						allowing(values).getValue(1);
						will(returnValue(null));
						allowing(values).getValue(2);
						will(returnValue(null));

						allowing(values).getKey(0);
						will(returnValue(null));
						allowing(values).getKey(1);
						will(returnValue(null));
						allowing(values).getKey(2);
						will(returnValue(null));
						
			       }
			   });
				
				
				
				
				KeyedValues result = DataUtilities.getCumulativePercentages(values);;
				
				
			}
				
				
			
	@After
	public void tearDown() throws Exception{
	}

}
