package rw.ac.rca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise3 {
    public  static int sum(int a, int b){
        return  a+b;
    }
    public  static  void main(String[] args) throws IOException {
        BufferedReader bfn = new  BufferedReader(
                new InputStreamReader(System.in)
        );
        int num1 = Integer.parseInt(bfn.readLine());
        int num2 = Integer.parseInt(bfn.readLine());

        System.out.println("The sum of "+ num1 + " and " + num2 + " is " + sum(num1, num2));
    }
}
