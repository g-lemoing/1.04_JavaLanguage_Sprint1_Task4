package nivell2.exercise6.com;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatNoException;

public class ArrayExceptionTest {
    @DisplayName("Comprovar que se dispara la ArrayIndexOutOfBoundsException")
    @Test
    public void checkThrowException(){
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(()-> ArrayException.printArr(5));
        assertThatNoException().isThrownBy(()-> ArrayException.printArr(1));
    }
}