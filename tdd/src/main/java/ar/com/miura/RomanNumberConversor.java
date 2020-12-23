package ar.com.miura;

public class RomanNumberConversor {
    public RomanNumberConversor() {
    }

    public Object convert(int integer) {
        StringBuilder stringBuilder = new StringBuilder();

        for(Numeral numeral:Numeral.values()) {
            while (integer >=numeral.getArabic()) {
                stringBuilder.append(numeral.getRoman());
                integer -= numeral.getArabic();
            }
        }
        return stringBuilder.toString();
    }
}
