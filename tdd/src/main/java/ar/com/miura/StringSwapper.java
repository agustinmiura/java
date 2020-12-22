package ar.com.miura;

public class StringSwapper {
    public String swap(String ab) {
        int lenght = ab.length();
        if (lenght>=2) {
            String minus2Chars = ab.substring(0, lenght-2);
            char secondLastChar = ab.charAt(lenght-2);
            char lastChar = ab.charAt(lenght-1);
            return minus2Chars + String.valueOf(lastChar) + String.valueOf(secondLastChar);
        } else {
            return ab;
        }

    }
}
