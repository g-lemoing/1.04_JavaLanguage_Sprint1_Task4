package nivell2.exercise3.com;

import java.util.Arrays;
import java.util.Objects;

public class ArrCompare {

    int[] arr;

    public ArrCompare(int[] arr){
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrCompare that = (ArrCompare) o;
        return Objects.deepEquals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    public static void main(String[] args){
        System.out.println("Creem un array arr1 = [1,2,3,4,5]");
        System.out.println("Creem un array arr2 = [1,2,3,4,5]");

        ArrCompare arr1 = new ArrCompare(new int[]{1, 2, 3, 4, 5});
        ArrCompare arr2 = new ArrCompare(new int[]{1, 2, 3, 4, 5});

        System.out.println("Son arr1 i arr2 iguals? " + arr1.equals(arr2));
    }
}
