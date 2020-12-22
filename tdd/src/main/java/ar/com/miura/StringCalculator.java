package ar.com.miura;

public class StringCalculator {
    public String add(String s) {
        if (s.isBlank() || s.isEmpty()) {
            return "0";
        } else if (s.length()==1){
            return s;
        } else {
            String[] splitted = s.split(",");
            return String.valueOf((Integer.parseInt(splitted[0]) + Integer.parseInt(splitted[1])));
        }
    }
}
