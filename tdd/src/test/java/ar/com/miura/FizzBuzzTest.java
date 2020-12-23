package ar.com.miura;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 *
 */
public class FizzBuzzTest {

    @Test
    public void fizzBuzzConvertNormalNumbersAlone() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertThat(fizzBuzz.convert(1), is("1"));
        assertThat(fizzBuzz.convert(2), is("2"));
    }

    @Test
    public void fizzBuzzMultipleOfThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertThat(fizzBuzz.convert(3), is("Fizz"));
    }

    @Test
    public void fizzBuzzMultipleOfFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertThat(fizzBuzz.convert(5), is("Buzz"));
    }

    @Test
    public void fizzBuzzBothCases() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertThat(fizzBuzz.convert(15), is("FizzBuzz"));
    }

}
