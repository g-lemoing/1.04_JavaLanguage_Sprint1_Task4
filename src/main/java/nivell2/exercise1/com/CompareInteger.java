package nivell2.exercise1.com;
import java.lang.Integer;

import static java.lang.Integer.valueOf;

public class CompareInteger {

    public static boolean isEqual(Integer n1, Integer n2){
        return n1.equals(n2);
    }
    public static void main(String[] args){
        Integer number1 = 5;
        Integer number2 = 5;
        Integer number3 = 7;
        System.out.println("Els nombres " + number1 + " i " + number2 + " son iguals? " + number1.equals(number2));
        System.out.println("Els nombres " + number1 + " i " + number3 + " son iguals? " + number1.equals(number3));

    }
}
