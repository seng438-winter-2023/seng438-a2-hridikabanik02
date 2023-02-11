**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  16   |
| -------------- | --- |
| Student Names: |     |
|Hridika Banik                |     |
|Radia Jannat                |     |
|Syed Mohammed Abbas Kazmi
|MD Shaherier Khan    |

# 1 Introduction

The objective of this task is to understand  the fundamentals of automated unit testing, with a specific emphasis on testing according to the specifications for each unit. JUnit, which is a component of the XUnit framework family, is the most widely utilised unit testing framework for Java. After finishing this laboratory, we aim to possess the ability to develop automated test code utilising JUnit and other XUnit testing frameworks such as NUnit and integrate and utilise mock objects in the creation of test code.


# 2 Detailed description of unit test strategy

Initially we decided to go over the methods and plan out the steps we need to create the test cases in an efficient way. We started by understanding the functionality of the methods in the Range class by dividing into teams of two and discussing the possible tests. Following this, we analysed the methods in the DataUtilities calls and carried out the same steps as mentioned previously. These were very crucial steps in our plan as it gave us a deep understanding of the concepts in Unit testing.


We then discussed the possible equivalence classes for each method and designed tests to verify the expected functionality. This was done by understanding the domain of the parameters and identifying the classes with similar behaviours to avoid creating duplicate tests . We then discussed the different types of parameter types we can use and designed tests for the inputs from all the possible partitions based on the positive and negative numbers. For the Range class, we discussed all the possible range types including [positive, positive], [negative, negative], and [negative, positive] along with infinity inputs. We designed the equivalence classes for the DataUtilities using positive and negative numbers. 

Following this, we did a boundary value analysis for each of the methods and designed a test to validate the functionality of the program. These testing methods allowed us to cover the entire domain of the methods and formulate the edge cases for the methods.

Throughout this process, we developed our knowledge of Unit testing and understood the importance of black box testing. Mocking allows us to eliminate dependence on external resources or components by isolating the testing unit of code. It also provides us with better test coverage and a more reliable test suite. However, mocking makes the tests more complex, especially if you have a lot of dependencies or need to mock many different objects. Mocking also makes it difficult to catch certain types of bugs or edge cases.


# 3 Test cases developed
Range.class

There were five methods tested for this class:

Tests for method contains():
public void TestContainsInt(): Tests if an expected value that is an integer exists between a Range that was initialized as a double.
Strategy: Equivalence Class
 
public void TestContainsDouble(): Tests if an expected value that is a double exists between a Range that was initialized as a double.
Strategy: Equivalence Class

public void TestContainsUpperBound(): Tests if the upper bound value exists between the initialized Range.
Strategy: Boundary Value Analysis

public void TestContainsLowerBound(): Tests if the lower bound value exists between the initialized Range.
Strategy: Boundary Value Analysis

public void TestContainsLessThanLowerBound(): Tests if a value lower than the lower bound value exists between the initialized Range.
Strategy: Equivalence Class

public void TestContainsMoreThanUpperBound(): Tests if a value higher than the upper bound value exists between the initialized Range.
Strategy: Equivalence Class

public void TestContainsPInfinity(): Tests if positive infinity value exists between the initialized Range.
Strategy: Equivalence Class

public void TestContainsNInfinity(): Tests if negative infinity value exists between the initialized Range.
Strategy: Equivalence Class

Tests for method getLength():

public void TestgetLengthNtoP() : Tests getLength() method for values which ranges from negative value to positive value. 
E.g. Range(-2.0, 1.0)
Strategy: Equivalence Class

public void TestgetLengthNtoN(): Tests getLength() method for values which ranges from negative value to negative value.
E.g. Range(-5,-1)
Strategy: Equivalence Class

public void TestgetLengthPtoP(): Tests getLength() method for values which ranges from positive value to positive value.
E.g. Range(5.0,10.0)
Strategy: Equivalence Class

Tests for method constrain():
public void TestgetConstrainWithinRangeDouble(): Tests what is the nearest value returned if an expected value that is a double exists between a Range that was initialized as a double.
Strategy: Equivalence Class

public void TestgetConstrainWithinRangeInt(): Tests what is the nearest value returned if an expected value that is an integer exists between a Range that was initialized as a double.
Strategy: Equivalence Class

public void TestgetConstrainLowerBound(): Tests what is the nearest value returned if the lower bound value from the Range is input.
Strategy: Boundary Value Analysis

public void TestgetConstrainUpperBound(): Tests what is the nearest value returned if the upper bound value from the Range is input.
Strategy: Boundary Value Analysis

public void TestgetConstrainLessLowerBound(): Tests what is the nearest value returned if a value lesser than the lower bound from the Range is input.
Strategy: Equivalence Class

public void TestgetConstrainGreaterUpperBound(): Tests what is the nearest value returned if a value higher than the upper bound from the Range is input.
Strategy: Equivalence Class

public void TestgetConstrainPInfinity(): Tests what is the nearest value returned if a positive infinity value is input.
Strategy: Equivalence Class

public void TestgetConstrainNInfinity(): Tests what is the nearest value returned if a negative infinity value is input.
Strategy: Equivalence Class

Tests for method getUpperBound():
public void TestgetPUpperBound() : Tests getUpperBound() method for positive upper bound value. 
E.g. Range(-2,1) where 1 is a positive upper bound value.
Strategy: Boundary Value Analysis

public void TestgetNUpperBound() : Tests getUpperBound() method for negative upper bound value. 
E.g. Range(-5,-1) where -1 is a negative upper bound value.
Strategy: Boundary Value Analysis

Tests for method getLowerBound():
public void TestgetNLowerbound() : Tests getLowerBound() for a negative lower bound value.
E.g. Range(-2.0,-1.0), where -1 is the negative lower bound value.
Strategy: Boundary Value Analysis

public void TestgetPLowerbound(): Tests getLowerBound() for a positive lower bound value.
E.g. Range(5.0,10.0) where 5.0 is a positive lower bound value.
Strategy: Boundary Value Analysis



DataUtilities.class

There were five methods tested for this class:

Tests for method calculateColumnTotal():
public void test1CalculateColumnTotal(): This will return the total of the column whose values have been set using mock, where all the values in the rows are positive numbers.
Strategy: Equivalence Class

public void test2CalculateColumnTotalNegPos(): This will return the total of the column whose values have been set using mock, where negative and positive numbers have been used in the rows.
Strategy: Equivalence Class

public void test3CalculateColumnTotalTwoNeg(): This will return the total of the column whose values have been set using mock, where all the values in the rows are negative numbers.
Strategy: Equivalence Class

public void test4CalculateColumnTotalZeroRows(): Tests what column total value is returned if the number of rows have been set to 0 and rows have still been set with valid values using mock.
Strategy: Equivalence Class

public void test5CalculateColumnTotalNegativeRow(): Tests what column total value is returned if the number of rows have been set to -1 and rows have still been set with valid values using mock.
Strategy: Equivalence Class

public void testCalculateColumnTotalNull(): This is a test for the exception that will be thrown if invalid data is input while calling the calculateColumnTotal() method. The invalid data input is null.
Strategy: Category-Partition Testing 

Tests for method calculateRowTotal():
public void test1CalculateRowTotal(): This will return the total of the row whose values have been set using mock, where all the values in the columns are positive numbers.
Strategy: Equivalence Class

public void test2CalculateRowTotalNegPosValue(): This will return the total of the row whose values have been set using mock, where negative and positive numbers have been used in the columns.
Strategy: Equivalence Class

public void test3CalculateRowTotalTwoNegValue(): This will return the total of the row whose values have been set using mock, where all the values in the columns are negative numbers.
Strategy: Equivalence Class

public void test4CalculateRowTotalZeroCol(): Tests what row total value is returned if the number of columns have been set to 0 and columns have still been set with valid values using mock.
Strategy: Equivalence Class

public void test5CalculateRowTotalNegCol(): Tests what row total value is returned if the number of columns have been set to -1 and columns have still been set with valid values using mock.
Strategy: Equivalence Class

public void testCalculateRowTotalNull(): This is a test for the exception that will be thrown if invalid data is input while calling the calculateRowTotal() method. The invalid data input is null.
Strategy: Category-Partition Testing

Tests for method createNumberArray():
public void Test1CreateNumberArray(): Tests whether the created Number array from the method is equal to the expected Number array.
Strategy: Equivalence Class

public void Test2CreateNumberArrayOneElement(): Tests whether the created Number array (initialised with 1 element) from the method is equal to the expected Number array.
E.g. {1.0}
Strategy: Equivalence Class

public void Test3CreateNumberArrayNegValues(): Tests whether the created Number array (consisting of all negative values) from the method is equal to the expected Number array.
E.g. {-1.0,-2.0,-3.0}
Strategy: Equivalence Class

public void testCreateNumberArray1DNull(): This is a test for the exception that will be thrown if no data is input while calling the createNumberArray() method. The data input is a null array.
Strategy: Category-Partition Testing.

Test for method createNumberArray2D():
public void TestCreateNumberArray2D() : Tests createNumberArray2D() method to check whether the created Number array from the method is equal to the expected Number array.
Strategy: Equivalence Class.

public void Test2CreateNumberArray2DOneELement() : Tests whether the created Number array (initialised with 1 element) from the method is equal to the expected Number array.
E.g. {{1.0},{4.0}}
Strategy: Equivalence Class.

public void Test3CreateNumberArray2DNegELement() : Tests whether the created Number array consisting of negative values from the method is equal to the expected Number array.
E.g. A 2D Array : {{-1.0,-2.0,-3.0},{-4.0,-5.0,-6.0}}
Strategy: Equivalence Class.

public void testCreateNumberArray2DNull(): This is a test for the exception that will be thrown if no data is input(NULL) while calling the createNumber2DArray() method. The invalid data input is a null array.
E.g. Values2D values = null
Strategy: Category Partition.

Test for method getCumulativePercentages():
public void TestgetCumulativePercentages(): Tests getCumulativePercentages() method for the cumulative percentage of the key and value entered.
Strategy: Equivalence Class.

public void TestgetCumulativePercentages_withNegativeValue() : Tests getCumulativePercentages() for negative values.
E.g. An input of -9 is given to one of the values to test if the cumulative percentage returned is accurate.
Strategy: Equivalence Class.

public void TestgetCumulativePercentages_final_is_one(): Tests getCumulativePercentages() for a final value of 1 to check if the calculation is correct.
E.g. The final value returned from index 3 is set to 1 in the source code.
Strategy: Boundary Value Analysis.
 
public void TestgetCumulativePercentages_throwing_Exception(): Tests getCumulativePercentages() for null values of getKey and getValues .
E.g.  All null values were assigned to getValue and getKeys.
Strategy: Category-Partition Testing.


# 4 How the team work/effort was divided and managed

Throughout the assignment, we ensured that all the team members understood the methods and the Unit tests. We utilised the pair-programming methodology to carry out the planning and implementation of the tests. Both the groups designed tests for the required methods and later discussed the results of the tests. This allowed us to understand our mistakes and develop the most optimal tests. We worked together and explained concepts to each other throughout the course of this assignment. This was highly beneficial to us and allowed us to complete the lab successfully. 

# 5 Difficulties encountered, challenges overcome, and lessons learned

Initially, it was hard to understand the concept of mockery and how to use it. In the initial phase, we dedicated time to grasping the concept and familiarising ourselves with the syntax. Once we had a common understanding, we moved on to testing and distinguishing between boundary value analysis and equivalence class analysis. Despite the obstacles, we were able to successfully implement all tests through pair testing in two groups. The practical experience gained from this lab emphasised the importance of being able to differentiate between various types of analysis in black box testing.


# 6 Comments/feedback on the lab itself

The TA had a very structural way in assessing our skills in Junit. The lab documentation had very helpful references that were used to understand several concepts.

