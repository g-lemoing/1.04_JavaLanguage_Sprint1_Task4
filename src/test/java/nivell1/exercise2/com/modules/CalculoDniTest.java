package nivell1.exercise2.com.modules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({
            "43717143, 'P'",
            "12345678, 'Z'",
            "23456789, 'D'",
            "34567890, 'V'",
            "45678901, 'G'",
            "56789012, 'B'",
            "67890123, 'B'",
            "78901234, 'X'",
            "52084337, 'D'",
            "35083964, 'V'"
    })
    void calcLetraDni(int dniNr, char letter) {
        assertEquals(letter, CalculoDni.calcLetraDni(dniNr));
    }
}