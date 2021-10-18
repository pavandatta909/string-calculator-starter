package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_number_should_return_number_as_int(){
            StringCalculator stringCalculator = new StringCalculator();
			assertEquals(3, StringCalculator.add("1,2"));
    }
	
    @Test
    void string_with_negative_number_should_return_number_as_int(){
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

}
