import java.util.Scanner;

public class FindTheAverage {

    public static void main(String[] args) {
        double total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four values.");
        System.out.print("Value 1: ");
        double valueOne = scan.nextDouble();
        total += valueOne;
        System.out.print("Value 2: ");
        double valueTwo = scan.nextDouble();
        total +=valueTwo;
        System.out.print("Value 3: ");
        double valueThree = scan.nextDouble();
        total += valueThree;
        System.out.print("Value 4: ");
        double valueFour = scan.nextDouble();
        total += valueFour;
        double average = total / 4.00;

        System.out.println("Average = " + average);






        // Create a Scanner object to get user input

        // Create a total variable to keep track of the total value

        // Get four pieces of user input

        // Calculate the average

        // Display the result


    }

}
