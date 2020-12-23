package ar.com.miura;


import org.junit.jupiter.api.Test;

public class ActualFizzBuzzTest {

    @Test
    public void outoutHundredFizzBuzzes() {
        FizzBuzzConvertor converter = new FizzBuzzConvertor();
        for(int i=0;i<100;i++) {
            System.out.println(converter.convert(i));
        }
    }
}
