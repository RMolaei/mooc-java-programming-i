
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] intArray = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(intArray));
        System.out.println("void sort(int[] array)");
        sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("");
        //
        String[] strArray = {"Ji", "Md", "Lo", "Hr", "Qb", "Xc", "Xa"};
        System.out.println(Arrays.toString(strArray));
        System.out.println("void sort(String[] array)");
        sort(strArray);
        System.out.println(Arrays.toString(strArray));
        System.out.println("");
        //
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(5);
        integers.add(99);
        integers.add(3);
        integers.add(12);
        System.out.println(integers);
        System.out.println("void sortIntegers(ArrayList<Integer> integers)");
        sortIntegers(integers);
        System.out.println(integers);
        System.out.println("");
        //
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Ji");
        strings.add("Md");
        strings.add("Lo");
        strings.add("Hr");
        strings.add("Qb");
        strings.add("Xc");
        strings.add("Xa");
        System.out.println(strings);
        System.out.println("void sortStrings(ArrayList<String> strings)");
        sortStrings(strings);
        System.out.println(strings);
        System.out.println("");
        //
    }

    public static void sort(int[] array) {
        // sorts an array of integers.
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        // sorts an array of strings.
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        // sorts a list of integers.
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        // sorts a list of strings.
        Collections.sort(strings);
    }

}
