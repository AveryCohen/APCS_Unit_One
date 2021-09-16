import java.util.Scanner;

public class AverageRounded {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter three positive decimal numbers:");
        total += scan.nextDouble();
        total += scan.nextDouble();
        total += scan.nextDouble();
        double unroundedAverage = total / 3;
        int average = (int)(unroundedAverage + 0.5);
        System.out.println("Average = " + average);





    }
}
