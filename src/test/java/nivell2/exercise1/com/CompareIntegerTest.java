package nivell2.exercise1.com;
import java.lang.Integer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CompareIntegerTest {
    @DisplayName("Assertion que el valor de dos objectes sencers és igual, i un altra que son diferents. ")
    @Test
    void isEqual() {
        Integer n1 = 5;
        Integer n2 = 5;
        Integer n3 = 7;

        assertThat(n1.equals(n2));
        assertThat(n1.equals(n3));
    }
}