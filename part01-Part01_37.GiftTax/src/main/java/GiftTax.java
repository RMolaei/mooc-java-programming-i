
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double giftValue = Double.valueOf(scr.nextLine());
        double taxAtTheLowerLimit;
        double taxRateForExceedingPart;
        double giftExceedingPart;
        double taxValue;
        if (1000000 <= giftValue) {
            taxAtTheLowerLimit = 142100;
            taxRateForExceedingPart = 0.17;
            giftExceedingPart = giftValue - 1000000;
        } else if (200000 <= giftValue && giftValue < 1000000) {
            taxAtTheLowerLimit = 22100;
            taxRateForExceedingPart = 0.15;
            giftExceedingPart = giftValue - 200000;
        } else if (55000 <= giftValue && giftValue < 200000) {
            taxAtTheLowerLimit = 4700;
            taxRateForExceedingPart = 0.12;
            giftExceedingPart = giftValue - 55000;
        } else if (25000 <= giftValue && giftValue < 55000) {
            taxAtTheLowerLimit = 1700;
            taxRateForExceedingPart = 0.10;
            giftExceedingPart = giftValue - 25000;
        } else if (5000 <= giftValue && giftValue < 25000) {
            taxAtTheLowerLimit = 100;
            taxRateForExceedingPart = 0.08;
            giftExceedingPart = giftValue - 5000;
        } else {
            taxAtTheLowerLimit = 0;
            taxRateForExceedingPart = 0;
            giftExceedingPart = 0;
        }
        taxValue = taxAtTheLowerLimit + (taxRateForExceedingPart * giftExceedingPart);
        if (taxValue == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + taxValue);
        }
    }
}
