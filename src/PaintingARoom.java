import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number for the length of the room in feet:");
        int length = scan.nextInt();
        System.out.println("Please enter a whole number for the width of the room in feet:");
        int width = scan.nextInt();
        System.out.println("Please enter a whole number for the height of the room in feet:");
        int height = scan.nextInt();
        System.out.println("Please enter the number of windows the room has:");
        int windows = scan.nextInt();
        windows *= 10;
        System.out.println("Please enter the number of doors the room has:");
        int doors = scan.nextInt();
        doors *= 15;
        int wallsL = 2 * (length * height);
        int wallsW = 2 * (width * height);
        int ceiling = length * width;
        int surfaceArea = (wallsL + wallsW + ceiling) - windows - doors;
        double gallonsDouble = surfaceArea / 350.0;
        int gallonsInt = (int)(gallonsDouble + 0.999999999999999);
        System.out.println("For a room of " + surfaceArea + "square feet, you should buy " + gallonsInt + " gallons of paint.");




    }

}
