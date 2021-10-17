package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

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

   
}

