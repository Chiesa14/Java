package rw.ac.rca;

import java.util.Scanner;

public class exercise5 {
    public  static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of the tree");
        int size = scanner.nextInt();
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                if ((col<= row) && row<size ){
                    System.out.print("*");
                }
                if ((row == size) && col==(size/2)){
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
