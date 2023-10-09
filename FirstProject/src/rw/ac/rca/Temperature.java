package rw.ac.rca;

import java.util.Scanner;

public class Temperature {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celsius degrees: ");
        double tempInC = scanner.nextDouble();
        double tempInF = (tempInC*((double) 9 /5)) + 32;

        System.out.println(tempInC + " Celsius are : " + tempInF + " Fahrenheit ");
    }
}
