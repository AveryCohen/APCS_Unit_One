import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Decimal number? ");
        double unrounded = scan.nextDouble();
        double rounded = (double)(unrounded + 0.05);
        System.out.println(unrounded + " rounded to the nearest tenth is " + String.format("%.01f", rounded));

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
