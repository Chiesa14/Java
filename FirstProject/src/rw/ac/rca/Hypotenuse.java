package rw.ac.rca;

public class Hypotenuse {
    public  static void main(String[] args){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                int squarredJ = j*j;
                int squarredI = i*i;
                int addedSquares = squarredI + squarredJ;
                double squareroot = Math.sqrt(addedSquares);
                int squarevalue = (int)squareroot;
                if (squareroot == squarevalue ) {
                    count++;
                    System.out.println( " Pair "+ count +" : " + "( " + i + " ,  "+ j + ")");
                }
            }
        }
    }
}
