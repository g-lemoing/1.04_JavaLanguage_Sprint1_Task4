package nivell2.exercise7.com;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalObjTest {

    @DisplayName("Comprovar que un objeto Optional creado vacío es realmente vacío")
    @Test
    public void checkOptionalIsEmpty(){
        assertThat(Optional.empty()).isEmpty();
    }
}