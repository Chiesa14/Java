package rw.ac.rca;

import java.util.Scanner;

public class Equations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of C: ");
        double c= scanner.nextDouble();
        SolveEquation(a,b,c);
    }
    public static void SolveEquation(double a, double b, double c){
        double deltaSquared = (b*b)-(4*a*c);
        double delta = Math.sqrt(deltaSquared);
        if (deltaSquared < 0 ) {
            System.out.println("The equation has no factors");
        }
        else {

            double x1 = (-(b) + delta) / (2 * a);
            double x2 = (-(b) - delta) / (2 * a);

            System.out.println("The roots of the equation are: " + x1 + " and " + x2);
        }
    }
}
