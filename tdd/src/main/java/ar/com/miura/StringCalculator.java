package ar.com.miura;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {
    public String add(String s) {
        return String.valueOf(Arrays.stream(s.split(",")).filter( x -> validInteger(x)).map(x -> Integer.parseInt(x)).reduce(0, (a,b)-> a+b));
    }

    private boolean validInteger(String string) {
        Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(string).matches();
    }
}


