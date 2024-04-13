import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive() {
    }

    public void testNegative() {
    }

    public void testMixed() {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = -10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 8;

        SelectionSort sorter = new SelectionSort();
        System.out.println("Original Array (Mixed): " + java.util.Arrays.toString(arr));
        int[] result = sorter.basicSelectionSort(arr);
        System.out.println("Sorted Array (Mixed): " + java.util.Arrays.toString(result));
        System.out.println("Expected Sorted Array (Mixed): " + java.util.Arrays.toString(Sortedarr));
        assertArrayEquals(Sortedarr, result);
    }

    public void testDuplicates() {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 5;
        arr[4] = 9;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 5;
        Sortedarr[2] = 5;
        Sortedarr[3] = 8;
        Sortedarr[4] = 9;

        SelectionSort sorter = new SelectionSort();
        System.out.println("Original Array (Duplicates): " + java.util.Arrays.toString(arr));
        int[] result = sorter.basicSelectionSort(arr);
        System.out.println("Sorted Array (Duplicates): " + java.util.Arrays.toString(result));
        System.out.println("Expected Sorted Array (Duplicates): " + java.util.Arrays.toString(Sortedarr));
        assertArrayEquals(Sortedarr, result);
    }
}
