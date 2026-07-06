
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        while (number > 0) {
            while (number > 1) {
                System.out.print("*");
                number--;
            }
            System.out.println("*");
            number--;
        }
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int index = size;
        while (index > 0) {
            printStars(size);
            index--;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int index = height;
        while (index > 0) {
            printStars(width);
            index--;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int index = 1; index <= size; index++) {
            printStars(index);
        }
    }
}
