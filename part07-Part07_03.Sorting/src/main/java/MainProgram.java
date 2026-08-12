
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        // write your code here
        int index = 0;
        int min = array[index];
        index++;
        while (index < array.length) {
            if (min > array[index]) {
                min = array[index];
            }
            index++;
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int index = 0;
        int min = array[index];
        int minIndex = index;
        index++;
        while (index < array.length) {
            if (min > array[index]) {
                min = array[index];
                minIndex = index;
            }
            index++;
        }
        return minIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // write your code here
        int index = startIndex;
        int min = array[index];
        int minIndex = index;
        index++;
        while (index < array.length) {
            if (min > array[index]) {
                min = array[index];
                minIndex = index;
            }
            index++;
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        if (0 <= index1 && index1 < array.length && 0 <= index2 && index2 < array.length && index1 != index2) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void sort(int[] array) {
        // write your code here
        for (int index = 0; index < array.length; index++) {
            swap(array, index, indexOfSmallestFrom(array, index));
        }
    }

}
