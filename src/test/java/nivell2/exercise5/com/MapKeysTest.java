package nivell2.exercise5.com;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

public class MapKeysTest {
    @DisplayName("Comprovar que el map conté una de les claus prèviament afegides.")
    @Test
    public void checkAddedKey(){
        MapKeys mapa = new MapKeys();
        String[][] elem = new String[][]{{"key1", "Value1"}, {"key2", "Value2"}, {"key3", "Value3"}};
        for (int i = 0; i < 3; i++) {
                mapa.addKey(elem[i][0], elem[i][1]);
        }
        assertThat(mapa.getMapa()).containsKey("key2");
    }
}