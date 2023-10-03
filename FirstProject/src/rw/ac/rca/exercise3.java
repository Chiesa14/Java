package rw.ac.rca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class exercise3 {
    public  static  void main(String[] args) throws IOException {
        BufferedReader bfn = new  BufferedReader(
                new InputStreamReader(System.in)
        );
        Scanner scanner= new Scanner(System.in);
        boolean continuation = false;


        do {
            int num1 = Integer.parseInt(bfn.readLine());
            int num2 = Integer.parseInt(bfn.readLine());
            System.out.println("The sum of " + num1 +" and " +num2 +" is " + (num1+num2));
            System.out.println("Continue the program(y/n)");
            String choice = scanner.nextLine();
            if (Objects.equals(choice, "y") || Objects.equals(choice, "Y")){
                continuation = true;
            }
            System.out.println("_________________");
        }while (continuation);
    }
}
