package ar.com.miura;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class FizzBuzzTest {

    @Test
    public void fizzBuzzConvertNormalNumbersAlone() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void fizzBuzzMultipleOfThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzMultipleOfFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void fizzBuzzBothCases() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

}
