package nivell2.exercise3.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ArrCompareTest {
    @DisplayName("Assertion que dos arrays son iguals")
    @Test
    void isArrEquals(){
        ArrCompare arr1 = new ArrCompare(new int[]{1, 2, 3, 4, 5});
        ArrCompare arr2 = new ArrCompare(new int[]{1, 2, 3, 4, 5});

        assertThat(arr1.getArr()).containsExactly(arr2.getArr());
    }
}