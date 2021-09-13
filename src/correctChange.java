import java.util.Scanner;

public class correctChange {

    public static void main(String[] args) {

        int dollar, dollarRemain, quarter, quarterRemain, dime, dimeRemain, nickel, nickelRemain, penny;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents:");
        int cents = scan.nextInt();

        dollar = cents / 100;
        dollarRemain = cents % 100;
        quarter = dollarRemain / 25;
        quarterRemain = dollarRemain % 25;
        dime = quarterRemain / 10;
        dimeRemain = quarterRemain % 10;
        nickel = dimeRemain / 5;
        nickelRemain = dimeRemain % 5;
        penny = nickelRemain / 1;

        System.out.println("You have " + dollar + " dollars, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, " + penny + " pennies.");

    }
}
