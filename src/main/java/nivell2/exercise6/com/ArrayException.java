package nivell2.exercise6.com;

public class ArrayException {
    private static final int[] arr = new int[]{23, 56, 14};

    public ArrayException(){}

    public static void printArr(int pos) throws ArrayIndexOutOfBoundsException{
        System.out.println(ArrayException.arr[pos]);
    }
}
