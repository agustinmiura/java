package ar.com.miura;

public enum Numeral {

    TEN(10, "X"),
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV"),
    ONE(1, "I");

    private final int arabic;
    private final String roman;

    Numeral(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }

    public int getArabic() {
        return arabic;
    }

    public String getRoman(){
        return roman;
    }


}
