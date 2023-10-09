package rw.ac.rca;

import java.util.Scanner;

public class SwapNumbers {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int num1= scanner.nextInt();
        System.out.println("Input the second number: ");
        int num2= scanner.nextInt();

        int swapp = num1;
        num1 = num2;
        num2 = swapp;

        System.out.println("After swapping the First number is :"+ num1);
        System.out.println("After swapping the Second number is :"+ num2);
    }
}
