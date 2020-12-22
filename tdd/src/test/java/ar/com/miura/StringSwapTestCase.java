package ar.com.miura;

import org.junit.Assert;
import org.junit.Test;

public class StringSwapTestCase {

    StringSwapper stringSwapper = new StringSwapper();

    @Test
    public void test() {
        Assert.assertEquals("BA", stringSwapper.swap("AB"));
    }

    @Test
    public void testWith4Chars() {
        Assert.assertEquals("ABDC", stringSwapper.swap("ABCD"));
    }

    @Test
    public void testWith10Chars() {
        Assert.assertEquals("ABCDEFGHJI", stringSwapper.swap("ABCDEFGHIJ"));
    }

    @Test
    public void testWithEmpty() {
        Assert.assertEquals("", stringSwapper.swap(""));
    }

    @Test
    public void testWith1Char() {
        Assert.assertEquals("A", stringSwapper.swap("A"));
    }

}
