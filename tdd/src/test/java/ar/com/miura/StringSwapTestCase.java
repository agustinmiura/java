package ar.com.miura;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringSwapTestCase {

    StringSwapper stringSwapper = new StringSwapper();

    @Test
    public void test() {
        assertThat(stringSwapper.swap("AB"), is("BA"));
    }

    @Test
    public void testWith4Chars() {
        assertThat(stringSwapper.swap("ABDC"), is("ABCD"));
    }

    @Test
    public void testWith10Chars() {
        assertThat(stringSwapper.swap("ABCDEFGHJI"), is("ABCDEFGHIJ"));
    }

    @Test
    public void testWithEmpty() {
        assertThat(stringSwapper.swap(""), is(""));
    }

    @Test
    public void testWith1Char() {
        assertThat(stringSwapper.swap("A"), is("A"));
    }

}
