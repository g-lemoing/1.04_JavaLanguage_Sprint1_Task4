package nivell1.exercise3.com.modules;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalsTest {

    @DisplayName("Accedir a posició 5 d'un array de longitud 2 dispara ArrayIndexOutOfBoundsException.")
    @Test
    void checkThrowsExpectedException() {
        Capitals arr = new Capitals();
        ArrayIndexOutOfBoundsException exception =
                assertThrows(ArrayIndexOutOfBoundsException.class, () ->{
                    arr.getElemByPos(4);
                });
        String expectedMsg = "Accés a la posició fora dels limits de l'array.";
        String actualMsg = exception.getMessage();
        assertEquals(actualMsg, expectedMsg);
    }
}