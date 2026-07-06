
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number > 0) {
            while (number > 1) {
                System.out.print("*");
                number--;
            }
            System.out.println("*");
            number--;
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int index = 1;
        while (size > 0) {
            printSpaces(size - 1);
            printStars(index);
            size--;
            index++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int index = 1;
        while (height > 0) {
            printSpaces(height - 1);
            printStars(2 * index - 1);
            height--;
            index++;
        }
        printSpaces(index - 3);
        printStars(3);
        printSpaces(index - 3);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
