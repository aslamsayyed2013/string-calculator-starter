package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
/*
    @Test
    void emptyString() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void singleNumber() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void DoubleNumber() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    @Test
    void moreThanOneNumber() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add1("1,2,3"));
    }
    @Test
    void newLine() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
    @Test
    public void negativeInputException() throws Exception{
    	String.add("-1,2");
    }
*/
	@Test
	   public void testEmptyString() {
	       assertEquals(0, StringCalculator.add(""));
	   }

	   @Test
	   public void testOneNumber() {
	       assertEquals(1, StringCalculator.add("1"));
	   }

	   @Test
	   public void testTwoNumbers(){
	       assertEquals(3, StringCalculator.add("1,2"));
	   }

	   @Test
	    public void testThreeNumbers(){
	       assertEquals(6, StringCalculator.add("1,2,3"));
	    }

	    @Test
	    public void testNewLine(){
	       assertEquals(6, StringCalculator.add("1\n2,3"));
	    }

	    @Test
	    public void testNegativeNumver(){
	       try {
	           StringCalculator.add("-1,2");
	       }
	       catch (IllegalArgumentException e){
	           assertEquals(e.getMessage(), "Negatives not allowed: -1");
	       }

	       try {
	           StringCalculator.add("2,-4,3,-5");
	       }
	       catch (IllegalArgumentException e){
	           assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
	       }
	    }

	    @Test
	    public void testOverThousand(){
	       assertEquals(2, StringCalculator.add("1000,2"));
	    }

	    @Test
	    public void testOtherDelimiter(){
	       assertEquals(3, StringCalculator.add("//;\n1;2"));
	    }
   
}

