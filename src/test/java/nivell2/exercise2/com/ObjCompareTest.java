package nivell2.exercise2.com;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ObjCompareTest {
    @DisplayName("Assertion que la referència de dos objectes és la mateixa, i de dos altres diferent")
    @Test
    void isEqual(){
        ObjCompare obj1 = new ObjCompare();
        ObjCompare obj2 = new ObjCompare();
        ObjCompare obj3 = obj1;
        assertThat(obj1).isSameAs(obj3);
        assertThat(obj1).isNotSameAs(obj2);
    }
}