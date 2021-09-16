import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Decimal number? ");
        double unroundedNumber = scan.nextDouble();
        double roundedNumber = (double)(unroundedNumber + 0.05);
        System.out.println(unroundedNumber + " rounded to the nearest tenth is " + String.format("%.01f", roundedNumber));

        // Create a Scanner object

        // Prompt the user for a positive decimal number


        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/


        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5


    }
}
