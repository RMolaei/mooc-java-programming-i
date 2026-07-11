
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.print("Give two indices to swap:");
        int indexA = Integer.valueOf(scr.nextLine());
        int indexB = Integer.valueOf(scr.nextLine());
        int valueB = array[indexB];
        array[indexB] = array[indexA];
        array[indexA] = valueB;

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
