
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scr.nextLine());
            if (luku == -1) {
                break;
            }
            
            numbers.add(luku);
        }
        
        for (int index = 0; index < numbers.size(); index++) {
            System.out.println(numbers.get(index));
        }
    }
}
