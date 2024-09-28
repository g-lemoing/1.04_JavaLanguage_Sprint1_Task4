package nivell1.exercise2.com.modules;

public class CalculoDni {
    static char calcLetraDni(int dniNr){
        final char[] LETTER_DNI_ARR = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return LETTER_DNI_ARR[dniNr % 23];
    }

    public static void main(String[] args){
        System.out.println("La lletra del DNI 43717143 és: " + calcLetraDni(43717143));
    }
}
