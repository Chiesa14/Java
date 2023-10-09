package rw.ac.rca;

import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a weekday number (1-7): ");
        int weekdayNumber = scanner.nextInt();
        scanner.close();

        String weekdayName;

        switch (weekdayNumber) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break;
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                weekdayName = "Invalid weekday number";
                break;
        }

        System.out.println("Weekday name: " + weekdayName);
    }
}
