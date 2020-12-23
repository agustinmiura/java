package ar.com.miura;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumbersTestCase {

    @Test
    public void testOne() {
        RomanNumberConversor conversor = new RomanNumberConversor();
        assertThat(conversor.convert(1), is("I"));
    }

}
