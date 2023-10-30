package rw.ac.rca.quiz_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

class ThrowDemo {
    static void division() throws IOException{
        InputStream in = new FileInputStream("input.txt");
        int a = 0;
        int k = 5;
        int p = k / 5;
        System.out.println(p);
        throw new ArithmeticException("Division by zero");
    }

//    static void demoproc() {
//        try {
//            throw new NullPointerException("demo");
//        } catch (NullPointerException e) {
//            System.out.println("Caught inside demoproc");
//            throw e; // rethrow the exception
//        }
//    }

    public static void main(String[] args) {
//        try {
//            demoproc();
//        } catch (NullPointerException e) {
//            System.out.println("Recaught: " + e);
//        }
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

