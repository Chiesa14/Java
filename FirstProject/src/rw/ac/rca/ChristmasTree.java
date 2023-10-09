package rw.ac.rca;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Christmas tree: ");
        int length = scanner.nextInt();
        scanner.close();

        // Outer loop for the rows of the tree
        for (int i = 1; i <= length; i++) {
            // Print spaces to center-align the tree
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the tree branches
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Print the trunk of the tree
        for (int i = 1; i <= length - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
