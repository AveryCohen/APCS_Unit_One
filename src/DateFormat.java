import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the current month?");
        String month = scan.nextLine();
        System.out.println("What is the current day of the week?");
        String dayW = scan.nextLine();
        System.out.println("What is the current year?");
        String year = scan.nextLine();
        System.out.println("What is the current day of the month?");
        String dayM = scan.nextLine();

        System.out.println("American Format:");
        System.out.println(dayW + ", " + month + " " + dayM + ", " + year);
        System.out.println("European Format:");
        System.out.println(dayW + ", " + dayM + " " + month + ", " + year);
    }






}
