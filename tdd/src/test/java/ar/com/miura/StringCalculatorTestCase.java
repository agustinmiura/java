package ar.com.miura;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalculatorTestCase {

    @Test
    public void testWhenEmpty() {
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add("");
        assertThat(result, is("0"));
    }

    @Test
    public void testWithOne() {
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add("1");
        assertThat(result, is("1"));
    }

    @Test
    public void testAddTwoNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add("1,2");
        assertThat(result, is("3"));
    }

    @Test
    public void testMultipleNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add("1,1,1,1,1,1,1,1");
        assertThat(result, is("8"));
    }

}
