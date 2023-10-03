package rw.ac.rca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise4 {
    public  static void main(String[] args) throws IOException {
        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in)
        );
        int number = Integer.parseInt(bfn.readLine());
        int factNumbers = 1;
        for (int i = 1; i <= number  ; i++) {
            factNumbers = factNumbers * i;
            if (number ==1 || number == 0){
                factNumbers = 1;
            }
        }
        System.out.println("The factorial of "+ number +" is " + factNumbers );
    }
}
