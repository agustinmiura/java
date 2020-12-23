package ar.com.miura;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumbersTestCase {

    @Test
    public void testOne() {
        RomanNumberConversor conversor = new RomanNumberConversor();
        assertThat(conversor.convert(1), is("I"));
        assertThat(conversor.convert(2), is("II"));
        assertThat(conversor.convert(3), is("III"));
        assertThat(conversor.convert(4), is("IV"));
        assertThat(conversor.convert(5), is("V"));
        assertThat(conversor.convert(7), is("VII"));
        assertThat(conversor.convert(8), is("VIII"));
        assertThat(conversor.convert(9), is("IX"));
        assertThat(conversor.convert(10), is("X"));

    }

}
